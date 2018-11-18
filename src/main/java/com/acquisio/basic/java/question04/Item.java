package com.acquisio.basic.java.question04;

abstract class Item {

    String name;
    int quantity;
    double price;
    String feature;

    Item(String name, int quantity, double price, String feature) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.feature = feature;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    public String getFeature() {
		return feature;
	}
}
