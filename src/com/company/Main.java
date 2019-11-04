package com.company;

public class Main {

    public static void main(String[] args) {



        icecream basicIcecream = new Guf(new Liquorice(new Chocolatesauce(new PlainIcecream())));

        System.out.println("Cone contains: " + basicIcecream.getDescription());
        System.out.println("Cost is: " + basicIcecream.getCost());




    }
}
