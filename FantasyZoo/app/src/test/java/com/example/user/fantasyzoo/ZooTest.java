package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by user on 16/12/2016.
 */
public class ZooTest {

    Zoo zoo;
    BoxOffice boxOffice;
    Enclosure enclosure;
    Dragon dragon;

    @Before
    public void before() {
        zoo = new Zoo("Imaginamals");
        enclosure = new Enclosure("West Enclosure", "closed", "rocky");
        dragon = new Dragon("Smoky");
    }

    @Test
    public void testZooName() {
        assertEquals("Imaginamals", zoo.getName());
    }

    @Test
    public void testAddEnclosure() {
        assertEquals("West Enclosure added", zoo.addEnclosure(enclosure));
    }

    @Test
    public void testAddToHoldingPen() {
        int resultBefore = this.zoo.countAnimalsInHoldingPen();
        assertEquals(0, resultBefore);
        zoo.addAnimalToHoldingPen(dragon);
        int resultAfter = this.zoo.countAnimalsInHoldingPen();
        assertEquals(1, resultAfter);
    }

    @Test
    public void testGetFromHoldingPen() {
        zoo.addAnimalToHoldingPen(dragon);
        Creature animal = zoo.getAnimalFromHoldingPen("Smoky");
        assertEquals("Smoky", animal.getName());
    }

    @Test
    public void testSearchEnclosureByName(){
        Enclosure enclosure1 = new Enclosure("North Enclosure", "closed", "rocky");
        zoo.addEnclosure(enclosure1);
        Enclosure enclosureFound = zoo.searchEnclosureByName("North Enclosure");
        assertEquals("closed", enclosureFound.getTerrain("Roof"));
    }

    @Test
    public void testSearchEnclosure(){
        Enclosure enclosure1 = new Enclosure("North Enclosure", "closed", "rocky");
        zoo.addEnclosure(enclosure1);
        String result = zoo.searchEnclosures("closed");
        assertEquals("North Enclosure", result);
    }

    @Test
    public void testSetTotalIncome(){
        zoo.setTotalIncome(100);
        assertEquals(1100, zoo.getTotalIncome());
    }

    @Test
    public void testInitiateRampage(){
        Enclosure enclosure2 = new Enclosure("South Enclosure", "closed", "rocky");
        zoo.addEnclosure(enclosure2);
        enclosure2.addAnimal(dragon);
        System.out.println(zoo.initiateRampage());
    }
}
