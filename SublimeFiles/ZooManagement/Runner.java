import java.util.*;

class Runner{
  public static void main(String[] args) {
    Zoo zoo = new Zoo("Imaginimals");
    ZooManager zooManager = new ZooManager(zoo);
    Dragon dragon = new Dragon("Smoky");
    Unicorn unicorn = new Unicorn("Sparkles");
    Mermaid mermaid = new Mermaid("Ariel");

    System.out.println("Welcome to " + zoo.getName() + "! As Zoo Manager you have some work to do...");

    System.out.println("First you'll need to build some enclosures.");

    Enclosure enclosure1 = new Enclosure("North Enclosure", "closed", "rocky");
    Enclosure enclosure2 = new Enclosure("West Enclosure", "closed", "forest");
    System.out.println(zoo.addEnclosure(enclosure1));
    System.out.println(zoo.addEnclosure(enclosure2));

    System.out.println("Now you'll need some animals...here's the animal shopping list at MythicalBeastsDirect.com: Dragon £900, Unicorn £700, Mermaid £1200. Which would you like to buy?");
    String userChoice = System.console().readLine();
      if (userChoice.equals("Dragon")){
        Creature chosenAnimal = dragon;
        System.out.println(zooManager.sourceNewAnimal(dragon, 900));
      }
      else if (userChoice.equals("Unicorn")){
        Creature chosenAnimal = unicorn;
        System.out.println(zooManager.sourceNewAnimal(unicorn, 700));
      }
      else if (userChoice.equals("Mermaid")){
        Creature chosenAnimal = mermaid;
        System.out.println(zooManager.sourceNewAnimal(mermaid, 1200));
      }
      else System.out.println("That animal isn't available to buy...");
      
      System.out.println("Now you need to add your new animal to an enclosure. Enter your new animal's name to match them to an enclosure.");
      String animalName = System.console().readLine();
      String enclosureName = zooManager.matchAnimalToEnclosure(animalName);
        System.out.println("The best enclosure is: " + enclosureName + ". Type 'add' to add animal to this enclosure.");
        System.console().readLine();
        Enclosure enclosureForAnimal = zoo.searchEnclosureByName(enclosureName);
        enclosureForAnimal.addAnimal(chosenAnimal);


       

  }

}