package com.example.webserver.service;

import com.example.webserver.bean.TrackCounts;

import java.util.List;

/**
 * Created by INvo
 * on 2019/10/6.
 */
public interface TrackService {
    /*
    * 只写接口方法供controller调用
    * 具体逻辑写在InfoServiceImpl里面。
    * */
    public List<TrackCounts> getInfoList();



    /**
     * 查询counts：通过tid查询当前终端下的记录次数--接口
     * @param integer
     * @return
     */
    int getTerminalIdCounts(Integer integer);


    /**
     * 增加counts：通过tid增加当前终端下的计数--接口
     */
//    TrackCounts addTerminalIdCounts(Integer integer);

//    int addTerminalIdCounts(TrackCounts trackCounts);

    void addTerminalIdCounts(Integer tid, Integer counts);
}
