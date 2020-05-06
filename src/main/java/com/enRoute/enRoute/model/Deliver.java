package com.enRoute.enRoute.model;

import javax.persistence.*;

@Entity
@Table(name = "deliver")
public class Deliver {

    @Id
    @Column(name = "deliver_id")
    private Long deliver;
    @Column(name = "deliver_name")
    private String name;

    public Deliver() {
    }

    public Deliver(Long deliver, String name) {
        this.deliver = deliver;
        this.name = name;
    }

    public Long getDeliver() {
        return deliver;
    }

    public void setDeliver(Long deliver) {
        this.deliver = deliver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Deliver{" +
                "deliver=" + deliver +
                ", name='" + name + '\'' +
                '}';
    }
}
