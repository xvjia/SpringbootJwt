package com.lytech.xvjialing.springsecurity.utils;

import com.lytech.xvjialing.springsecurity.bean.Message;

public class MessageUtils {

    public static Message createMessage(int status, String message, Object result){
        Message message1=new Message();
        message1.setStatus(status);
        message1.setMessage(message);
        message1.setResult(result);
        return message1;
    }
}