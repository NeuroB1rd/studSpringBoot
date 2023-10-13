package com.example.demo.controller;

import com.example.demo.model.FriendDTO;
import com.example.demo.model.FriendModel;
import com.example.demo.service.FriendConverter;
import com.example.demo.service.FriendMapper;
import com.example.demo.service.FriendService;
import com.example.demo.service.VocalCountService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
public class FriendController {
    private static final FriendConverter CONVENTER = new FriendConverter();

    @Autowired
    private final FriendService friendService;

    @Autowired
    private FriendMapper friendMapper;


    @PostMapping("/api/mapper/java/friends")
    String insert(@Valid @RequestBody FriendDTO fd)
    {
        return CONVENTER.toDTO(friendService.findMaxCharFriend(CONVENTER.toModel(fd))).toString();
    }

}
