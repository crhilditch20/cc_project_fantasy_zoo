package com.example.user.fantasyzoo;

/**
 * Created by user on 15/12/2016.
 */
public class Unicorn extends Creature implements Flyable {

    public Unicorn(String name) {
        super(name);
    }

    public String fly(){
        return "ascends gracefully into the air";
    }


}
