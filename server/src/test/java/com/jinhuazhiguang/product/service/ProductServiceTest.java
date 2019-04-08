package com.jinhuazhiguang.product.service;

import com.jinhuazhiguang.product.ProductApplicationTests;
import com.jinhuazhiguang.product.common.DecreaseStockInput;
import com.jinhuazhiguang.product.common.ProductInfoOutput;
import com.jinhuazhiguang.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Desc : 商品服务测试
 * @auth : pdp
 * @date : 2019/4/5 15:51
 */
@Component
public class ProductServiceTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findList() {
        List<ProductInfoOutput> list = productService.findList(Arrays.asList("123456", "123457"));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() {
        DecreaseStockInput decreaseStockInput = new DecreaseStockInput("123456", 2);
        productService.decreaseStock(Arrays.asList(decreaseStockInput));
    }
}