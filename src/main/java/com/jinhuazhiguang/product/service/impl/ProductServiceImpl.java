package com.jinhuazhiguang.product.service.impl;

import com.jinhuazhiguang.product.dataobject.ProductInfo;
import com.jinhuazhiguang.product.enums.ProductStatusEnum;
import com.jinhuazhiguang.product.repository.ProductInfoRepository;
import com.jinhuazhiguang.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Desc : 商品服务impl
 * @auth : pdp
 * @date : 2019/04/05 15:03
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
