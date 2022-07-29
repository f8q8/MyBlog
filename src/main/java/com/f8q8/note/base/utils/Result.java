package com.f8q8.note.base.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {

    /**
     * 错误码
     */
    private int code;
    /**
     * 错误消息
     */
    private String message;
    /**
     * 数据
     */
    private T data;

}
