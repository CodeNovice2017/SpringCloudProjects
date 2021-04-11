package com.codechase.cloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.codechase.cloud.entities.Payment;

/**
 * @author chenxin09 <chenxin09@kuaishou.com>
 * Created on 2021-04-11
 */
@Mapper
public interface PaymentDAO {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
