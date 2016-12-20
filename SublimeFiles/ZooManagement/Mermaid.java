public class Mermaid extends Creature implements Swimmable {

    public Mermaid(String name) {
        super(name);
    }

    public String swim(){
        return "just keep swimming, just keep swimming...";
    }

    @Override
    public String escape(){
        return this.name + " is out of the water and can't breathe - get help!";
    }
}
