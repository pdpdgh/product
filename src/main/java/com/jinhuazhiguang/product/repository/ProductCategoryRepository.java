package com.jinhuazhiguang.product.repository;

import com.jinhuazhiguang.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Desc: 商品类目repo
 * @auth: pdp
 * @date: 2019/04/05 14:39
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
