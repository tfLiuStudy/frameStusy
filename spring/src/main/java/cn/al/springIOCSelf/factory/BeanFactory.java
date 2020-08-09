package cn.al.springIOCSelf.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * bean工厂类，通过接口可找到实现类
 */
public class BeanFactory {
    //定义一个 Properties 对象
    private static Properties props;
    //定义一个 Map,用于存放我们要创建的对象。我们把它称之为容器
    private static Map<String,Object> beans;
    //使用静态代码块为 Properties 对象赋值
    static {
        try {
            //实例化对象
            props = new Properties();
            //获取 properties 文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            //实例化容器
            beans = new HashMap<String,Object>();
            //取出配置文件中所有的 Key
            Enumeration keys = props.keys();
            //遍历枚举
            while (keys.hasMoreElements()){
                //取出每个 Key
                String key = keys.nextElement().toString();
                //根据 key 获取 value
                String beanPath = props.getProperty(key);
                //反射创建对象
                Object value = Class.forName(beanPath).newInstance();
                //把 key 和 value 存入容器中
                beans.put(key,value);
            } }catch(Exception e){
            throw new ExceptionInInitializerError("初始化 properties 失败！");
        }
    }

    /**
     * 根据 bean 的名称获取对象
     * @param beanName
     * @return
     */
    public static Object getBean(String beanName){
        return beans.get(beanName);
    }
}
