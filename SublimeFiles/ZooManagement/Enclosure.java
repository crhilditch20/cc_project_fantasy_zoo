import java.util.ArrayList;
import java.util.HashMap;

public class Enclosure {

    String name;
    HashMap<String, String> terrain;
    ArrayList<Creature> animals;

    public Enclosure(String name, String roof, String landscape) {
        this.name = name;
        this.terrain = new HashMap<String, String>();
        this.animals = new ArrayList<Creature>();
        setTerrain(roof, landscape);
    }


    public String getName(){
        return this.name;
    }

    public String getTerrain(String key){
        return this.terrain.get(key);
    }

    public void setTerrain(String roof, String landscape){
        this.terrain.put("Roof", roof);
        this.terrain.put("Landscape", landscape);
    }

    public int countAnimals(){
        return this.animals.size();
    }

    public void addAnimal(Creature animal){
        animals.add(animal);
    }

    public String removeAnimal(Creature animal){
        if (animals.contains(animal)) {
            animals.remove(animal);
            return animal.getName() + " removed from enclosure";
        }
        else return animal.getName() + " is not in this enclosure...has it escaped??";
    }

}
