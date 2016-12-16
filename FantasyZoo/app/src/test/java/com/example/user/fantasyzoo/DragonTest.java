package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class DragonTest {

    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Smoky");
    }

    @Test
    public void testGetName(){
        assertEquals("Smoky", dragon.getName());
    }

    @Test
    public void testCanFly(){
        assertEquals("beats wings and kicks off into air", dragon.fly());
    }

    @Test
    public void testCanBreatheFire(){
        assertEquals("incinerates", dragon.breatheFire());
    }
}
