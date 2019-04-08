package com.jinhuazhiguang.product.utils;

import com.jinhuazhiguang.product.VO.ResultVO;

/**
 * @Desc : ResultVOUtil
 * @auth : pdp
 * @date : 2019/04/05 17:09
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
