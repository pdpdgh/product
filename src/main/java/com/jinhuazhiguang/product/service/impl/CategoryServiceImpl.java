package com.jinhuazhiguang.product.service.impl;

import com.jinhuazhiguang.product.dataobject.ProductCategory;
import com.jinhuazhiguang.product.repository.ProductCategoryRepository;
import com.jinhuazhiguang.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc : 类目服务impl
 * @auth : pdp
 * @date : 2019/04/05 16:08
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
