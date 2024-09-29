package ABSTRACTION;

public class AbstractUsecases {
  public static void main(String[] args) {
    Car c = new WagonR();
    c.drive();
    c.playMusic();
    // c.newM();

  }

}

// Abstract class can have both abstract and non-abstract methods
abstract class Car {
  public abstract void drive();

  public void playMusic() {
    System.out.println("Playing music");
  }

}

class WagonR extends Car {
  public void drive() {

    System.out.println("WagonR is driving");
  }

  public void playMusic() {

    System.out.println("WagonR is playing music");
  }

  public void newM() {
    System.out.println("new method");
  }

}