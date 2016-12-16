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
    public void testBuildEnclosure(){
        Enclosure newEnclosure = new Enclosure("South Enclosure");
        String result = manager.buildEnclosure(newEnclosure, "open", "water");
        assertEquals("South Enclosure added", result);
    }

    @Test
    public void testSourceNewAnimal() {
        Unicorn unicorn = new Unicorn("Sparkles");
        Dragon dragon = new Dragon("Smoky");
        String result1 = manager.sourceNewAnimal(unicorn);
        String result2 = manager.sourceNewAnimal(dragon);
        System.out.println(result1);
        System.out.println(result2);
        assertEquals(2, manager.zoo.countAnimalsInHoldingPen());
    }

    @Test
    public void testMatchAnimalToEnclosure(){
        Dragon dragon = new Dragon("Smoky");
        Mermaid mermaid = new Mermaid("Ariel");
        manager.sourceNewAnimal(dragon);
        manager.sourceNewAnimal(mermaid);
        Enclosure newEnclosure = new Enclosure("South Enclosure");
        manager.buildEnclosure(newEnclosure, "open", "water");
        String result1 = manager.matchAnimalToEnclosure("Smoky");
        assertEquals("No suitable enclosure", result1);
        String result2 = manager.matchAnimalToEnclosure("Ariel");
        assertEquals("South Enclosure", result2);

    }

}
