package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 15/12/2016.
 */
public class UnicornTest {

    Unicorn unicorn;

    @Before
    public void before(){
        unicorn = new Unicorn("Rainbow");
    }

    @Test
    public void testGetName(){
        assertEquals("Rainbow", unicorn.getName());
    }

    @Test
    public void testCanFly(){
        assertEquals("ascends gracefully into the air", unicorn.fly());
    }

    @Test
    public void testCanSleep(){
        assertEquals("Zzzzz....", unicorn.sleep());
    }

    @Test
    public void testCanEat(){
        assertEquals("Nom nom nom...", unicorn.eat());
    }
}
