package com.example.demo.controller;

import com.example.demo.model.FriendDTO;
import com.example.demo.model.FriendModel;
import com.example.demo.service.FriendConverter;
import com.example.demo.service.FriendMapper;
import com.example.demo.service.FriendService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@Validated
@RestController
@RequiredArgsConstructor
public class FriendMapstructController {

    @Autowired
    private final FriendService friendService;

    @Autowired
    private FriendMapper friendMapper;

    @PostMapping("/api/mapper/mapstruct/friends")
    String insert(@Valid @RequestBody FriendDTO fd) throws ParseException {
        return friendMapper.toDto(friendService.findMaxCharFriend(friendMapper.toModel(fd))).toString();
    }
}