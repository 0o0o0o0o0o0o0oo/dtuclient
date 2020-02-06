package com.example.dtuandclient.mapper;

import com.example.dtuandclient.entity.CloudControll.User.CloudControllUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface Common {
    @Select("select * from account")
    public ArrayList<CloudControllUser> FindAllDataFromUser();
}
