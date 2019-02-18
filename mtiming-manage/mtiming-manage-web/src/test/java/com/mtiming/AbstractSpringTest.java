package com.mtiming;

import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * 用于需要用到Spring的测试用例基类
 */
@ContextConfiguration(locations = { "classpath*:spring/applicationContext*.xml"})
public class AbstractSpringTest extends AbstractJUnit4SpringContextTests {

    public <T> T getBean(Class<T> type) {
        return applicationContext.getBean(type);
    }

    public Object getBean(String beanName) {
        return applicationContext.getBean(beanName);
    }

    protected ApplicationContext getContext() {
        return applicationContext;
    }

}

