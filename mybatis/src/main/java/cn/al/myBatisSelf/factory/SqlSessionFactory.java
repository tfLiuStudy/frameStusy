package cn.al.myBatisSelf.factory;

import cn.al.myBatisSelf.basic.Configuration;
import cn.al.myBatisSelf.service.SqlSession;
import cn.al.myBatisSelf.serviceImpl.DefaultSqlSession;

/**
 * 创建sqlSessionFactory工厂
 * 工厂模式，获取SqlSession
 */
public class SqlSessionFactory {

    private Configuration cfg;

    /**
     * 构造方法
     * @param cfg
     */
    public SqlSessionFactory(Configuration cfg) {
        this.cfg = cfg;
    }

    /**
     * 获取SqlSession
     * @return
     */
    public SqlSession getSqlSession(){
        return new DefaultSqlSession(cfg);
    }
}
