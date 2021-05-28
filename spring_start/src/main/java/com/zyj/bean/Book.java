package com.zyj.bean;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName Book
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 13:19
 * @Description: com.zyj.bean
 * @version: 1.0
 */
public class Book {

    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
