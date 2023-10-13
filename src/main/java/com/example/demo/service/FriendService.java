package com.example.demo.service;

import com.example.demo.model.FriendMini;
import com.example.demo.model.FriendModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FriendService {
    private static final Logger logger = LoggerFactory.getLogger(VocalCountService.class);
    private List<FriendMini> friend = new ArrayList<>();
    private FriendMini f = new FriendMini();
    private List<FriendMini> friends;

    public FriendModel findMaxCharFriend(FriendModel fm){
        int count = 0;
        int start = 0;
        String name;
        friends = fm.getFriends();
        for(FriendMini fmini : friends){
            count = fmini.getName().split(" ")[1].length();
            if(count > start){
                start = count;
                f = fmini;
            }
        }
        friend.add(f);
        fm.setFriends(friend);
        logger.info("Максимально длинное имя: " + f.getName());

        return fm;
    }
}
