package config;

import com.zyj.proxy.aspectJ.annotation.ArithmeticCalculatorImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName AopConfigTest
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 19:14
 * @Package: config
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.zyj.proxy.config.AspectjConfig.class})
public class AopConfigTest {

    @Autowired
    private ArithmeticCalculatorImpl arithmeticCalculatorImpl;

    @Test
    public void test() {
        arithmeticCalculatorImpl.add(1, 2);
    }

}
