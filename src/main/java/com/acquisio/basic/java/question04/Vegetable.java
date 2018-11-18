package com.acquisio.basic.java.question04;

class Vegetable extends Item {

    private String origin;

    Vegetable(String name, String type, String origin, int quantity, double price) {
        super(name, quantity, price, type);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }
}
