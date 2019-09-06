package org.open.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * describe
 *
 * @author llg
 * @date 2019-09-06 11:42
 * Company 泰洋川河
 */
@ApiModel("demo数据模型")
@Data
public class Demo {

    @ApiModelProperty("编号")
    private Long id;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("时间")
    private Date time;
}
