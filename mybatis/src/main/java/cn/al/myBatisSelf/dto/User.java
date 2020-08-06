package cn.al.myBatisSelf.dto;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {

    private int id;
    private String username;// 用户姓名
    private String sex;// 性别
    private Date birthday;// 生日

    public User(String username, String sex, Date birthday) {
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
    }

    public User() {
    }

    public User(int id, String username, String sex, Date birthday) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthday = birthday;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", sex=" + sex
                + ", birthday=" + birthday + "]"; }
}
