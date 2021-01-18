package org.opengg.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.opengg.springcloud.entities.Payment;

public interface PaymentService {

    public int create (Payment payment);

    public Payment getPaymentById(Long id);
}
