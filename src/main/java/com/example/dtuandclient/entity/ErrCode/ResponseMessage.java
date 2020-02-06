package com.example.dtuandclient.entity.ErrCode;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Data
public class ResponseMessage  {
    //错误码
    private int code;
    //信息描述
    private String msg;
    //具体的信息内容
    private Object data;
}
