package com.enRoute.enRoute.model;

import javax.persistence.*;

@Entity
public class Deliver {

    @Id
    private Long deliver_id;
    private String name;

    public Deliver() {
    }

    public Deliver(Long deliver_id, String name) {
        this.deliver_id = deliver_id;
        this.name = name;
    }

    public Long getDeliver_id() {
        return deliver_id;
    }

    public void setDeliver_id(Long deliver_id) {
        this.deliver_id = deliver_id;
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
                "deliver_id=" + deliver_id +
                ", name='" + name + '\'' +
                '}';
    }
}
