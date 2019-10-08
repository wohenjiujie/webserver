package com.example.webserver.service.impl;

import com.example.webserver.bean.TrackCounts;
import com.example.webserver.mapper.TrackMapper;
import com.example.webserver.service.TrackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by INvo
 * on 2019/10/6.
 */


//如果有一个类带了@Service注解，将自动注册到Spring容器
// 不需要再在applicationContext里面定义bean了

@Service("TrackService")
public class TrackServiceImpl implements TrackService {
    /*
     *Autowired:把配置好的Bean拿来用，完成属性、方法的组装
     * */

    @Autowired
    private TrackMapper trackMapper;

    @Override
    public List<TrackCounts> getInfoList() {
        return trackMapper.getInfoList();
    }

    @Override
    public int getTerminalIdCounts(Integer integer) {
        return trackMapper.getTerminalIdCounts(integer);
    }

    @Override
    public void addTerminalIdCounts(Integer tid, Integer counts) {
        trackMapper.addTerminalIdCounts(tid,counts);
    }

    /*@Override
    public TrackCounts addTerminalIdCounts(Integer integer) {
        return trackMapper.addTerminalIdCounts(integer);
    }*/

    /*@Override
    public int addTerminalIdCounts(TrackCounts trackCounts) {
        return trackMapper.addTerminalIdCounts(trackCounts);
    }*/

}
