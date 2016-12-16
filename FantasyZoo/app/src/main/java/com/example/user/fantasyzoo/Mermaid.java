package com.example.user.fantasyzoo;

/**
 * Created by user on 16/12/2016.
 */
public class Mermaid extends Creature implements Swimmable {

    public Mermaid(String name) {
        super(name);
    }

    public String swim(){
        return "just keep swimming, just keep swimming...";
    }
}
