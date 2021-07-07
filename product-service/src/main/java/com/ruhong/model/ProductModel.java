package com.ruhong.model;

/**
 * 描述: ProductModel
 *
 * @author 钱小康
 * @since 2021-07-08  0:52
 */
public class ProductModel {

    /** id */
    private Long productId;

    /** 名称 */
    private String productName;

    /** 价格 */
    private Double productPrice;

    /** 简介 */
    private String productDesc;

    /** 产地 */
    private String produceAddr;

    /** 属性 */
    private String produceAttr;

    /**
     * @return the value of productId
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the productId.
     *
     * @param productId the productId to set
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * @return the value of productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the productName.
     *
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the value of productPrice
     */
    public Double getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the productPrice.
     *
     * @param productPrice the productPrice to set
     */
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * @return the value of productDesc
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * Sets the productDesc.
     *
     * @param productDesc the productDesc to set
     */
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    /**
     * @return the value of produceAddr
     */
    public String getProduceAddr() {
        return produceAddr;
    }

    /**
     * Sets the produceAddr.
     *
     * @param produceAddr the produceAddr to set
     */
    public void setProduceAddr(String produceAddr) {
        this.produceAddr = produceAddr;
    }

    /**
     * @return the value of produceAttr
     */
    public String getProduceAttr() {
        return produceAttr;
    }

    /**
     * Sets the produceAttr.
     *
     * @param produceAttr the produceAttr to set
     */
    public void setProduceAttr(String produceAttr) {
        this.produceAttr = produceAttr;
    }
}
