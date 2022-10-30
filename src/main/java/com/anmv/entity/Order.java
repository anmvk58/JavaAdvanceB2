package com.anmv.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "`order`")
public class Order implements Serializable {

    @EmbeddedId
    private OrderPK id;

    @Column(name = "note", length = 50, nullable = false)
    private String note;

    public Order() {
    }

    public OrderPK getId() {
        return id;
    }

    public void setId(OrderPK id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
