package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    UserBean getInfo(String name,String password);
    UserBean check_username(String name);
    void add_user(String name, String password);
}
