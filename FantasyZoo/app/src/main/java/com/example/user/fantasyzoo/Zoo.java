package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */
public class Zoo {

    String name;
    ArrayList<Enclosure> enclosures;
    ArrayList<Creature> holdingPen;

    public Zoo(String name){
        this.name = name;
        this.enclosures = new ArrayList<>();
        this.holdingPen = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public String addEnclosure(Enclosure newEnclosure){
        enclosures.add(newEnclosure);
        return newEnclosure.getName() + " added";
    }

    public void addAnimalToHoldingPen(Creature animal){
        holdingPen.add(animal);
    }

    public int countAnimalsInHoldingPen(){
        return holdingPen.size();
    }

    public Creature getAnimalFromHoldingPen(String name){
        for (Creature animal : holdingPen){
            if (animal.getName().equals(name)){
               return animal;
            }
        }
        return null;
    }
}


