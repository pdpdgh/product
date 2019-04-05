package com.jinhuazhiguang.product.service;

import com.jinhuazhiguang.product.ProductApplicationTests;
import com.jinhuazhiguang.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Desc : 类目服务测试
 * @auth : pdp
 * @date : 2019/4/5 16:04
 */
@Component
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(2, 3));
        Assert.assertTrue(list.size() > 0);
    }
}