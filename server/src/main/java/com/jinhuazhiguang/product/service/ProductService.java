package com.jinhuazhiguang.product.service;

import com.jinhuazhiguang.product.common.DecreaseStockInput;
import com.jinhuazhiguang.product.common.ProductInfoOutput;
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

    /**
     * @Desc : 查询商品列表
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
    * @Desc : 扣库存
    */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
