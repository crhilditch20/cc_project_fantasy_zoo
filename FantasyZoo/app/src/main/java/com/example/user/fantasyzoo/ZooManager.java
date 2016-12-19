package com.example.user.fantasyzoo;

/**
 * Created by user on 16/12/2016.
 */
public class ZooManager {

    Zoo zoo;

    public ZooManager(Zoo zoo){
        this.zoo = zoo;
    }

    public String buildEnclosure(String name, String roof, String landscape){
        Enclosure newEnclosure = new Enclosure(name, roof, landscape);
        return zoo.addEnclosure(newEnclosure);
    }

    public String sourceNewAnimal(Creature animal){
        zoo.addAnimalToHoldingPen(animal);
        int newCount = zoo.countAnimalsInHoldingPen();
        return animal.getName() + " is waiting for an enclosure. There is/are now " + newCount + " animal(s) in the holding pen";
    }

    public String matchAnimalToEnclosure(String animalName){
        Creature animalToMatch = zoo.getAnimalFromHoldingPen(animalName);
        String suitableEnclosure = "No suitable enclosures";
        if (animalToMatch instanceof Flyable){
            suitableEnclosure = zoo.searchEnclosures("closed");
        }
        else if (animalToMatch instanceof Flammable){
            suitableEnclosure = zoo.searchEnclosures("rocky");
        }
        else if (animalToMatch instanceof Swimmable){
           suitableEnclosure = zoo.searchEnclosures("water");
        }
        return suitableEnclosure;
    }


}
