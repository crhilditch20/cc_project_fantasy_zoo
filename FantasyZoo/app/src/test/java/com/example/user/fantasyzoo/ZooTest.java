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

    @Before
    public void before(){
        zoo = new Zoo("Imaginamals");
        enclosure = new Enclosure("West Enclosure");
    }

    @Test
    public void testZooName(){
        assertEquals("Imaginamals", zoo.getName());
    }

    @Test
    public void testAddEnclosure(){
        assertEquals("West Enclosure added", zoo.addEnclosure(enclosure));
    }
}
