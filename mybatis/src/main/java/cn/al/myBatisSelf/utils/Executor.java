package cn.al.myBatisSelf.utils;

import cn.al.myBatisSelf.basic.Configuration;

import java.util.List;

/**
 * SQL语句执行
 */
public class Executor {

    /**
     * 构造方法
     * @param cfg：数据库的配置类
     */
    public Executor(Configuration cfg) {

    }

    /**
     * 执行SQL
     * @param sql
     * @param resultType
     * @param <E>
     * @return
     */
    public <E> List<E> executeQuery(String sql, String resultType) {
        return null;
    }
}
