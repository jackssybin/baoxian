package com.kaisagroup.baoxian.util.baoxianjson;

/**
 * Created by jackssy on 2018/7/30.
 */
public class Result {
    private String code;
    private String message;
    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
