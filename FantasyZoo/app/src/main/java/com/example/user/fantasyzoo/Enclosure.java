package com.example.user.fantasyzoo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 15/12/2016.
 */
public class Enclosure {

    String name;
    HashMap<String, String> terrain;
    ArrayList<Creature> animals;

    public Enclosure(String name) {
        this.name = name;
        this.terrain = new HashMap<String, String>();
        this.animals = new ArrayList<Creature>();
    }


    public String getName(){
        return this.name;
    }

    public void setTerrain(String roof, String landscape){
        this.terrain.put("Roof", roof);
        this.terrain.put("Landscape", landscape);
    }

    public int countAnimals(){
        return this.animals.size();
    }

    public void addAnimal(Creature animal){
        animals.add(animal);
    }

    public String removeAnimal(Creature animal){
        if (animals.contains(animal)) {
            animals.remove(animal);
            return animal.getName() + " removed from enclosure";
        }
        else return animal.getName() + " is not in this enclosure...has it escaped??";
    }





}
