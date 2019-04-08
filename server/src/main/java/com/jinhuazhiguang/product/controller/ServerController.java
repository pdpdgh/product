package com.jinhuazhiguang.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc : ServerController
 * @auth : pdp
 * @date : 2019/04/07 9:33
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is product msg2";
    }
}
