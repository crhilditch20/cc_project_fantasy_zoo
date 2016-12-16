package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class EnclosureTest {

    Enclosure testEnclosure;
    Dragon dragon;

    @Before
    public void before(){
        testEnclosure = new Enclosure("North Enclosure");
        dragon = new Dragon("Smoky");
    }

    @Test
    public void testGetName(){
        assertEquals("North Enclosure", testEnclosure.getName());
    }

    @Test
    public void testSetTerrain(){
        testEnclosure.setTerrain("closed", "rocky");
        assertEquals("closed", testEnclosure.terrain.get("Roof"));
        assertEquals("rocky", testEnclosure.terrain.get("Landscape"));
    }

    @Test
    public void testCountAnimals(){
        assertEquals(0, testEnclosure.countAnimals());
    }

    @Test
    public void testSuccessfullyAddAnimal(){
        testEnclosure.addAnimal(dragon);
        assertEquals(1, testEnclosure.countAnimals());
    }




}
