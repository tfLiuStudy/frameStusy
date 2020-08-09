package cn.al.springAopPrac.test;

import cn.al.springAopPrac.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Demo
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beanAop.xml"})
public class Demo {

    /**
     * accountService
     */
    @Autowired
    private IAccountService accountService;

    /**
     * aop---xml
     */
    @Test
    public void test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanAop.xml");
        IAccountService accountService = (IAccountService) classPathXmlApplicationContext.getBean("accountService");
        accountService.saveAccount();
    }

    /**
     * aop-@
     */
    @Test
    public void testf02(){
        accountService.saveAccount();
    }
}
