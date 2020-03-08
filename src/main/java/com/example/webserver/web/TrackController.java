package com.example.webserver.web;

import com.example.webserver.bean.TrackID;
import com.example.webserver.bean.TrackInfo;
import com.example.webserver.service.TrackService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by INvo
 * on 2019/10/6.
 * 与Web交互的接口的部分
 */
@RestController
public class TrackController {
    @Autowired
    private TrackService trackService;

    @RequestMapping(value = "/searchTrackID/{terminal}", method = RequestMethod.GET)
    public List<TrackID> getTrackID(@PathVariable(value = "terminal") Integer integer) {
        try {
            List<TrackID> trackIDList = trackService.getTrackID(integer);
            return trackIDList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "/addTrackInfo", method = RequestMethod.POST)
    public void addTrackID(@RequestBody TrackInfo trackInfo) {
        trackService.addTrack(trackInfo);
    }

    @RequestMapping(value = "/deleteTrackInfo", method = RequestMethod.POST)
    public void deleteTrackID(@RequestBody TrackInfo trackInfo) {
        trackService.deleteTrack(trackInfo);
    }

    @RequestMapping(value = "/getTrackInfo", method = RequestMethod.POST)
    public TrackInfo getTrackInfo(@RequestBody TrackInfo trackInfo) {
        return trackService.getTrackInfo(trackInfo);
    }

    @RequestMapping(value = "/getTerminalInfo/{terminal}", method = RequestMethod.GET)
    public List<TrackInfo> getTerminalInfo(@PathVariable(value = "terminal") Integer integer) {
        try {
            List<TrackInfo> trackInfoList = trackService.getTerminalInfo(integer);
            return trackInfoList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping(value = "/getTerminalCounts/{terminal}", method = RequestMethod.GET)
    public Integer getTerminalCounts(@PathVariable(value = "terminal") Integer integer) {
        return trackService.getTerminalCounts(integer);
    }
}
