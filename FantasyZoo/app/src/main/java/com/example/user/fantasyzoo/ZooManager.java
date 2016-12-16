package com.example.user.fantasyzoo;

/**
 * Created by user on 16/12/2016.
 */
public class ZooManager {

    Zoo zoo;

    public ZooManager(Zoo zoo){
        this.zoo = zoo;
    }

    public String buildEnclosure(Enclosure newEnclosure, String roof, String landscape){
        newEnclosure.setTerrain(roof, landscape);
        return zoo.addEnclosure(newEnclosure);
    }

    public String sourceNewAnimal(Creature animal){
        zoo.addAnimalToHoldingPen(animal);
        int newCount = zoo.countAnimalsInHoldingPen();
        return animal.getName() + " is waiting for an enclosure. There is/are now " + newCount + " animal(s) in the holding pen";
    }

    public void matchAnimalToEnclosure(Creature animal){

    }

}
