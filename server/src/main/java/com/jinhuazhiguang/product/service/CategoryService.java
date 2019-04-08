package com.jinhuazhiguang.product.service;

import com.jinhuazhiguang.product.dataobject.ProductCategory;

import java.util.List;

/**
 * @Desc : 类目服务
 * @auth : pdp
 * @date : 2019/04/05 16:01
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
