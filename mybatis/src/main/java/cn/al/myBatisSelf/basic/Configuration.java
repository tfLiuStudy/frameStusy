package cn.al.myBatisSelf.basic;

import java.util.Map;

/**
 * 配置类
 */
public class Configuration {

    /**
     * name
     */
    private String username;

    /**
     * password
     */
    private String password;

    /**
     * driver
     */
    private String driver;

    /**
     * url
     */
    private String url;

    /**
     * 用来保存映射文件中的SQL标示和SQL语句
     */
    private Map<String, Mapper> mappers;

    public Map<String, Mapper> getMappers() {
        return mappers;
    }

    public void setMappers(Map<String, Mapper> mappers) {
        this.mappers = mappers;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
