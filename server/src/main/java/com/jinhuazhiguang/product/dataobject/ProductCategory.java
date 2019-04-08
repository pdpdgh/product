package com.jinhuazhiguang.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Desc : 商品类目
 * @auth : pdp
 * @date : 2019/04/05 14:36
 */
@Data
@Entity
public class ProductCategory {

    /** @desc : 类目id */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** @desc : 类目名称 */
    private String categoryName;

    /** @desc : 类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
