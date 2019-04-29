package com.demo.consumer.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author suxiaolin
 * @date 2019-04-29 19:03
 */
public class PersonDto implements Serializable {
    private String name;

    private Integer age;

    private BigDecimal money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "PersonDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

}
