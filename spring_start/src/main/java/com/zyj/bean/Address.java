package com.zyj.bean;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName Address
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 15:29
 * @Package: com.zyj.bean
 * @Description:
 */
public class Address {

    private String city;
    private String street;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
