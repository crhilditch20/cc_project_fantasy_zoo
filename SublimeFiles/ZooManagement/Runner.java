import java.util.*;

class Runner{
  public static void main(String[] args) {
    Zoo zoo = new Zoo("Imaginimals");
    ZooManager zooManager = new ZooManager(zoo);

    System.out.println("Welcome to " + zoo.getName() + "! As Zoo Manager you have some work to do...");

    System.out.println("First you'll need to build some enclosures.");

    Enclosure enclosure1 = new Enclosure("North Enclosure", "closed", "rocky");


  }

}