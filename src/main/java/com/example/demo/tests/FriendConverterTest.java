package com.example.demo.tests;

import com.example.demo.model.FriendDTO;
import com.example.demo.model.FriendMini;
import com.example.demo.model.FriendModel;
import com.example.demo.service.FriendConverter;
import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class FriendConverterTest {
    FriendConverter fc = FriendConverter.getFriendConv();
    DateFormat df = new SimpleDateFormat("yyyy.dd.MM");
    @Test
    public void DTOtoModel() throws ParseException {
        FriendMini mini0 = new FriendMini(0,"Lopez Dixon");
        FriendMini mini1 = new FriendMini(1,"Solomon Lewis");
        FriendMini mini2 = new FriendMini(2,"Bradley Jordan");

        List<FriendMini> lm = new ArrayList<>();
        lm.add(mini0);
        lm.add(mini1);
        lm.add(mini2);

        FriendDTO dto = new FriendDTO(345,"Curtis Russel","curtisrussell@otherside.com","2005.30.09",lm);

        FriendModel actual = new FriendModel(345,"Curtis Russel","curtisrussell@otherside.com",df.parse("2005.30.09"),lm);

        FriendModel expected = fc.DTOtoModel(dto);

        Assert.assertEquals(expected.getId(),actual.getId());
        Assert.assertEquals(expected.getName(),actual.getName());
        Assert.assertEquals(expected.getEmail(),actual.getEmail());
        Assert.assertEquals(expected.getBirthDate(),actual.getBirthDate());

        Assert.assertEquals(expected.getFriends().get(0).getId(),actual.getFriends().get(0).getId());
        Assert.assertEquals(expected.getFriends().get(0).getName(),actual.getFriends().get(0).getName());
        Assert.assertEquals(expected.getFriends().get(1).getId(),actual.getFriends().get(1).getId());
        Assert.assertEquals(expected.getFriends().get(1).getName(),actual.getFriends().get(1).getName());
        Assert.assertEquals(expected.getFriends().get(2).getId(),actual.getFriends().get(2).getId());
        Assert.assertEquals(expected.getFriends().get(2).getName(),actual.getFriends().get(2).getName());
    }

    @Test
    public void ModeltoDTO() throws ParseException {
        FriendMini mini0 = new FriendMini(0,"Lopez Dixon");
        FriendMini mini1 = new FriendMini(1,"Solomon Lewis");
        FriendMini mini2 = new FriendMini(2,"Bradley Jordan");

        List<FriendMini> lm = new ArrayList<>();
        lm.add(mini0);
        lm.add(mini1);
        lm.add(mini2);

        FriendDTO actual = new FriendDTO(345,"Curtis Russel","curtisrussell@otherside.com","2005.30.09",lm);

        FriendModel dto = new FriendModel(345,"Curtis Russel","curtisrussell@otherside.com",df.parse("2005.30.09"),lm);

        FriendDTO expected = fc.ModeltoDTO(dto);

        Assert.assertEquals(expected.getId(),actual.getId());
        Assert.assertEquals(expected.getName(),actual.getName());
        Assert.assertEquals(expected.getEmail(),actual.getEmail());
        Assert.assertEquals(expected.getBirthDate(),actual.getBirthDate());

        Assert.assertEquals(expected.getFriends().get(0).getId(),actual.getFriends().get(0).getId());
        Assert.assertEquals(expected.getFriends().get(0).getName(),actual.getFriends().get(0).getName());
        Assert.assertEquals(expected.getFriends().get(1).getId(),actual.getFriends().get(1).getId());
        Assert.assertEquals(expected.getFriends().get(1).getName(),actual.getFriends().get(1).getName());
        Assert.assertEquals(expected.getFriends().get(2).getId(),actual.getFriends().get(2).getId());
        Assert.assertEquals(expected.getFriends().get(2).getName(),actual.getFriends().get(2).getName());
    }
}
