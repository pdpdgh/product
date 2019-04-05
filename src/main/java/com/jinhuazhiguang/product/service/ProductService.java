package com.jinhuazhiguang.product.service;

import com.jinhuazhiguang.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @Desc : 商品服务
 * @auth : pdp
 * @date : 2019/04/05 15:01
 */
public interface ProductService {

    /**
    * @Desc : 查询所有上架商品
    */
    List<ProductInfo> findUpAll();
}
