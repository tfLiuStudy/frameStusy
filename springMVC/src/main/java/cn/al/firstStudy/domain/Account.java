package cn.al.firstStudy.domain;

import sun.jvm.hotspot.debugger.Address;
import java.io.Serializable;

/**
 * account
 */
public class Account implements Serializable {

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

    /**
     * address
     */
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", address=" + address +
                '}';
    }
}
