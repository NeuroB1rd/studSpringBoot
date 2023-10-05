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
    @Autowired
    private final FriendConverter fConv = FriendConverter.getFriendConv();

    @Autowired
    private final FriendService fFind;

    //@Autowired
    //private FriendMapper mapper;


    @PostMapping("/api/mapper/java/friends")
    String insert(@Valid @RequestBody FriendDTO fd)
    {

        return fConv.ModeltoDTO(fFind.findMaxCharFriend(fConv.DTOtoModel(fd))).toString();
    }

    @PostMapping("/api/mapper/mapstruct/friends")
    String insert(@Valid @RequestBody FriendModel fm)
    {


        return fm.toString();
    }
}
