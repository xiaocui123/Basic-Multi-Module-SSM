package com.mtiming.manage;

/**
 * @author cui
 * @version TimingConstants, v0.1 2018/12/14 10:35
 */
public interface TimingConstants {

    String CTTIME_ORDER_BY_KEY = "Time";

    String POINTFLOW_ORDER_BY_KEY = "Seq";

    String RUNNER_ORDER_BY_KEY = "Tag";

    String EXCEL_EXT_XLSX = ".xlsx";

    String UNDERLINE = "_";

    String BEIJINGTIME_COLUMN_PREFIX = "TIME_";

    String DEFAULT_RANK_KEY = "rank";

    //计时结果表默认名称
    String DEFAULT_RESULT_TABLE_NAME = "result";

    //枪声成绩
    String SCORE_GUN="ScoreGun";

    //净成绩
    String SCORE_CLEAN="ScoreClean";

    //类别净排名
    String RANK_CAT="RkCat";

    //类别枪声排名
    String RANK_GUN="RkGun";

    //Tag
    String TAG="Tag";

    //计时结果表最少字段KEY
    String[] DEFAULT_RESULT_TABLE_COLUMNS = {TAG,SCORE_GUN,SCORE_CLEAN, RANK_CAT, RANK_GUN};
}
