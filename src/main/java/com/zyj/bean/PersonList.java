package com.zyj.bean;

import java.util.List;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName PersonList
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 13:33
 * @Description: com.zyj.bean
 * @version: 1.0
 */
public class PersonList {

    private String name;
    private List<Car> car;


    @Override
    public String toString() {
        return "PersonList{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }
}
