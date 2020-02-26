package com.example.webserver.web;

import com.example.webserver.bean.JsonResult;
import com.example.webserver.bean.TrackCounts;
import com.example.webserver.bean.TrackID;
import com.example.webserver.bean.TrackInfo;
import com.example.webserver.service.TrackService;
import com.example.webserver.service.impl.TrackServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 查询counts：通过tid查询当前终端下的记录次数
     *
     * @param integer
     * @return
     */
    @GetMapping(value = "/searchCounts/{tid}")
    public int searchCounts(@PathVariable(value = "tid") Integer integer) {
        return trackService.getTerminalIdCounts(integer);
    }

    /**
     * 增加counts：通过tid增加当前终端下的记录次数
     *
     * @param integer
     */
    @GetMapping(value = "/increaseCounts/{tid}")
    public void increaseTerminalIdCounts(@PathVariable(value = "tid") Integer integer) {
        TrackCounts trackCounts = trackService.getTrackCounts(integer);
        trackService.increaseTerminalIdCounts(integer, (Integer) trackCounts.getCounts() + 1);
    }

    /**
     * 减少counts：通过tid减少当前终端下的记录次数
     *
     * @param integer
     */
    @GetMapping(value = "/decreaseCounts/{tid}")
    public void decreaseTerminalIdCounts(@PathVariable(value = "tid") Integer integer) {
        TrackCounts trackCounts = trackService.getTrackCounts(integer);
        trackService.decreaseTerminalIdCounts(integer, (Integer) trackCounts.getCounts() - 1);
    }

    /**
     * 查询track：通过terminal查询当前终端下的所有track
     *
     * @param integer
     * @return
     */

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

    /**
     * 添加track：通过terminal添加track
     *
     * @param trackInfo
     */
    @RequestMapping(value = "/addTrackInfo", method = RequestMethod.POST)
    public void addTrackID(@RequestBody TrackInfo trackInfo) {
        trackService.addTrack(trackInfo);
    }

    /**
     * 删除track：通过terminal删除track
     *
     * @param trackInfo
     */
    @RequestMapping(value = "/deleteTrackInfo", method = RequestMethod.POST)
    public void deleteTrackID(@RequestBody TrackInfo trackInfo) {
            trackService.deleteTrack(trackInfo);
    }

    @RequestMapping(value = "/getTrackInfo", method = RequestMethod.POST)
    public TrackInfo getTrackInfo(@RequestBody TrackInfo trackInfo) {
        return trackService.getTrackInfo(trackInfo);
    }


    /**
     * 查询trackInfo：通过terminalID查询该终端下的所有轨迹信息
     *
     * @param integer
     * @return
     */
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

    //    @RequestMapping(value = "/createTrackCounts/{tid}", method = RequestMethod.GET)
    @GetMapping(value = "/createTrackCounts/{tid}")
    public void createTrackCounts(@PathVariable(value = "tid") Integer tid) {
        trackService.createTrackCounts(tid, 0);
    }


    @RequestMapping(value = "/getTerminalCounts/{terminal}",method = RequestMethod.GET)
    public Integer getTerminalCounts( @PathVariable(value = "terminal") Integer integer) {
        return trackService.getTerminalCounts(integer);
    }
}
