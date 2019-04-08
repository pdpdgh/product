package com.jinhuazhiguang.product.enums;

import lombok.Getter;

/**
 * @Desc : 商品状态enum
 * @auth : pdp
 * @date : 2019/04/05 15:07
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "上架"),
    DOWN(1, "下架"),
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
