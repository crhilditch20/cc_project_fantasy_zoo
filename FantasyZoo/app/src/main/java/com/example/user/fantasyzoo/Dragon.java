package com.example.user.fantasyzoo;

/**
 * Created by user on 16/12/2016.
 */
public class Dragon extends Creature implements Flyable, Flammable {

    public Dragon(String name){
        super(name);
    }

    public String fly(){
        return "beats wings and kicks off into air";
    }

    public String breatheFire(){
        return "incinerates";
    }
}
