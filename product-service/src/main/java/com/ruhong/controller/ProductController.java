package com.ruhong.controller;

import com.ruhong.common.model.AscResult;
import com.ruhong.model.ProductModel;
import com.ruhong.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: ProductController
 *
 * @author 钱小康
 * @since 2021-07-08  0:12
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    /**
     *  添加商品
     * @param productModel 商品信息
     * @return 添加结果
     */
    public AscResult<Object> addProduct(ProductModel productModel){

        return null;
    }


}
