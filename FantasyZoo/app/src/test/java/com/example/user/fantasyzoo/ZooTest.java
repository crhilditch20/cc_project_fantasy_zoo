package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by user on 16/12/2016.
 */
public class ZooTest {

    Zoo zoo;
    Enclosure enclosure;
    Dragon dragon;

    @Before
    public void before(){
        zoo = new Zoo("Imaginamals");
        enclosure = new Enclosure("West Enclosure");
        dragon = new Dragon("Smoky");
    }

    @Test
    public void testZooName(){
        assertEquals("Imaginamals", zoo.getName());
    }

    @Test
    public void testAddEnclosure(){
        assertEquals("West Enclosure added", zoo.addEnclosure(enclosure));
    }

    @Test
    public void testAddToHoldingPen(){
        int resultBefore = this.zoo.countAnimalsInHoldingPen();
        assertEquals(0, resultBefore);
        zoo.addAnimalToHoldingPen(dragon);
        int resultAfter = this.zoo.countAnimalsInHoldingPen();
        assertEquals(1,resultAfter);
    }

    @Test
    public void testGetFromHoldingPen(){
        zoo.addAnimalToHoldingPen(dragon);
        Creature animal = zoo.getAnimalFromHoldingPen("Smoky");
        assertEquals("Smoky", animal.getName());
    }
}
