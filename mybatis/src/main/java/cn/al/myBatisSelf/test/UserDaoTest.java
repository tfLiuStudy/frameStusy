package cn.al.myBatisSelf.test;

import cn.al.myBatisSelf.dto.User;
import cn.al.myBatisSelf.factory.SqlSessionFactory;
import cn.al.myBatisSelf.factory.SqlSessionFactoryBuilder;
import cn.al.myBatisSelf.service.SqlSession;
import cn.al.myBatisSelf.service.UserDao;
import org.junit.Test;
import java.io.InputStream;
import java.util.List;

/**
 * 测试
 */
public class UserDaoTest {

    /**
     * 动态代理对象中查询
     */
    @Test
    public void testGetAllUser() throws Exception {
        // 1、获取配置文件的输入流
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("SqlMapConfig.xml");
        // 2、获取SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 3、创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.getSqlSession();
        // 4、获取动态代理对象
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        // 5、调用方法查询
        List<User> allUser = userDao.getAllUserByMybatis();
        for (User user : allUser) {
            System.out.println(user);
        }
    }
}
