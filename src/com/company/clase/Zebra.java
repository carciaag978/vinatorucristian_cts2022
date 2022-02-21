package com.company.clase;

public class Zebra extends Animal{

    public  Zebra(String nume){
        super(nume);
    }


    @Override
    public void mananca(String mananca) {
        System.out.println("Zebra" + this.getName()+"mananca" + mananca);

    }
}
