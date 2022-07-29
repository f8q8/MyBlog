package com.f8q8.note.base.utils;

public class ResultUtils<T> {

    private static final int SUCCESS_CODE = 200;
    private static final String SUCCESS_MESSAGE = "成功";

    private static final int ERROR_CODE = 500;
    private static final String ERROR_MESSAGE = "失败";

    public static Result success(Object data) {
        Result result = new Result();
        result.setCode(SUCCESS_CODE);
        result.setMessage(SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(int code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static Result error() {
        return error(ERROR_CODE, ERROR_MESSAGE);
    }

}
