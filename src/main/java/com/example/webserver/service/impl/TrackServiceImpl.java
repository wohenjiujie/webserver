package com.example.webserver.service.impl;

import com.example.webserver.bean.TrackCounts;
import com.example.webserver.bean.TrackID;
import com.example.webserver.bean.TrackInfo;
import com.example.webserver.mapper.TrackMapper;
import com.example.webserver.service.TrackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by INvo
 * on 2019/10/6.
 * 如果有一个类带了@Service注解，将自动注册到Spring容器
 * 不需要再在applicationContext里面定义bean了
 * 接口回调方法
 */
@Service("TrackService")
public class TrackServiceImpl implements TrackService {

    /*
     *Autowired:把配置好的Bean拿来用，完成属性、方法的组装
     * */
    @Autowired
    private TrackMapper trackMapper;

    @Override
    public int getTerminalIdCounts(Integer integer) {
        return trackMapper.getTerminalIdCounts(integer);
    }

    @Override
    public void increaseTerminalIdCounts(Integer tid, Integer counts) {
        trackMapper.increaseTerminalIdCounts(tid, counts);
    }

    @Override
    public void decreaseTerminalIdCounts(Integer tid, Integer counts) {
        trackMapper.decreaseTerminalIdCounts(tid, counts);
    }

    @Override
    public TrackCounts getTrackCounts(Integer integer) {
        return trackMapper.getTrackCounts(integer);
    }

    @Override
    public List<TrackID> getTrackID(Integer integer) {
        return trackMapper.getTrackID(integer);
    }

    @Override
    public void addTrack(TrackInfo trackInfo) {
        trackMapper.addTrack(trackInfo);
    }

    @Override
    public void deleteTrack(TrackInfo trackInfo) {
        trackMapper.deleteTrack(trackInfo);
    }

    @Override
    public void addTrackInfo(TrackInfo trackInfo) {
        trackMapper.addTrackInfo(trackInfo);
    }
    @Override
    public void deleteTrack1(Integer terminal,Integer track) {
        trackMapper.deleteTrack1(terminal,track);
    }
}
