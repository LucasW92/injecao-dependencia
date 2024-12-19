package com.devsuperior.componenteseinjecao.service;

import com.devsuperior.componenteseinjecao.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    ShippingService shippingService = new ShippingService();

    public double total(Order order) {
        double basic = order.getBasic();
        double discount = (1.0 - (order.getDiscount() / 100.0));
        double shippingValue = shippingService.shipment(order);
        return (basic * discount) + shippingValue;
    }
}
