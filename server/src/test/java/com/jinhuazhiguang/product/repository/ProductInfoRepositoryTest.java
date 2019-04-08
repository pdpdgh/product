package com.jinhuazhiguang.product.repository;

import com.jinhuazhiguang.product.ProductApplicationTests;
import com.jinhuazhiguang.product.common.ProductInfoOutput;
import com.jinhuazhiguang.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Desc : 商品信息repo测试
 * @auth : pdp
 * @date : 2019/4/5 13:50
 */
@Component
public class ProductInfoRepositoryTest extends ProductApplicationTests {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> list = productInfoRepository.findByProductStatus(0);
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findByProductIdIn() {
        List<ProductInfo> list = productInfoRepository.findByProductIdIn(Arrays.asList("123456", "123457"));
        Assert.assertTrue(list.size() > 0);
    }
}