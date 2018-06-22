package com.db2.mapper;
import com.bean.UserBean;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper2 {

    @Select("SELECT * FROM user")
    @ResultType(UserBean.class)
    List<UserBean> getAll();
}
