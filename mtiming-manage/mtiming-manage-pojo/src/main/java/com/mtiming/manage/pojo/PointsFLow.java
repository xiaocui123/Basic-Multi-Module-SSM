package com.mtiming.manage.pojo;

public class PointsFLow {
    private Integer courseid;

    private String points;

    private String device;

    private Integer seq;

    private String priorpoint;

    private Integer interval;

    private String nextpoint;

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points == null ? null : points.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getPriorpoint() {
        return priorpoint;
    }

    public void setPriorpoint(String priorpoint) {
        this.priorpoint = priorpoint == null ? null : priorpoint.trim();
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public String getNextpoint() {
        return nextpoint;
    }

    public void setNextpoint(String nextpoint) {
        this.nextpoint = nextpoint == null ? null : nextpoint.trim();
    }
}