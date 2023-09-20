package com.sniper.shardingtablepringboot.common;

public interface IErrorCode {
    /**
     * 返回码
     */
    Integer getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
