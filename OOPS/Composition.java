package OOPS;

public class Composition {

  public static void main(String[] args) {
    Car c = new Car();
    c.start();
  }

}

class Engine {
  public Engine() {

  }

  public void start() {
    System.out.println("Engine started");
  }
}

class Car {
  Engine engine;

  public Car() {
    engine = new Engine();
  }

  public void start() {
    engine.start();
  }
}