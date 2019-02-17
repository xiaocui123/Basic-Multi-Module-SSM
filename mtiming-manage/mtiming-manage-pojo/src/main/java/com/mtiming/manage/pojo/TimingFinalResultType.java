/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.mtiming.manage.pojo;

/**
 * 最终成绩类型
 *
 * @author cui
 * @version TimingFinalResultType, v0.1 2019/1/5 16:05
 */
public class TimingFinalResultType {
    //姓名
    private String runnerName;
    //Tag
    private String tag;
    //Bib
    private String bib;
    //性别
    private String gender;
    //组别
    private String cat;
    //枪声成绩
    private String gunScore;
    //净成绩
    private String cleanScore;
    //枪声名次
    private Integer rkGun;
    //净名次
    private Integer rkCat;

    public String getRunnerName() {
        return runnerName;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getBib() {
        return bib;
    }

    public void setBib(String bib) {
        this.bib = bib;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getGunScore() {
        return gunScore;
    }

    public void setGunScore(String gunScore) {
        this.gunScore = gunScore;
    }

    public String getCleanScore() {
        return cleanScore;
    }

    public void setCleanScore(String cleanScore) {
        this.cleanScore = cleanScore;
    }

    public Integer getRkGun() {
        return rkGun;
    }

    public void setRkGun(Integer rkGun) {
        this.rkGun = rkGun;
    }

    public Integer getRkCat() {
        return rkCat;
    }

    public void setRkCat(Integer rkCat) {
        this.rkCat = rkCat;
    }
}
