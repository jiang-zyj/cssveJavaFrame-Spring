package com.zyj.proxy.aspectJ.annotation;

import org.springframework.stereotype.Component;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName ArithmeticCalculatorImpl
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 13:12
 * @Package: com.cssve.proxy.jdk.aspectJ.annotation
 * @Description:
 */
@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator{
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }
}
