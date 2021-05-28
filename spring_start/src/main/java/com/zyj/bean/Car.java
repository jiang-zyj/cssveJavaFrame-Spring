package com.zyj.bean;

/**
 * @author 才二
 * @ClassName Car
 * @Auther: YaJun
 * @Date: 2021 - 05 - 27 - 15:59
 * @Description: com.zyj.bean
 * @version: 1.0
 */
public class Car {

    private Integer id;

    private String name;

    private Double price;

    public Car() {
    }

    public Car(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
