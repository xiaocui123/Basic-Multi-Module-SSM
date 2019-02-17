package com.mtiming.manage.pojo;

public class RaceGunInfo {
    private Integer race;

    private String plannedguntime;

    private String guntime;

    private String cutoffoffset;

    public Integer getRace() {
        return race;
    }

    public void setRace(Integer race) {
        this.race = race;
    }

    public String getPlannedguntime() {
        return plannedguntime;
    }

    public void setPlannedguntime(String plannedguntime) {
        this.plannedguntime = plannedguntime == null ? null : plannedguntime.trim();
    }

    public String getGuntime() {
        return guntime;
    }

    public void setGuntime(String guntime) {
        this.guntime = guntime == null ? null : guntime.trim();
    }

    public String getCutoffoffset() {
        return cutoffoffset;
    }

    public void setCutoffoffset(String cutoffoffset) {
        this.cutoffoffset = cutoffoffset == null ? null : cutoffoffset.trim();
    }
}