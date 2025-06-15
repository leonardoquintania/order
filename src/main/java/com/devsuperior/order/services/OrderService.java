package com.devsuperior.order.services;

import com.devsuperior.order.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double basicValue = order.getBasic();
        double discount = order.getDiscount();
        double discountedValue = basicValue * (1 - discount);
        double shippingFee = shippingService.shipping(order);

        return discountedValue + shippingFee;
    }
}