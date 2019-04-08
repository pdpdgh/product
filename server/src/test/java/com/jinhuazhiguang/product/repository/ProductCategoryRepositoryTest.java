package com.jinhuazhiguang.product.repository;

import com.jinhuazhiguang.product.ProductApplicationTests;
import com.jinhuazhiguang.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @Desc : 商品类目repo测试
 * @auth : pdp
 * @date : 2019/4/5 14:43
 */
@Component
public class ProductCategoryRepositoryTest extends ProductApplicationTests {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(2, 3));
        Assert.assertTrue(list.size() > 0);
    }
}