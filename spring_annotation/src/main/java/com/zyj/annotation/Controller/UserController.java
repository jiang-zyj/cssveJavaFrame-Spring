package com.zyj.annotation.Controller;

import com.zyj.annotation.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * @program: CssveJavaFrame-Spring
 * @ClassName UserController
 * @author: YaJun
 * @Date: 2021 - 05 - 28 - 15:44
 * @Package: com.zyj.annotation.Controller
 * @Description:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

}
