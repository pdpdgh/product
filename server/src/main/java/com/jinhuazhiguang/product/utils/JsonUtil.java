package com.jinhuazhiguang.product.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Desc : JsonUtil
 * @auth : pdp
 * @date : 2019/04/17 2:47
 */
public class JsonUtil {

    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
    * @Desc : 转换为json字符串
    */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
