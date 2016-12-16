package com.example.user.fantasyzoo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */
public class FoodTest {

    @Test
    public void testFoodType(){
        Food food = new Food("vegetarian");
        assertEquals("vegetarian", food.getType());
    }
}
