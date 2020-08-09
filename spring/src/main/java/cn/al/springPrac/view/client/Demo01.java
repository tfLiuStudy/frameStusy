package cn.al.springPrac.view.client;

import cn.al.springPrac.domain.Account;
import cn.al.springPrac.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

/**
 * Demo01
 * @Author: tfliu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:bean.xml"})
public class Demo01 {

    /**
     * accountService
     */
    @Autowired
    private IAccountService accountService;

    /**
     * Test01
     */
    @Test
    public void Test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = (IAccountService) classPathXmlApplicationContext.getBean("accountService");
        List<Account> account = accountService.findAccount();
        for (Account acc : account) {
            System.out.println(acc);
        }
    }

    /**
     * @ study
     */
    @Test
    public void Test02(){
        List<Account> account = accountService.findAccount();
        for (Account acc : account) {
            System.out.println(acc);
        }
    }
}
