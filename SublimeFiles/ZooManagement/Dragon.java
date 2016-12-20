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

    @Override
    public String eat(Food food){
        if (food.getType().equals("vegetarian")){
            return breatheFire();
        }
        else return "Nom nom nom...";
    }
}
