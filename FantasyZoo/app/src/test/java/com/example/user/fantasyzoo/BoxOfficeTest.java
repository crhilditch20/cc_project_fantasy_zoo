package com.example.user.fantasyzoo;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;


/**
 * Created by user on 19/12/2016.
 */
public class BoxOfficeTest {

    BoxOffice boxOffice;

    @Before
    public void before() {
        boxOffice = new BoxOffice(200);
        boxOffice.setPricing(10, 5, 8);
    }

    @Test
    public void testSetPricing() {
        assertEquals(10, boxOffice.getPrice("Full"));
    }

    @Test
    public void testGetPrice() {
        assertEquals(8, boxOffice.getPrice("Concession"));
    }

    @Test
    public void testSellTicket(){
        boxOffice.sellTicket(5, "Full");
        assertEquals(195, boxOffice.checkCapacity());
        assertEquals(50, boxOffice.showIncome());
    }

}


