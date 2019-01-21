package com.TaiKang.permission.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

@Getter
@Setter
@ToString
public class ResponseMessage {
    //    private final static Logger _log = LoggerFactory.getLogger(ResponseMessage.class);
    //返回码
    private int code;
    private String success;
    private Object data;
    private long timestamp;

    public ResponseMessage() {
    }

    public ResponseMessage(int code, String success, Object data,long timestamp) {
        this.code = code;
        this.success = success;
        this.data = data;
        this.timestamp  = timestamp;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public static ResponseMessage ok(Object obj) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode(200);
        responseMessage.setSuccess("true");
        responseMessage.setData(obj);
        responseMessage.setTimestamp(new Date().getTime());
        return responseMessage;
    }

    private void code(int i) {
    }

    public static ResponseMessage error(Object obj) {
        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setCode(501);
        responseMessage.setSuccess("false");
        responseMessage.setData(obj);
        responseMessage.setTimestamp(new Date().getTime());
        return responseMessage;
    }

}
