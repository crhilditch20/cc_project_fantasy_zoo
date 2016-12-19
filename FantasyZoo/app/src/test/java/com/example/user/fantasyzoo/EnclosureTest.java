package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class EnclosureTest {

    Enclosure testEnclosure;
    Dragon dragon;

    @Before
    public void before(){
        testEnclosure = new Enclosure("North Enclosure", "open", "water");
        dragon = new Dragon("Smoky");
    }

    @Test
    public void testGetName(){
        assertEquals("North Enclosure", testEnclosure.getName());
    }

    @Test
    public void testGetTerrain(){
        assertEquals("open", testEnclosure.getTerrain("Roof"));
    }


//    @Test
//    public void testSetTerrain(){
//        testEnclosure.setTerrain("closed", "rocky");
//        assertEquals("closed", testEnclosure.terrain.get("Roof"));
//        assertEquals("rocky", testEnclosure.terrain.get("Landscape"));
//    }

    @Test
    public void testCountAnimals(){
        assertEquals(0, testEnclosure.countAnimals());
    }

    @Test
    public void testAddAnimal(){
        testEnclosure.addAnimal(dragon);
        assertEquals(1, testEnclosure.countAnimals());
    }

    @Test
    public void testRemoveAnimal(){
        testEnclosure.addAnimal(dragon);
        assertEquals(1, testEnclosure.countAnimals());
        String resultSuccess = testEnclosure.removeAnimal(dragon);
        assertEquals("Smoky removed from enclosure",resultSuccess);
        assertEquals(0, testEnclosure.countAnimals());
        String resultFail = testEnclosure.removeAnimal(dragon);
        assertEquals("Smoky is not in this enclosure...has it escaped??", resultFail);
    }

//    @Test
//    public void testEscapeWarning(){
//
//    }






}
