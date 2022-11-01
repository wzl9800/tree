package com.wzl.exceptionHandler;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Api(tags="全局异常处理")
public class GlobalException extends RuntimeException{

    @ApiModelProperty(value = "状态码")
    private Integer code;
    @ApiModelProperty(value = "错误信息")
    private String msg;


    @Override
    public String toString() {
        return "GlobalException{" +
        "message=" + this.getMsg() +
        ", code=" + code +
        '}';
    }


}
