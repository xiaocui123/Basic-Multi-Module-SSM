/*
 * @Copyright: 2005-2018 www.hyjf.com. All rights reserved.
 */
package com.mtiming;

import java.util.List;
import java.util.Map;

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
        example.or().andTagEqualTo(42031);
        List<RunnerInfo> lstRunner = runnerService.queryRunners(example);

        Map<String, Object> objectMap = cttimeService.calcResult(lstRunner.get(0),lstPointFlow,1);
        System.out.println(objectMap);
    }

}
