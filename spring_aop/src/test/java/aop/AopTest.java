package aop;

import com.zyj.proxy.aspectJ.xml.StudentDaoImpl;
import com.zyj.proxy.aspectJ.xml.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName AopTest
 * @author: YaJun
 * @Date: 2021 - 05 - 30 - 14:30
 * @Package: aop
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AopTest {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private StudentDaoImpl studentDao;

    @Test
    public void test() {
//        userMapper.save();
        studentDao.queryStudent(3);

//        System.out.println("userMapper动态代理对象：" + userMapper);
//        System.out.println("studentDao动态代理对象：" + studentDao);
    }
}
