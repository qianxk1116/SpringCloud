package com.ruhong.common.model.core;

/**
 * 描述: IResultCode
 *
 * @author 钱小康
 * @since 2021-07-08  0:34
 */
public interface AscResultCode {

    /**
     * Get the result code.
     *
     * @return code value.
     */
    int getCode();

    /**
     * Get the result code's message.
     *
     * @return code's message.
     */
    String getCodeMsg();
}
