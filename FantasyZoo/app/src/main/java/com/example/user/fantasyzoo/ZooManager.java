package com.example.user.fantasyzoo;

/**
 * Created by user on 16/12/2016.
 */
public class ZooManager {

    Zoo zoo;

    public ZooManager(Zoo zoo){
        this.zoo = zoo;
    }

    public String sourceNewAnimal(Creature animal){
        zoo.addAnimalToHoldingPen(animal);
        int newCount = zoo.countAnimalsInHoldingPen();
        return animal.getName() + " is waiting for an enclosure. There is/are now " + newCount + " animal(s) in the holding pen";
    }
}
