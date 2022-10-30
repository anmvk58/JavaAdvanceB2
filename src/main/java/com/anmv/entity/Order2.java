package com.anmv.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "`order`")
@IdClass(OrderPK.class)
public class Order2 implements Serializable {

    @Column(name = "order_id")
    @Id
    private int orderId;

    @Column(name = "product_id")
    @Id
    private int productId;

    @Column(name = "note", length = 50, nullable = false)
    private String note;

    public Order2() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
