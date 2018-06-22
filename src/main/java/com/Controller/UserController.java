package com.Controller;
import com.bean.UserBean;
import com.db1.mapper.UserMapper1;
import com.db2.mapper.UserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper1 userMapper1;

    @Autowired
    private UserMapper2 userMapper2;

    @RequestMapping("/getUsers1")
    public List<UserBean> getUsers() {
        List<UserBean> users=userMapper1.getAll();
        return users;
    }

    @RequestMapping("/getUsers2")
    public List<UserBean> getUsers2() {
        List<UserBean> users=userMapper2.getAll();
        return users;
    }

}
