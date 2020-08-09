package cn.al.firstStudy.domain;

import java.io.Serializable;
import java.util.List;

/**
 * user
 */
public class User implements Serializable {

    /**
     * id
     */
    private int id;

    /**
     * name
     */
    private String name;

    /**
     * user
     */
    private User user;

    /**
     * accounts
     */
    private List<Account> accounts;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", user=" + user +
                ", accounts=" + accounts +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}
