package cn.al.springIOCSelf.view.test;

import cn.al.springIOCSelf.dao.service.IAccountDao;
import cn.al.springIOCSelf.factory.BeanFactory;
import cn.al.springIOCSelf.myService.service.IAccountService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * clent测试
 */
public class Client {

    /**
     * 自定义
     */
    @Test
    public void test01(){
        IAccountService iAccountService = (IAccountService) BeanFactory.getBean("IAccountService");
        iAccountService.save();
    }

    /**
     * springFrame
     */
    @Test
    public void test02(){
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService iAccountService = (IAccountService) cp.getBean("IAccountService");
        IAccountDao iAccountDao = (IAccountDao) cp.getBean("IAccountDao");
        iAccountService.save();
    }

    /**
     * 注解学习
     */
    @Test
    public void Test03(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        IAccountService accountService = (IAccountService) classPathXmlApplicationContext.getBean("accountService");
        accountService.save();
    }
}
