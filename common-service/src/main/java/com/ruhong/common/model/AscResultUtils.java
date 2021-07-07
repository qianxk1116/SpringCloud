package com.ruhong.common.model;

import com.ruhong.common.model.core.AscResultCode;

/**
 * 描述: RestResultUtils
 *
 * @author 钱小康
 * @since 2021-07-08  0:32
 */
public class AscResultUtils {

    public static <T> AscResult<T> success() {
        return AscResult.<T>builder().withCode(200).build();
    }

    public static <T> AscResult<T> success(T data) {
        return AscResult.<T>builder().withCode(200).withData(data).build();
    }

    public static <T> AscResult<T> success(String msg, T data) {
        return AscResult.<T>builder().withCode(200).withMsg(msg).withData(data).build();
    }

    public static <T> AscResult<T> success(int code, T data) {
        return AscResult.<T>builder().withCode(code).withData(data).build();
    }

    public static <T> AscResult<T> failed() {
        return AscResult.<T>builder().withCode(500).build();
    }

    public static <T> AscResult<T> failed(String errMsg) {
        return AscResult.<T>builder().withCode(500).withMsg(errMsg).build();
    }

    public static <T> AscResult<T> failed(int code, T data) {
        return AscResult.<T>builder().withCode(code).withData(data).build();
    }

    public static <T> AscResult<T> failed(int code, T data, String errMsg) {
        return AscResult.<T>builder().withCode(code).withData(data).withMsg(errMsg).build();
    }

    public static <T> AscResult<T> failedWithMsg(int code, String errMsg) {
        return AscResult.<T>builder().withCode(code).withMsg(errMsg).build();
    }

    public static <T> AscResult<T> buildResult(AscResultCode resultCode, T data) {
        return AscResult.<T>builder().withCode(resultCode.getCode()).withMsg(resultCode.getCodeMsg()).withData(data).build();
    }
}
