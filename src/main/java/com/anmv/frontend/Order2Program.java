package com.anmv.frontend;

import com.anmv.backend.Order2Repository;
import com.anmv.entity.Order2;

public class Order2Program {
    public static void main(String[] args) {
        Order2Repository repository = new Order2Repository();

        Order2 order2 = new Order2();
        order2.setOrderId(3);
        order2.setProductId(6);
        order2.setNote("Testtttt");

        repository.createOrder(order2);
    }
}
