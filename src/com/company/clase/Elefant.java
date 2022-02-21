package com.company.clase;

public class Elefant extends Animal{

    public Elefant(String nume){
        super(nume);
    }

    @Override
    public void mananca(String mananca) {
        System.out.println("Elefantul" + this.getName() + "mananca"+ mananca);

    }
}
