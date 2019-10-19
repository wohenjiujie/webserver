package com.example.webserver.service;

import com.example.webserver.bean.TrackCounts;
import com.example.webserver.bean.TrackID;
import com.example.webserver.bean.TrackInfo;

import java.util.List;

/**
 * Created by INvo
 * on 2019/10/6.
 * 只写接口方法供controller调用
 * 具体逻辑写在InfoServiceImpl里面
 * 接口类
 */
public interface TrackService {

    /**
     * counts：返回整个trackCounts的封装类
     *
     * @param integer
     * @return
     */
    TrackCounts getTrackCounts(Integer integer);

    /**
     * 查询counts：通过tid查询当前终端下的记录次数
     *
     * @param integer
     * @return
     */
    int getTerminalIdCounts(Integer integer);

    /**
     * 增加counts：通过tid增加当前终端下的计数
     *
     * @param tid
     * @param counts
     */
    void increaseTerminalIdCounts(Integer tid, Integer counts);

    /**
     * 减少counts：通过tid减少当前终端下的计数
     *
     * @param tid
     * @param counts
     */
    void decreaseTerminalIdCounts(Integer tid, Integer counts);

    /**
     * 查询track：通过terminal查询当前终端下的所有track
     *
     * @param integer
     * @return
     */
    List<TrackID> getTrackID(Integer integer);

    /**
     * 添加track：通过terminal添加track
     *
     * @param trackInfo
     */
    void addTrack(TrackInfo trackInfo);

    /**
     * 删除track：通过terminal删除track
     *
     * @param trackInfo
     */
    void deleteTrack( TrackInfo trackInfo);

    void deleteTrack1(Integer terminal,Integer track);

    void addTrackInfo(TrackInfo trackInfo);
}
