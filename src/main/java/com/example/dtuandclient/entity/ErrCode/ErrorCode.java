package com.example.dtuandclient.entity.ErrCode;

public interface ErrorCode{
//    public List<Object> data=new ArrayList<Object>();
    public ResponseMessage success(Object data);
    public ResponseMessage error();
    public ResponseMessage UserNotExist();
    public ResponseMessage NeedLogin();
    public ResponseMessage PasswordError();
    public ResponseMessage EmptyUserName();
    public ResponseMessage EmptyPassword();
    public ResponseMessage SystemError();
}
