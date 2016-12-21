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
      System.out.println(zoo.addEnclosure(newEnclosure) + " Type 'build' to add another.");
      System.console().readLine();
      System.out.println("Choose a name for the new enclosure");
      String newEnclosureName2 = System.console().readLine();
      System.out.println("Choose a landscape: rocky, forest or water");
      String landscape2 = System.console().readLine();
      System.out.println("Now choose an open or closed roof.");
      String roof2 = System.console().readLine();
      Enclosure newEnclosure2 = new Enclosure(newEnclosureName2, roof2, landscape2);
      System.out.println(zoo.addEnclosure(newEnclosure));

      System.out.println("Now you'll need some animals...here's the animal shopping list at MythicalBeastsDirect.com: Dragon £900, Unicorn £700, Mermaid £1200. Type 'bank' to see how much money the zoo has in the bank.");
      System.console().readLine();
      System.out.println("You have: £" + zooManager.countIncome() + " available to spend. Which animal would you like to buy?");
    String userChoice = System.console().readLine();
    Creature userAnimal;
      if (userChoice.equals("Dragon")){
        userAnimal = dragon;
        System.out.println(zooManager.sourceNewAnimal(userAnimal, 900));
      }
      else if (userChoice.equals("Unicorn")){
        userAnimal = unicorn;
        System.out.println(zooManager.sourceNewAnimal(userAnimal, 700));
      }
      else {
        userAnimal = mermaid;
        System.out.println(zooManager.sourceNewAnimal(userAnimal, 1200));
      }
      
      System.out.println("Now you need to add your new animal to an enclosure. Type 'add' to continue.");
      System.console().readLine();
      String animalName = userAnimal.getName();
      String enclosureName = zooManager.matchAnimalToEnclosure(animalName);
      if (enclosureName.equals("No suitable enclosure")){
        System.out.println(enclosureName + ". You'll need to build one that would suit your animal. Type 'build' to get started.");
      }
       else System.out.println("The best enclosure for this type of animal is: " + enclosureName + ". Type 'add' to add animal to this enclosure.");
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
        System.out.println(zoo.addEnclosure(anotherEnclosure) + ". Type 'add' to add animal to this enclosure.");
        System.console().readLine();
        System.out.println(zooManager.moveAnimalToEnclosure(animalName, enclosureName));
      }
        System.out.println("Time to feed your animal! Think what your animal might like to eat and type it here:");
        Food food = new Food(System.console().readLine());
        System.out.println(userAnimal.eat(food));

       

  }

}