package cn.al.myBatisSelf.serviceImpl;

import cn.al.myBatisSelf.basic.Configuration;
import cn.al.myBatisSelf.basic.Mapper;
import cn.al.myBatisSelf.factory.MapperProxyFactory;
import cn.al.myBatisSelf.service.SqlSession;
import cn.al.myBatisSelf.utils.Executor;
import java.lang.reflect.Proxy;
import java.util.List;

public class DefaultSqlSession implements SqlSession {

    /**
     * 封装 mybatis 配置文件及映射文件
     */
    private Configuration cfg;

    /**
     * SQL 语句执行器
     */
    private Executor executor;

    /**
     * 构造方法
     * @param cfg
     */
    public DefaultSqlSession(Configuration cfg) {
        this.cfg = cfg;
        this.executor = new Executor(this.cfg);
    }

    /**
     * 执行SQ，返回结果
     * @param mapperId
     * @param <E>
     * @return
     * @throws Exception
     */
    public <E> List<E> selectList(String mapperId) throws Exception {
        //通过 id 获取 Mapper 对象
        Mapper mapper = cfg.getMappers().get(mapperId);
        //通过 mapper 获取 sql 语句和返回值类型
        String sql = mapper.getSql();
        String resultType = mapper.getResultType(); //返回值的全限定类名
        //调用 SQL 语句的 Executor 执行器来执行 sql 语句
        return executor.executeQuery(sql, resultType);
    }

    /**
     * 生成Mapper代理对象
     * @return
     */
    public <E> E getMapper(Class clazz) throws Exception {
        //创建 invocationHandler
        MapperProxyFactory proxy = new MapperProxyFactory(this);
        //创建动态代理对象
        return (E) Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, proxy);
    }

    public Executor getExecutor() {
        return executor;
    }

}
