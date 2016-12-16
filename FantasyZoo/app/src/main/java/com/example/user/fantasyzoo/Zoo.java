package com.example.user.fantasyzoo;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */
public class Zoo {

    String name;
    ArrayList<Enclosure> enclosures;

    public Zoo(String name){
        this.name = name;
        this.enclosures = new ArrayList<Enclosure>();
    }

    public String getName(){
        return this.name;
    }

    public String addEnclosure(Enclosure newEnclosure){
        enclosures.add(newEnclosure);
        return newEnclosure.getName() + " added";
    }
}


