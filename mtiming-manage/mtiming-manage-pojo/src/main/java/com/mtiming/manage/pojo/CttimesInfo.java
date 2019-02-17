package com.mtiming.manage.pojo;

public class CttimesInfo {
    private Integer id;

    private String location;

    private String tag;

    private String time;

    private Integer lap;

    private String reader;

    private Integer gator;

    private Integer sequence;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getLap() {
        return lap;
    }

    public void setLap(Integer lap) {
        this.lap = lap;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader == null ? null : reader.trim();
    }

    public Integer getGator() {
        return gator;
    }

    public void setGator(Integer gator) {
        this.gator = gator;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
}