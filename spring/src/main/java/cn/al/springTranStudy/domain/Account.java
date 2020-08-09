package cn.al.springTranStudy.domain;

/**
 * account
 * @Author: tfliu
 */
public class Account {

    /**
     * id
     */
    private Integer id;
    /**
     * name
     */
    private String name;
    /**
     * money
     */
    private Float money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
