package com.company;

public class PlainIcecream implements icecream {
    @Override
    public String getDescription() {

        return "softice";
    }

    @Override
    public double getCost() {
        return 25.00;
    }
}
