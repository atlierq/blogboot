package com.noone.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private int code;//200正常，非200异常
    private String msg;
    private Object data;

    public static Result getResult(int code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result success(Object data){
        return getResult(200,"操作成功",data);
    }

    public static Result fail(String msg){
        return getResult(400,msg,null);
    }

    public static Result fail(String msg,Object data){
        return getResult(400,msg,data);
    }
    public static Result fail(int code,String msg,Object data){
        return  getResult(code,msg,data);
    }





}
