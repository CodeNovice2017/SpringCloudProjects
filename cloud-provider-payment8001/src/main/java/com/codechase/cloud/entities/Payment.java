package com.codechase.cloud.entities;

import java.io.Serializable;

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
public class Payment implements Serializable {
    // 为什么用long,因为数据库中Payment表对应的id是bigint类型
    private Long id;
    private String serial;
}
