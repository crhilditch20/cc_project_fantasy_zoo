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

    public String eat(Food food){
        return "Nom nom nom...";
    }

    public String escape(){
        return this.name + " is on the rampage!!";
    }

}