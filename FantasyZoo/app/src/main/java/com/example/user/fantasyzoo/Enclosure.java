package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 15/12/2016.
 */
public class Enclosure {

    String name;
    String terrain;
    ArrayList<Creature> containedAnimals;
    ArrayList<Creature> prohibitedAnimals;

    public Enclosure(String name, String terrain){
        this.name = name;
        this.terrain = terrain;
    }

    public String getName(){
        return this.name;
    }

    public String getTerrain(){
        return this.terrain;
    }

    public void prohibitAnimal(Creature animal){
        prohibitedAnimals.add(animal);
    }

    public String addAnimal(Creature animal) {
        if (!prohibitedAnimals.contains(animal)) {
            containedAnimals.add(animal);
            return animal + " added to " + this.name;
        } else return animal + " cannot be added to " + this.name + ": unsuitable terrain!";
    }

}