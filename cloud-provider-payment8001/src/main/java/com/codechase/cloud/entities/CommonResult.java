package com.codechase.cloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenxin09 <chenxin09@kuaishou.com>
 * Created on 2021-04-11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    // 前后端分离,后端只给前端返回一个JSON数据,同时不可能还需要前端那边知道这次传的是什么对象,也就是这次传送的JSON是什么结构,而是需要直接通过一个通用的结果Result实体封装数据,传给前端去判断其中的字段

    // 一般Java程序员最熟悉的两个错误就是
    // 404 not_found
    // 所以通用返回的结果集,第一个Code,第二个异常信息或成功的说明
    private Integer code;
    private String message;
    private T date;

    // 上面Lombok只规定了全参和空参的两种情况
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

    // 通过上面的定义之后,前端接收到数据,先拿code判断是不是200,200成功走正常处理路线,非200失败走异常路线
}
