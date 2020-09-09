package com.innovative.algo.domain;

public class Apartment {
    private Integer id;

    public Apartment(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Apartment setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                '}';
    }
}
