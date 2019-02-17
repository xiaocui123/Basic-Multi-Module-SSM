/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.mtiming.manage.qvo;

import com.google.common.base.MoreObjects;

/**
 * 结果详情封装
 * @author cui
 * @version ResultDetailVO, v0.1 2019/1/7 9:53
 */
public class ResultDetailVO {

    private String location;

    private String time;

    //北京时间
    private String formatTime;

    private Integer lap;

    private String reader;

    //成绩认定点位
    private String mark;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFormatTime() {
        return formatTime;
    }

    public void setFormatTime(String formatTime) {
        this.formatTime = formatTime;
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
        this.reader = reader;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this).add("time",this.time).add("mark",this.mark).toString();
    }
}
