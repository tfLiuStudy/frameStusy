package cn.al.mybatisPrac.test;

import cn.al.mybatisPrac.dao.AccountDao;
import cn.al.mybatisPrac.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> allAccount = accountDao.findAllAccount();
        for (Account account : allAccount) {
            System.out.println(account.getId()+"---"+account.getMoney());
        }
        sqlSession.close();
        resourceAsStream.close();
    }
}

