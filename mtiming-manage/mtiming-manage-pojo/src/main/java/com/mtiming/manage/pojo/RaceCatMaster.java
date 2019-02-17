package com.mtiming.manage.pojo;

public class RaceCatMaster {
    private Integer id;

    private Integer raceno;

    private String racecat;

    private Integer courseid;

    private String racecatname;

    private String racecatnamechi;

    private String gender;

    private String isteam;

    private Integer coreleg;

    private Integer noofprize;

    private String header;

    private String seperator;

    private Integer laps;

    private String rankcatby;

    private Integer winpos;

    private Integer teamsize;

    private String teamtimemode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRaceno() {
        return raceno;
    }

    public void setRaceno(Integer raceno) {
        this.raceno = raceno;
    }

    public String getRacecat() {
        return racecat;
    }

    public void setRacecat(String racecat) {
        this.racecat = racecat == null ? null : racecat.trim();
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getRacecatname() {
        return racecatname;
    }

    public void setRacecatname(String racecatname) {
        this.racecatname = racecatname == null ? null : racecatname.trim();
    }

    public String getRacecatnamechi() {
        return racecatnamechi;
    }

    public void setRacecatnamechi(String racecatnamechi) {
        this.racecatnamechi = racecatnamechi == null ? null : racecatnamechi.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIsteam() {
        return isteam;
    }

    public void setIsteam(String isteam) {
        this.isteam = isteam == null ? null : isteam.trim();
    }

    public Integer getCoreleg() {
        return coreleg;
    }

    public void setCoreleg(Integer coreleg) {
        this.coreleg = coreleg;
    }

    public Integer getNoofprize() {
        return noofprize;
    }

    public void setNoofprize(Integer noofprize) {
        this.noofprize = noofprize;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }

    public String getSeperator() {
        return seperator;
    }

    public void setSeperator(String seperator) {
        this.seperator = seperator == null ? null : seperator.trim();
    }

    public Integer getLaps() {
        return laps;
    }

    public void setLaps(Integer laps) {
        this.laps = laps;
    }

    public String getRankcatby() {
        return rankcatby;
    }

    public void setRankcatby(String rankcatby) {
        this.rankcatby = rankcatby == null ? null : rankcatby.trim();
    }

    public Integer getWinpos() {
        return winpos;
    }

    public void setWinpos(Integer winpos) {
        this.winpos = winpos;
    }

    public Integer getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(Integer teamsize) {
        this.teamsize = teamsize;
    }

    public String getTeamtimemode() {
        return teamtimemode;
    }

    public void setTeamtimemode(String teamtimemode) {
        this.teamtimemode = teamtimemode == null ? null : teamtimemode.trim();
    }
}