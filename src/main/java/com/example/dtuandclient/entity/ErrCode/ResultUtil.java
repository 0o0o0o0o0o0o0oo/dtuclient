package com.example.dtuandclient.entity.ErrCode;

import com.example.dtuandclient.entity.ErrCode.ErrorCode;
import com.example.dtuandclient.entity.ErrCode.ResponseMessage;
import com.example.dtuandclient.entity.ErrCode.ResultEnum;

public class ResultUtil implements ErrorCode {
    //操作成功
    public ResponseMessage success(Object data){
        ResponseMessage responseMessage  = ReturnResponseMessageAndGetterSetter(ResultEnum.SUCCESS, data);
        return  responseMessage;
    }
    //操作失败返回的消息
   public  ResponseMessage error(){

       ResponseMessage responseMessage  = ReturnResponseMessageAndGetterSetter(ResultEnum.UNKNOWM_ERROR, null);
       return  responseMessage;
   }
    public ResponseMessage UserNotExist(){
        ResponseMessage responseMessage  = ReturnResponseMessageAndGetterSetter(ResultEnum.USER_NOT_EXIST, null);

        return  responseMessage;
    }
    public ResponseMessage NeedLogin(){
        ResponseMessage responseMessage  = ReturnResponseMessageAndGetterSetter(ResultEnum.NEED_LOGIN, null);
        return  responseMessage;
    }
    public ResponseMessage PasswordError(){
        ResponseMessage responseMessage  = ReturnResponseMessageAndGetterSetter(ResultEnum.PASSWORD_ERROR, null);
        return  responseMessage;
    }
    public ResponseMessage EmptyUserName(){
        ResponseMessage responseMessage  = ReturnResponseMessageAndGetterSetter(ResultEnum.EMPTY_USERNAME, null);
        return  responseMessage;
    }
    public ResponseMessage EmptyPassword(){
        ResponseMessage responseMessage  = ReturnResponseMessageAndGetterSetter(ResultEnum.EMPTY_PASSWORD, null);
        return  responseMessage;
    }
    public ResponseMessage SystemError(){
        ResponseMessage responseMessage  = ReturnResponseMessageAndGetterSetter(ResultEnum.SYSTEM_ERROR, null);
        return  responseMessage;
    }
    public ResponseMessage ReturnResponseMessageAndGetterSetter(ResultEnum rs,Object data){
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode(rs.getCode());
        responseMessage.setMsg(rs.getMsg());
        responseMessage.setData(data);
        return  responseMessage;
    }
}
