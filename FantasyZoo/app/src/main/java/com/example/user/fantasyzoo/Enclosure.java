package com.example.user.fantasyzoo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 15/12/2016.
 */
public class Enclosure {

    String name;
    HashMap<String, String> terrain;
    ArrayList<Creature> containedAnimals;
    ArrayList<Creature> prohibitedAnimals;

    public Enclosure(String name){
        this.name = name;
        this.terrain = new HashMap<String, String>();
        this.containedAnimals = new ArrayList<Creature>();
        this.prohibitedAnimals = new ArrayList<Creature>();
    }

    public String getName(){
        return this.name;
    }

    public void setTerrain(String roof, String landscape){
        this.terrain.put("Roof", roof);
        this.terrain.put("Landscape", landscape);
    }


//    public void prohibitAnimal(Creature animal){
//        prohibitedAnimals.add(animal);
//    }

//    public String addAnimal(Creature animal) {
//        if (!prohibitedAnimals.contains(animal)) {
//            containedAnimals.add(animal);
//            return animal + " added to " + this.name;
//        } else return animal + " cannot be added to " + this.name + ": unsuitable terrain!";
//    }

}
