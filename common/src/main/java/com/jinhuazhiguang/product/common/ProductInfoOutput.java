package com.jinhuazhiguang.product.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Desc : 商品信息
 * @auth : pdp
 * @date : 2019/04/05 13:30
 */
@Data
public class ProductInfoOutput {

    /** @desc : id */
    private String productId;

    /** @desc : 名称 */
    private String productName;

    /** @desc : 单价 */
    private BigDecimal productPrice;

    /** @desc : 库存 */
    private Integer productStock;

    /** @desc : 描述 */
    private String productDescription;

    /** @desc : 小图 */
    private String productIcon;

    /** @desc : 状态 0正常1下架 */
    private Integer productStatus;

    /** @desc : 类目编号 */
    private Integer categoryType;
}
