/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.mtiming;

import java.util.List;
import java.util.Map;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mtiming.manage.TimingConstants;
import com.mtiming.manage.pojo.PointsFLow;
import com.mtiming.manage.pojo.RunnerInfo;
import com.mtiming.manage.pojo.RunnerInfoExample;
import com.mtiming.manage.service.TimingResultService;
import com.mtiming.timing.service.CttimeService;
import com.mtiming.timing.service.RunnerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author cui
 * @version CttimeServiceTest, v0.1 2018/12/12 9:44
 */
public class CttimeServiceTest extends AbstractSpringTest {

    @Autowired
    private CttimeService cttimeService;

    @Autowired
    private TimingResultService timingResultService;

    @Autowired
    private RunnerService runnerService;

    @Test
    public void testSaveExcel(){
        cttimeService.saveResult2Excel();
    }

    @Test
    public void testRunner(){
        List<PointsFLow> lstPointFlow=cttimeService.getPointFlow(1);

        RunnerInfoExample example=new RunnerInfoExample();
        example.or().andTagEqualTo(77522);
        example.or().andTagEqualTo(77528);
        List<RunnerInfo> lstRunner = runnerService.queryRunners(example);

        Map<String, Object> objectMap1 = cttimeService.calcResult(lstRunner.get(0),lstPointFlow,1);
        Map<String, Object> objectMap2 = cttimeService.calcResult(lstRunner.get(1),lstPointFlow,1);
        Map<String, String> copyMap1 = Maps.transformValues(objectMap1, new Function<Object, String>() {
            @Override
            public String apply(Object o) {
                return String.valueOf(o);
            }
        });
        Map<String, String> copyMap2 = Maps.transformValues(objectMap2, new Function<Object, String>() {
            @Override
            public String apply(Object o) {
                return String.valueOf(o);
            }
        });

        List<Map<String,String>> lstResult= Lists.newArrayList();
        lstResult.add(copyMap1);
        lstResult.add(copyMap2);
        timingResultService.saveResult(TimingConstants.DEFAULT_RESULT_TABLE_NAME,lstResult);


    }

}
