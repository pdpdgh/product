package com.jinhuazhiguang.product.exception;

import com.jinhuazhiguang.product.enums.ResultEnum;

/**
 * @Desc : ProductException
 * @auth : pdp
 * @date : 2019/04/07 15:53
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
