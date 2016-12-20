package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Created by user on 16/12/2016.
 */
public class ZooManagerTest {

    Zoo zoo;
    ZooManager manager;

    @Before
    public void before(){
        zoo = new Zoo("Imaginamals");
        manager = new ZooManager(zoo);
    }

    @Test
    public void testSourceNewAnimalSuccess() {
        Unicorn unicorn = new Unicorn("Sparkles");
        Dragon dragon = new Dragon("Smoky");
        String result1 = manager.sourceNewAnimal(unicorn, 100);
        String result2 = manager.sourceNewAnimal(dragon, 200);
        System.out.println(result1);
        System.out.println(result2);
        assertEquals(2, manager.zoo.countAnimalsInHoldingPen());
        assertEquals(700, zoo.getTotalIncome());
    }

    @Test
    public void testSourceNewAnimalFailure(){
        Unicorn unicorn = new Unicorn("Sparkles");
        String result = manager.sourceNewAnimal(unicorn, 1200);
        assertEquals("The zoo can't afford this animal!", result);
    }

    @Test
    public void testMatchAnimalToEnclosure(){
        Dragon dragon = new Dragon("Smoky");
        Mermaid mermaid = new Mermaid("Ariel");
        manager.sourceNewAnimal(dragon, 200);
        manager.sourceNewAnimal(mermaid, 200);
        Enclosure enclosure1 = new Enclosure("South Enclosure", "open", "water");
        Enclosure enclosure2 = new Enclosure("West Enclosure", "closed", "rocky");
        Enclosure enclosure3 = new Enclosure("North Enclosure", "closed", "forest");
        zoo.addEnclosure(enclosure1);
        zoo.addEnclosure(enclosure2);
        zoo.addEnclosure(enclosure3);
        String result1 = manager.matchAnimalToEnclosure("Smoky");
        assertEquals("West Enclosure", result1);
        String result2 = manager.matchAnimalToEnclosure("Ariel");
        assertEquals("South Enclosure", result2);
    }

    @Test
    public void testMoveAnimalToEnclosure(){
        Dragon dragon = new Dragon("Smoky");
        zoo.addAnimalToHoldingPen(dragon);
        Enclosure enclosure2 = new Enclosure("West Enclosure", "closed", "rocky");
        zoo.addEnclosure(enclosure2);
        manager.moveAnimalToEnclosure("Smoky", "West Enclosure");
        assertEquals(0, zoo.countAnimalsInHoldingPen());
        assertEquals(1, enclosure2.countAnimals());
    }

}
