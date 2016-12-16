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

    public String addAnimalIfTerrainSuits(Creature animal){
        String unsuitable = "The terrain in this enclosure is not suitable for this animal!";
        String suitable = animal.getName() + " is settling into their new enclosure";
        if (animal instanceof Flyable && this.terrain.get("Roof").equals("closed")){
            animals.add(animal);
            return suitable;
        }
        else if (animal instanceof Swimmable && this.terrain.get("Landscape").equals("water")){
            animals.add(animal);
            return suitable;
        }
        else return unsuitable;
    }




}
