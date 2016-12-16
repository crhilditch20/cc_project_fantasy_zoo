package com.example.user.fantasyzoo;

/**
 * Created by user on 15/12/2016.
 */
public abstract class Creature {
    String name;

    public Creature(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String sleep(){
        return "Zzzzz....";
    }

    public String eat(){
        return "Nom nom nom...";
    }

}
