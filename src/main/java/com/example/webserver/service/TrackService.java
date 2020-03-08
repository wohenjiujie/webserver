package com.example.webserver.service;

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
    List<TrackInfo> getTerminalInfo(Integer integer);

    List<TrackID> getTrackID(Integer integer);

    TrackInfo getTrackInfo(TrackInfo trackInfo);

    void addTrack(TrackInfo trackInfo);

    void deleteTrack(TrackInfo trackInfo);

    Integer getTerminalCounts(Integer integer);
}
