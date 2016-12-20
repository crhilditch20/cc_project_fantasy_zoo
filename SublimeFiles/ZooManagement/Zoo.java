import java.util.ArrayList;

public class Zoo {

    String name;
    ArrayList<Enclosure> enclosures;
    ArrayList<Creature> holdingPen;
    BoxOffice boxOffice;
    int totalIncome;

    public Zoo(String name){
        this.name = name;
        this.enclosures = new ArrayList<>();
        this.holdingPen = new ArrayList<>();
        this.boxOffice = new BoxOffice();
        this.totalIncome = 1000;
    }

    public String getName(){
        return this.name;
    }

    public String addEnclosure(Enclosure newEnclosure){
        enclosures.add(newEnclosure);
        return newEnclosure.getName() + " added";
    }

    public String searchEnclosures(String condition){
        String bestEnclosure = "No suitable enclosure";
        for (Enclosure enclosure : enclosures){
            if (enclosure.terrain.get("Roof").equals(condition)){
                bestEnclosure = enclosure.getName();
            }
            else if (enclosure.terrain.get("Landscape").equals(condition)){
                bestEnclosure = enclosure.getName();
            }
        }
        return bestEnclosure;
    }

    public void addAnimalToHoldingPen(Creature animal){
        holdingPen.add(animal);
    }

    public int countAnimalsInHoldingPen(){
        return holdingPen.size();
    }

    public Creature getAnimalFromHoldingPen(String name){
        for (Creature animal : holdingPen){
            if (animal.getName().equals(name)){
               return animal;
            }
        }
        return null;
    }

    public void setTotalIncome(int amount){
        this.totalIncome += amount;
    }

    public int getTotalIncome(){
        return this.totalIncome;
    }

    public String initiateRampage(){
        for (Enclosure enclosure : enclosures){
            for (Creature animal : enclosure.animals){
                return animal.escape();
            }
        }
        return "All is calm, no animals escaped...";
    }

}
