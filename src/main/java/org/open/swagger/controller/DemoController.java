package org.open.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.open.swagger.domain.Demo;
import org.open.swagger.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe
 *
 * @author llg
 * @date 2019-09-06 11:41
 * Company 泰洋川河
 */
@RestController
@Api(tags = "demo rest 接口文档")
@Slf4j
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/demo")
    @ApiOperation("demoController 查询接口")
    public Demo findDemo(){
        return demoService.findDemo();
    }
}
