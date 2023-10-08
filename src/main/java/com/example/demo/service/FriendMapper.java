package com.example.demo.service;

import com.example.demo.model.FriendDTO;
import com.example.demo.model.FriendModel;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

@Mapper(componentModel = "spring")
public abstract class FriendMapper {
    DateFormat df = new SimpleDateFormat("yyyy.dd.MM");
    @BeforeMapping
    protected void dateToModel(FriendDTO friendDTO, @MappingTarget FriendModel friendModel) throws ParseException {
        friendModel.setBirthDate(df.parse(friendDTO.getBirthDate()));
    }
    @Mapping(target = "birthDate",ignore = true)
    public abstract FriendModel toModel(FriendDTO dto) throws ParseException;
    public abstract FriendDTO toDto(FriendModel model);
}
