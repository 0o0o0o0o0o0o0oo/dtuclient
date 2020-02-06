package com.example.dtuandclient.entity.CloudControll.User;

import com.example.dtuandclient.entity.CloudControll.CloudControll;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CloudControllUser implements CloudControll {
    private String account;
    private String password;
}
