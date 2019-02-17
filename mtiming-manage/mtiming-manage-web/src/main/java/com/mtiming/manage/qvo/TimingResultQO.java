/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.mtiming.manage.qvo;

import com.mtiming.manage.pojo.RunnerInfo;

/**
 * 计时结果查询条件
 * @author cui
 * @version TimingResultQO, v0.1 2018/12/24 17:03
 */
public class TimingResultQO extends RunnerInfo {

    protected int limit = 0;// 每页行数
    protected int offset = 0;// 开始行数

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
