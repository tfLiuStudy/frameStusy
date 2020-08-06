package cn.al.mybatisPrac.domain;

public class Account {

    /**
     * id
     */
    private int id;

    /**
     * uid
     */
    private int uid;

    /**
     * money
     */
    private double money;

    /**
     * user
     */
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
