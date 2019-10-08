package com.example.webserver.bean;

/**
 * Created by INvo
 * on 2019/10/6.
 */
public class JsonResult {

    /*
    * 通用json返回类，即把我们要返回的数据转换为json格式
    * */


    private String status=null;

    private Object result=null;

    public JsonResult status(String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
