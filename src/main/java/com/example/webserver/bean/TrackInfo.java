package com.example.webserver.bean;

/**
 * Created by INvo
 * on 2019/10/8.
 * 轨迹信息实体类
 */
public class TrackInfo {
    private Integer terminal;
    private Integer track;
    private String date;
    private String time;
    private String description;
    private String mileage;
    private String bitmap;

    @Override
    public String toString() {
        return "TrackInfo{" +
                "terminal=" + terminal +
                ", track=" + track +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", description='" + description + '\'' +
                ", mileage='" + mileage + '\'' +
                ", bitmap='" + bitmap + '\'' +
                '}';
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public Integer getTrack() {
        return track;
    }

    public void setTrack(Integer track) {
        this.track = track;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getBitmap() {
        return bitmap;
    }

    public void setBitmap(String bitmap) {
        this.bitmap = bitmap;
    }
}
