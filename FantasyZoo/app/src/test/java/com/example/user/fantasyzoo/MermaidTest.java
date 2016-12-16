package com.example.user.fantasyzoo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class MermaidTest {

    Mermaid mermaid;

    @Before
    public void before(){
        mermaid = new Mermaid("Ariel");
    }

    @Test
    public void testGetName(){
        assertEquals("Ariel", mermaid.getName());
    }

    @Test
    public void testCanSwim(){
        assertEquals("just keep swimming, just keep swimming...", mermaid.swim());
    }

    @Test
    public void testCanSleep(){
        assertEquals("Zzzzz....", mermaid.sleep());
    }

    @Test
    public void testCanEat(){
        assertEquals("Nom nom nom...", mermaid.eat());
    }
}


