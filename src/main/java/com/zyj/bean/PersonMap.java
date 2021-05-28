package com.zyj.bean;

import java.util.Map;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName PersonMap
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 13:38
 * @Description: com.zyj.bean
 * @version: 1.0
 */
public class PersonMap {

    private String name;
    private Map<String, Car> car;

    @Override
    public String toString() {
        return "PersonMap{" +
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

    public Map<String, Car> getCar() {
        return car;
    }

    public void setCar(Map<String, Car> car) {
        this.car = car;
    }
}
