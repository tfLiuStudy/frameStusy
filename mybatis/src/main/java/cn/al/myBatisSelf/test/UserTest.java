package cn.al.myBatisSelf.test;

import cn.al.myBatisSelf.dto.User;
import cn.al.myBatisSelf.service.UserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.util.List;

public class UserTest {

    @Test
    public void testMapper() throws Exception {
        // 解析配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 获取SqlSessionFactory
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // sqlSession
        SqlSession sqlSession = build.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        sqlSession.close();
        resourceAsStream.close();
    }

    /**
     * 新增用户
     */
    @Test
    public void saveUser() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        User tfliu = new User("tfliu", "1", new Date(2020, 10, 21));
        int id = mapper.saveUser(tfliu);
        System.out.println(tfliu.getId());
        sqlSession.commit();
        sqlSession.close();
        resourceAsStream.close();
    }
}
