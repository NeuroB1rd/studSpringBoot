package com.example.demo.service;

import com.example.demo.model.FriendDTO;
import com.example.demo.model.FriendModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FriendMapper {
    //FriendModel toModel(FriendDTO dto);
    //FriendDTO toDto(FriendModel model);
}
