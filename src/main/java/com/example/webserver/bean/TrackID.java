package com.example.webserver.bean;

/**
 * Created by INvo
 * on 2019/10/9.
 */
public class TrackID {
    private Integer track;

    public Integer getTrack() {
        return track;
    }

    public void setTrack(Integer track) {
        this.track = track;
    }

    @Override
    public String toString() {
        return "TrackID{" +
                "track=" + track +
                '}';
    }
}
