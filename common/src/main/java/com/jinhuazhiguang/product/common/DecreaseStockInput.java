package com.jinhuazhiguang.product.common;

import lombok.Data;

/**
 * @Desc : 商品信息
 * @auth : pdp
 * @date : 2019/04/05 13:30
 */
@Data
public class DecreaseStockInput {

    private String productId;
    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
