package com.sniper.shardingdbtablereadwriterange.common;

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
