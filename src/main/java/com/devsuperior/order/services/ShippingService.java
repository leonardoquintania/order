package com.devsuperior.order.services;

import com.devsuperior.order.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    private static final double HIGH_SHIPPING_FEE = 20.0;
    private static final double MEDIUM_SHIPPING_FEE = 12.0;
    private static final double FREE_SHIPPING = 0.0;

    private static final double LOWER_THRESHOLD = 100.0; // Limite Inferior
    private static final double UPPER_THRESHOLD = 200.0; // Limite Superior

    public double shipping(Order order) {
        double basicValue = order.getBasic();

        return (basicValue < LOWER_THRESHOLD) ? HIGH_SHIPPING_FEE
                : (basicValue > UPPER_THRESHOLD) ? FREE_SHIPPING
                : MEDIUM_SHIPPING_FEE;
    }
}
