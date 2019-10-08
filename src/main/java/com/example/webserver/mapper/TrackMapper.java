package com.example.webserver.mapper;

import com.example.webserver.bean.TrackCounts;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by INvo
 * on 2019/10/6.
 */
public interface TrackMapper {
    /*
     * 对数据库直接做操作的接口
     * */


    /**
     * 查询counts：通过tid查询当前终端下的记录次数--方法
     * @param integer
     * @return
     */
    @Select("select counts from trackCounts where tid=#{tid}")
    int getTerminalIdCounts(Integer integer);


    /**
     * 增加counts：通过tid增加当前终端下的计数--方法
     */
    @Update("update trackCounts set counts=#{counts} where tid=#{tid}")
//    int addTerminalIdCounts(@Param("id") Integer integer,@Param("TrackCounts")TrackCounts trackCounts);
//    int addTerminalIdCounts(Integer integer);

//    TrackCounts addTerminalIdCounts(Integer integer);
//    int addTerminalIdCounts(TrackCounts trackCounts);
    void addTerminalIdCounts(Integer tid, Integer counts);






    //查全部

    @Select("SELECT * FROM trackCounts")
    public List<TrackCounts> getInfoList();
}
