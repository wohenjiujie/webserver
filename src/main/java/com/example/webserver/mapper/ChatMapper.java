package com.example.webserver.mapper;

import com.example.webserver.bean.ChatInfo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

/**
 * Created by INvo
 * on 2020/1/8.
 * <p>
 * 直接操作数据库的底层实现接口
 */
public interface ChatMapper {

    /**
     * 插入数据库信息
     *
     * @param chatInfo
     */
    @Insert("insert into accounts (user,password) values (#{user},#{password})")
    void insertAccounts(ChatInfo chatInfo);

    @Select("select * from accounts ")
    void foreachAccounts();
}
