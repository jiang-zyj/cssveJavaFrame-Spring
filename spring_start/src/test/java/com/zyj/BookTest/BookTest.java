package com.zyj.BookTest;

import com.zyj.bean.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName BookTest
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 13:22
 * @Description: com.zyj.BookTest
 * @version: 1.0
 */
public class BookTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

}
