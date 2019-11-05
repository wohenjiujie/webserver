package com.example.webserver.mapper;

import com.example.webserver.bean.TrackCounts;
import com.example.webserver.bean.TrackID;
import com.example.webserver.bean.TrackInfo;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by INvo
 * on 2019/10/6.
 * 对数据库直接做操作的接口底层方法
 */
public interface TrackMapper {

    /**
     * counts：通过tid返回trackCounts数据
     *
     * @param integer
     * @return
     */
    @Select("select * from trackCounts where tid=#{tid}")
    TrackCounts getTrackCounts(Integer integer);

    /**
     * 查询counts：通过tid查询当前终端下的记录次数
     *
     * @param integer
     * @return
     */
    @Select("select counts from trackCounts where tid=#{tid}")
    int getTerminalIdCounts(Integer integer);

    /**
     * 增加counts：通过tid增加当前终端下的计数
     *
     * @param tid
     * @param counts
     */
    @Update("update trackCounts set counts=#{counts} where tid=#{tid}")
    void increaseTerminalIdCounts(Integer tid, Integer counts);

    /**
     * 减少counts：通过tid增加当前终端下的计数
     *
     * @param tid
     * @param counts
     */
    @Update("update trackCounts set counts=#{counts} where tid=#{tid}")
    void decreaseTerminalIdCounts(Integer tid, Integer counts);

    /**
     * 查询track：通过terminal查询当前终端下的所有track
     *
     * @param integer
     * @return
     */
    @Select("select track from trackInfo where terminal=#{terminal}")
    List<TrackID> getTrackID(Integer integer);

    /**
     * 添加track：通过terminal添加track
     *
     * @param trackInfo
     */
    @Insert("insert into trackInfo(terminal,track,date,time,description)values(#{terminal},#{track},#{date},#{time},#{description})")
    void addTrack(TrackInfo trackInfo);

//    values(#{terminal},#{track},#{date},#{time},#{desc})
    /**
     * 删除track：通过terminal删除track
     *
     * @param trackInfo
     */
    @Delete("delete from trackInfo where terminal=#{terminal} and track=#{track}")
    void deleteTrack(TrackInfo trackInfo);

   /* @Delete("delete from test where terminal=#{terminal} and track=#{track}")
    void deleteTrack1(Integer terminal,Integer track);

    @Insert("insert into trackInfo(terminal,track,desc,date,mileage,time) values(#{terminal},#{track},#{desc},#{date},#{mileage},#{time})")
    void addTrackInfo(TrackInfo trackInfo);*/

    @Select("select * from trackInfo where terminal=#{terminal} and track=#{track}")
    TrackInfo getTrackInfo(TrackInfo trackInfo);
}
