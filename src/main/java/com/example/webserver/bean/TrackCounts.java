package com.example.webserver.bean;

/**
 * Created by INvo
 * on 2019/10/6.
 * 轨迹计数实体类
 */
public class TrackCounts<T>{

    private T counts;
    private T tid;



    public T getCounts() {
        return counts;
    }

    public void setCounts(T counts) {
        this.counts = counts;
    }

    public T getTid() {
        return tid;
    }

    public void setTid(T tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "TrackCounts{" +
                "counts=" + counts +
                ", tid=" + tid +
                '}';
    }
}
