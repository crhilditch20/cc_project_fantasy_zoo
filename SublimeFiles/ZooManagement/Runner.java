import java.util.*;

class Runner{
  public static void main(String[] args) {
    Zoo zoo = new Zoo("Imaginimals");
    ZooManager zooManager = new ZooManager(zoo);
    Dragon dragon = new Dragon("Smoky");
    Unicorn unicorn = new Unicorn("Sparkles");
    Mermaid mermaid = new Mermaid("Ariel");

    System.out.println("Welcome to " + zoo.getName() + "! As Zoo Manager you have some work to do...");

    System.out.println("First you'll need to build some enclosures. Type 'build' to get started.");
    System.console().readLine();
      System.out.println("Choose a name for the new enclosure");
      String newEnclosureName = System.console().readLine();
      System.out.println("Choose a landscape: rocky, forest or water");
      String landscape = System.console().readLine();
      System.out.println("Now choose an open or closed roof - in case you buy some flying creatures!");
      String roof = System.console().readLine();
      Enclosure newEnclosure = new Enclosure(newEnclosureName, roof, landscape);
      System.out.println(zoo.addEnclosure(newEnclosure));

    System.out.println("Now you'll need some animals...here's the animal shopping list at MythicalBeastsDirect.com: Dragon £900, Unicorn £700, Mermaid £1200. Which would you like to buy?");
    String userChoice = System.console().readLine();
      if (userChoice.equals("Dragon")){
        System.out.println(zooManager.sourceNewAnimal(dragon, 900));
      }
      else if (userChoice.equals("Unicorn")){
        System.out.println(zooManager.sourceNewAnimal(unicorn, 700));
      }
      else if (userChoice.equals("Mermaid")){
        System.out.println(zooManager.sourceNewAnimal(mermaid, 1200));
      }
      else System.out.println("That animal isn't available to buy...");
      
      System.out.println("Now you need to add your new animal to an enclosure. Enter your new animal's name to match them to an enclosure.");
      String animalName = System.console().readLine();
      String enclosureName = zooManager.matchAnimalToEnclosure(animalName);
      if (enclosureName.equals("No suitable enclosure")){
        System.out.println(enclosureName + ". You'll need to build one that would suit your animal. Type 'build' to get started.");
      }
       else System.out.println("The best enclosure is: " + enclosureName + ". Type 'add' to add animal to this enclosure.");
        String addOrBuild = System.console().readLine();
      if (addOrBuild.equals("add")){
        System.out.println(zooManager.moveAnimalToEnclosure(animalName, enclosureName));
      }
      if (addOrBuild.equals("build")){
        System.out.println("Choose a name for the new enclosure");
        String anotherEnclosureName = System.console().readLine();
        System.out.println("Choose a landscape for your animal: rocky, forest or water");
        String newLandscape = System.console().readLine();
        System.out.println("Now choose an open or closed roof");
        String newRoof = System.console().readLine();
        Enclosure anotherEnclosure = new Enclosure(anotherEnclosureName, newRoof, newLandscape);
        System.out.println(zoo.addEnclosure(anotherEnclosure));
      }

      


       

  }

}