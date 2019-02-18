package com.mtiming.config.ds;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAop implements Ordered {

    private static final String PACKAGE_REFIX = "com.mtiming.timing.service";

    @Pointcut("execution(* com.mtiming..*Service.*(..))")
    public void serviceAspect() {
    }

    @Before("serviceAspect()")
    public void switchDataSource(JoinPoint point) {
        // 获取包名
        String packageStr = point.getTarget().toString();
        // 读操作切换读数据源
        if (packageStr.startsWith(PACKAGE_REFIX)) {
            DynamicDataSourceContextHolder.useTimingDataSource();
        }else {
            DynamicDataSourceContextHolder.useMasterDataSource();
        }
        return;
    }

    @After("serviceAspect())")
    public void restoreDataSource(JoinPoint point) {
        DynamicDataSourceContextHolder.clearDataSourceKey();
    }

    @AfterThrowing("serviceAspect())")
    public void restoreDataSourceException(JoinPoint point) {
        DynamicDataSourceContextHolder.clearDataSourceKey();
    }


    @Override
    public int getOrder() {
        return 1;
    }
}
