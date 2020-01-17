package com.example.webserver.service;

import com.example.webserver.bean.ChatInfo;

/**
 * Created by INvo
 * on 2020/1/8.
 *
 * 接口类
 * 接口方法在controller层调用
 * 具体逻辑是在Impl里实现
 */
public interface ChatService {

    /**
     * 插入数据库信息
     *
     * @param chatInfo
     */
    void insertAccounts(ChatInfo chatInfo);
}
