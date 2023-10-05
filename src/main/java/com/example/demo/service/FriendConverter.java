package com.example.demo.service;

import com.example.demo.model.FriendDTO;
import com.example.demo.model.FriendModel;
import com.example.demo.model.VocalCountModel;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
@Service
public class FriendConverter {
    private static FriendConverter FC;
    private String dateStr;
    private FriendModel fmCl = new FriendModel();
    private FriendDTO fdCl = new FriendDTO();
    DateFormat df = new SimpleDateFormat("yyyy.dd.MM");

    private FriendConverter() {

    }
    public static FriendConverter getFriendConv() {
        if (FC == null){
            FC = new FriendConverter();
        }
        return FC;
    }
    public FriendModel DTOtoModel(FriendDTO fd){
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

    public FriendDTO ModeltoDTO(FriendModel fm){
        dateStr = df.format(fm.getBirthDate());
        fdCl.setId(fm.getId());
        fdCl.setName(fm.getName());
        fdCl.setEmail(fm.getEmail());
        fdCl.setFriends(fm.getFriends());
        fdCl.setBirthDate(dateStr);

        return fdCl;
    }

}
