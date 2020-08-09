package cn.al.client.test;

import cn.al.dao.IAccountDao;
import cn.al.domain.Account;
import cn.al.service.IAccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class Demo01 {

    @Autowired
    private IAccountService accountService;

    /**
     * test-Spring
     */
    @Test
    public void testSpring(){
        List<Account> allAccount = accountService.findAllAccount();
        for (Account account : allAccount) {
            System.out.println(account);
        }
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("测试账号");
        account.setMoney(1234f);
        accountService.saveAccount(account);
    }

    @Test
    public void testMybatis() throws IOException {
        InputStream rs = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(rs);
        SqlSession sqlSession = build.openSession();
        IAccountDao mapper = sqlSession.getMapper(IAccountDao.class);
        List<Account> accounts = mapper.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
