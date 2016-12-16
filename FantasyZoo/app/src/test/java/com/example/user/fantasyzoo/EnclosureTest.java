package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class EnclosureTest {

    Enclosure testEnclosure;

    @Before
    public void before(){
        testEnclosure = new Enclosure("North Enclosure");
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




}
