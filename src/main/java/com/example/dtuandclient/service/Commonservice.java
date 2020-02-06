package com.example.dtuandclient.service;

import com.example.dtuandclient.entity.CloudControll.User.CloudControllUser;
import com.example.dtuandclient.mapper.Common;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Commonservice {
    @Autowired
    public Common commonmapper;
    public ArrayList<CloudControllUser> FindAllDataFromUser(){

        return commonmapper.FindAllDataFromUser();
    }
}