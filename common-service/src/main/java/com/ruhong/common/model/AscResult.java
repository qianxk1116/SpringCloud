package com.ruhong.common.model;

import java.io.Serializable;

/**
 * 描述: RestResult
 *
 * @author 钱小康
 * @since 2021-07-08  0:29
 */
public class AscResult<T> implements Serializable {

    private static final long serialVersionUID = 6095433538316185018L;

    private int code;

    private String message;

    private T data;

    public AscResult() {
    }

    public AscResult(int code, String message, T data) {
        this.code = code;
        this.setMessage(message);
        this.data = data;
    }

    public AscResult(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public AscResult(int code, String message) {
        this.code = code;
        this.setMessage(message);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean ok() {
        return this.code == 0 || this.code == 200;
    }

    @Override
    public String toString() {
        return "RestResult{" + "code=" + code + ", message='" + message + '\'' + ", data=" + data + '}';
    }

    public static <T> ResResultBuilder<T> builder() {
        return new ResResultBuilder<T>();
    }

    public static final class ResResultBuilder<T> {

        private int code;

        private String errMsg;

        private T data;

        private ResResultBuilder() {
        }

        public ResResultBuilder<T> withCode(int code) {
            this.code = code;
            return this;
        }

        public ResResultBuilder<T> withMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }

        public ResResultBuilder<T> withData(T data) {
            this.data = data;
            return this;
        }

        /**
         * Build result.
         *
         * @return result
         */
        public AscResult<T> build() {
            AscResult<T> ascResult = new AscResult<T>();
            ascResult.setCode(code);
            ascResult.setMessage(errMsg);
            ascResult.setData(data);
            return ascResult;
        }
    }

}
