package com.example.webserver.service.impl;

import com.example.webserver.bean.ChatInfo;
import com.example.webserver.mapper.ChatMapper;
import com.example.webserver.service.ChatService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by INvo
 * on 2020/1/8.
 *
 * 依赖注入Spring容器
 * 接口回调的方法
 */

@Service("ChatService")
public class ChatServiceImpl implements ChatService {
    @Autowired
    private ChatMapper chatMapper;

    /**
     * 插入数据库信息
     *
     * @param chatInfo
     */
    @Override
    public void insertAccounts(ChatInfo chatInfo) {
        chatMapper.insertAccounts(chatInfo);
    }
}
