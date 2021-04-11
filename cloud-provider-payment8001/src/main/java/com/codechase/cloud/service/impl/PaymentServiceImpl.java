package com.codechase.cloud.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.codechase.cloud.dao.PaymentDAO;
import com.codechase.cloud.entities.Payment;
import com.codechase.cloud.service.PaymentService;

/**
 * @author chenxin09 <chenxin09@kuaishou.com>
 * Created on 2021-04-11
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDAO paymentDAO;


    @Override
    public int create(Payment payment) {
        return paymentDAO.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDAO.getPaymentById(id);
    }
}
