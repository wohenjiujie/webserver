package com.example.webserver.web;

import com.example.webserver.bean.ChatInfo;
import com.example.webserver.service.ChatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by INvo
 * on 2020/1/8.
 * <p>
 * 与前端交互的主体
 */

@RestController
public class ChatController {

    @Autowired
    private ChatService chatService;

    @RequestMapping(value = "/addAccounts", method = RequestMethod.POST)
    public void addAccounts(@RequestBody ChatInfo chatInfo) {
        chatService.insertAccounts(chatInfo);
    }


}
