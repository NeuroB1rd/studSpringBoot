package com.example.demo.service;

import com.example.demo.model.FriendDTO;
import com.example.demo.model.FriendModel;
import com.example.demo.model.VocalCountModel;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FriendConverter {
    DateFormat df = new SimpleDateFormat("yyyy.dd.MM");

    public FriendModel toModel(FriendDTO fd){
        String dateStr;
        FriendModel fmCl = new FriendModel();
        dateStr = fd.getBirthDate();
        try {
            fmCl.setId(fd.getId());
            fmCl.setName(fd.getName());
            fmCl.setEmail(fd.getEmail());
            fmCl.setFriends(fd.getFriends());
            fmCl.setBirthDate(df.parse(dateStr));

            return fmCl;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public FriendDTO toDTO(FriendModel fm){
        String dateStr;
        FriendDTO fdCl = new FriendDTO();
        dateStr = df.format(fm.getBirthDate());
        fdCl.setId(fm.getId());
        fdCl.setName(fm.getName());
        fdCl.setEmail(fm.getEmail());
        fdCl.setFriends(fm.getFriends());
        fdCl.setBirthDate(dateStr);

        return fdCl;
    }

}
