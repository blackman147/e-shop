package com.ecommerce.shop.data.model;

public enum Currency {
    NGN("Naira"), USD("Dollar"), SDG("Singapore Dollar"), GBP("Pounds"), FRC("Francs"), GHC("Cedis");

    private String name;

    Currency(String s) {
        this.name = s;
    }

    private String getName(){
        return name;
    }

}
