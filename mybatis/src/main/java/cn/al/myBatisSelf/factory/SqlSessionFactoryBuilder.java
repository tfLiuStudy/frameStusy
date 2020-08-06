package cn.al.myBatisSelf.factory;

import cn.al.myBatisSelf.basic.Configuration;
import cn.al.myBatisSelf.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * 构建者模式，用来创建SqlSssionFactory工厂
 */
public class SqlSessionFactoryBuilder {

    /**
     * 创建SqlSessionFactory
     * @param is
     * @return
     * @throws Exception
     */
    public SqlSessionFactory build(InputStream is) throws Exception {
        //1.构造 Configuration 调用 XMLConfigBuilder 类实现 xml 解析
        Configuration cfg = XMLConfigBuilder.buildConfiguration(is);
        return new SqlSessionFactory(cfg);
    }
}
