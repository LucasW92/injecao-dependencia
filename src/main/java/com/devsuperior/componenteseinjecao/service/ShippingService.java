package com.devsuperior.componenteseinjecao.service;

import com.devsuperior.componenteseinjecao.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double basicValue = order.getBasic();
        if (basicValue < 100.00) {
            return 20.00;
        } else if (basicValue >= 100.00 && basicValue < 200.00) {
            return 12.00;
        } else {
            return 0.0;
        }
    }
}
