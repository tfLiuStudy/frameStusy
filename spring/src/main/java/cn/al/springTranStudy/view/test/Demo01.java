package cn.al.springTranStudy.view.test;

import cn.al.springTranStudy.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Demo01
 * @Author tfliu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:springTranStudy.xml"})
public class Demo01 {

    /**
     * accountService
     */
    @Autowired
    private IAccountService accountService;


    /**
     * test
     */
    @Test
    public void test(){
        accountService.transfer("aaa", "bbb", (float) 500);
    }
}
