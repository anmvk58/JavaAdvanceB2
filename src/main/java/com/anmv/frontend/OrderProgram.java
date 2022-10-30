package com.anmv.frontend;

import com.anmv.backend.OrderRepository;
import com.anmv.entity.Order;
import com.anmv.entity.OrderPK;

public class OrderProgram {
    public static void main(String[] args) {
        OrderRepository repository = new OrderRepository();

        OrderPK orderPK = new OrderPK();
        orderPK.setOrderId(1);
        orderPK.setProductId(4);

        Order order = new Order();
        order.setId(orderPK);
        order.setNote("Buy computer");

        repository.createOrder(order);
    }
}

