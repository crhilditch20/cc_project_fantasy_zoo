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
    public void testSourceNewAnimal() {
        Unicorn unicorn = new Unicorn("Sparkles");
        Dragon dragon = new Dragon("Smoky");
        String result1 = manager.sourceNewAnimal(unicorn);
        String result2 = manager.sourceNewAnimal(dragon);
        System.out.println(result1);
        System.out.println(result2);
        assertEquals(2, manager.zoo.countAnimalsInHoldingPen());
    }
}
