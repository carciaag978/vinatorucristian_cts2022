package com.company.clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    private IngrijitorZoo ingrijitorZoo;
    private List<Animal>animals;

    public Zoo(String nume, IngrijitorZoo ingrijitorZoo) {
        this.nume = nume;
        this.ingrijitorZoo = ingrijitorZoo;
        this.animals = new ArrayList<>();
    }

    public void adaugaAnimale(Animal animal){
        this.animals.add(animal);

    }

    public void hranesteAnimale(String mancare){
        for (Animal animal: this.animals){
            this.ingrijitorZoo.hranesteAnimal(animal,mancare);
        }


    }}
