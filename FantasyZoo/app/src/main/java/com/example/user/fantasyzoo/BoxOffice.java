package com.example.user.fantasyzoo;

import java.util.HashMap;

/**
 * Created by user on 19/12/2016.
 */
public class BoxOffice {

    HashMap<String, Integer> pricing;
    int capacity;
    int income;

    public BoxOffice(int capacity){
        this.pricing = new HashMap();
        this.capacity = capacity;
        this.income = 0;
    }

    public void setPricing(Integer fullPrice, Integer childPrice, Integer concPrice){
        pricing.put("Full", fullPrice);
        pricing.put("Child", childPrice);
        pricing.put("Concession", concPrice);
    }

    public int getPrice(String priceType){
        return pricing.get(priceType).intValue();
    }

    public void sellTicket(int quantity, String priceType){
        int price = getPrice(priceType);
        capacity -= quantity;
        income += (price * quantity);
    }

    public int checkCapacity(){
        return this.capacity;
    }

    public int showIncome(){
        return this.income;
    }
}
