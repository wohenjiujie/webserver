package com.example.webserver.web;

import com.example.webserver.bean.JsonResult;
import com.example.webserver.bean.TrackCounts;
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
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by INvo
 * on 2019/10/6.
 */
@RestController
public class TrackController {

    /*
     * 与web交互的接口的部分
     * */
    @Autowired
    private TrackService trackService;
    JdbcTemplate jdbcTemplate;


    /**
     * 查询counts：通过tid查询当前终端下的记录次数--Web交互
     *
     * @param integer
     * @return
     */
    @GetMapping(value = "searchCounts/{tid}")
    public int searchCounts(@PathVariable(value = "tid") Integer integer) {
//        TrackCounts trackCounts = trackService.getTerminalIdCounts(integer);
        return trackService.getTerminalIdCounts(integer);
        /*TrackCounts trackCounts = trackService.getTerminalIdCounts(integer);
        return trackCounts.getCounts();*/
    }

    /**
     * 查询列表
     *
     * @return
     */
    @RequestMapping(value = "all", method = RequestMethod.GET)
    public List<TrackCounts> getInfoList() {
        try {
            List<TrackCounts> trackCountsList = trackService.getInfoList();
            return trackCountsList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping(value = "addCounts/{tid}")
    public void addTerminalIdCounts(@PathVariable(value = "tid") Integer tid) {
        trackService.addTerminalIdCounts(tid,trackService.getTerminalIdCounts(tid) + 1);
//        trackService = null;
    }


//    @RequestMapping(value = "addCounts/{tid}" ,method = RequestMethod.PUT)
    /*public void addTerminalIdCounts(@PathVariable(value = "tid") Integer integer) {
        TrackCounts trackCounts = trackService.addTerminalIdCounts(integer);
        String sql = "update trackCounts set counts=?where tid="+integer;
        Object[] objects = new Object[]{
            integer,
                trackCounts.getCounts()+1
        };
        jdbcTemplate.update(sql, objects);
    }*/
    /*public String addTerminalIdCounts(@RequestBody TrackCounts trackCounts) {
//    public String addTerminalIdCounts(@PathVariable(value = "tid")Integer integer) {
        int result = trackService.addTerminalIdCounts(trackCounts);

        if (result == 1) {
            return "success";
        } else {
            return "error";
        }
    }*/

    /*public ResponseEntity<JsonResult> addTerminalIdCounts(@PathVariable(value = "tid") Integer integer) {
        JsonResult jsonResult = new JsonResult();
        try {
            TrackCounts trackCounts = trackService.addTerminalIdCounts(integer);
//            trackCounts.setCounts(trackCounts.getCounts() + 1);
            int update = trackService.addTerminalIdCounts(integer);
            jsonResult.setResult(update);
            jsonResult.setStatus("true");
        } catch (Exception e) {
            jsonResult.setResult(e.getClass()+":"+e.getMessage());
            jsonResult.setStatus("Error!!!");
            e.printStackTrace();
        }
        return ResponseEntity.ok(jsonResult);
    }*/

    /*public TrackCounts addCounts(@PathVariable(value = "tid")Integer integer) {
        TrackCounts trackCounts = trackService.addTerminalIdCounts(integer);
//        TrackCounts.setCounts(trackCounts.getCounts()+1);
//        int a = trackService.addTerminalIdCounts(integer)+1;
        String sql = "update trackCounts set counts=?where tid=?";
        Object[] objects = new Object[]{
                trackCounts.getTid(),
                trackCounts.getCounts()+1
        };
        jdbcTemplate.update(sql, objects);
        return trackCounts;
    }*/
}
