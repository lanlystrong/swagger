package org.open.swagger.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.open.swagger.domain.Demo;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * describe
 *
 * @author llg
 * @date 2019-09-06 11:44
 * Company 泰洋川河
 */
@Service
public class DemoService {

    public Demo findDemo(){
        Demo demo = new Demo();
        demo.setId(1L);
        demo.setName("测试");
        demo.setTime(new Date());
        return demo;
    }
}
