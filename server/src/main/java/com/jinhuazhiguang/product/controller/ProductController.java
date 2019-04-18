package com.jinhuazhiguang.product.controller;

import com.jinhuazhiguang.product.VO.ProductInfoVO;
import com.jinhuazhiguang.product.VO.ProductVO;
import com.jinhuazhiguang.product.VO.ResultVO;
import com.jinhuazhiguang.product.common.DecreaseStockInput;
import com.jinhuazhiguang.product.common.ProductInfoOutput;
import com.jinhuazhiguang.product.dataobject.ProductCategory;
import com.jinhuazhiguang.product.dataobject.ProductInfo;
import com.jinhuazhiguang.product.service.CategoryService;
import com.jinhuazhiguang.product.service.ProductService;
import com.jinhuazhiguang.product.utils.ResultVOUtil;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Desc : 商品controller
 * @auth : pdp
 * @date : 2019/04/05 16:28
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
//    @CrossOrigin(allowCredentials = "true", )
    public ResultVO<ProductVO> list() {

        /** 1. 查询所有上架商品 */
        List<ProductInfo> productInfoList = productService.findUpAll();

        /** 2. 获取类目type列表 */
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());

        /** 3. 从数据库查询类目 */
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        /** 4. 构造数据 */
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory: categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo: productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }

    /** 获取商品列表（给订单服务用的） */
    @PostMapping("/listForOrder")
    public List<ProductInfoOutput> listForOrder(@RequestBody  List<String> productIdList) {
        return productService.findList(productIdList);
    }

    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList) {
        productService.decreaseStock(decreaseStockInputList);
    }
}
