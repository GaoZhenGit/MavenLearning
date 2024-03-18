package com.codetend.common.controller;

import com.codetend.base.FileUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
    @RequestMapping("/test")
    public String test(@RequestParam(value = "file", required = false) String file) {
        return String.format("hello! common!-%s", FileUtil.checkFileExist(file));
    }
}
