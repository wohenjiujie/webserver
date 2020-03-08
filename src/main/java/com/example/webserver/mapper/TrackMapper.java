package com.example.webserver.mapper;

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
     * 查询track：通过terminal查询当前终端下的所有track
     *
     * @param integer
     * @return
     */
    @Select("select track from trackInfo where terminal=#{terminal}")
    List<TrackID> getTrackID(Integer integer);

    /**
     * 查询trackInfo：通过terminal倒序查询当前终端下的所有trackInfo
     *
     * @param integer
     * @return
     */
    @Select("select * from trackInfo where terminal=#{terminal} order by 4 desc")
    List<TrackInfo> getTerminalInfo(Integer integer);

    /**
     * 查询trackInfo：通过terminal查询指定track的trackInfo
     *
     * @param trackInfo
     * @return
     */
    @Select("select * from trackInfo where terminal=#{terminal} and track=#{track}")
    TrackInfo getTrackInfo(TrackInfo trackInfo);

    /**
     * 添加track：通过terminal添加track
     *
     * @param trackInfo
     */
    @Insert("insert into trackInfo(terminal,track,date,time,description,mileage,bitmap)values(#{terminal},#{track},#{date},#{time},#{description},#{mileage},#{bitmap})")
    void addTrack(TrackInfo trackInfo);

    /**
     * 删除track：通过terminal删除track
     *
     * @param trackInfo
     */
    @Delete("delete from trackInfo where terminal=#{terminal} and track=#{track}")
    void deleteTrack(TrackInfo trackInfo);

    /**
     * 查询counts：通过terminal查询track的数量
     *
     * @param integer
     * @return
     */
    @Select("select count(*) from trackInfo where terminal=#{terminal}")
    Integer getTerminalCounts(Integer integer);
}


