public class Unicorn extends Creature implements Flyable {

    public Unicorn(String name) {
        super(name);
    }

    public String fly(){
        return "ascends gracefully into the air";
    }


}