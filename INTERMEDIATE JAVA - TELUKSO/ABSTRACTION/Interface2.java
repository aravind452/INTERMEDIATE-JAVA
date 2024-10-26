package ABSTRACTION;

public class Interface2 implements Engine, Brake, Media {

  int a;

  @Override
  public void acc() {
    System.out.println("Accelerating");

  }

  @Override
  public void startEngine() {
    System.out.println("Engine started");

  }

  @Override
  public void stop() {
    System.out.println("Engine stopped");

  }

  @Override
  public void applyBrake() {
    System.out.println("Brake applied");

  }

  @Override
  public void playMedia() {

  }

  public static void main(String[] args) {
    // Interface2 i = new Interface2();
    // i.acc();

    Media m = new Interface2();
    m.stop(); // this is an issue cuz stopping the media stops the car itself - for solution
              // refer NiceCar

  }

}

interface Engine {

  int a = 76;

  /*
   * All methods in an interface are implicitly public and abstract
   * Interfaces can declare constants, which are implicitly public, static, and
   * final. So, any class implementing the interface can use these constants.
   * 
   * Since Java 8, interfaces can have default methods with a method body. This
   * allows you to add new methods to an interface without breaking existing
   * implementations.
   * 
   * Interfaces can also have static methods since Java 8, which belong to the
   * interface itself and can be called without implementing the interface.
   * 
   * Introduced in Java 9, private methods in interfaces help modularize code
   * within the interface itself and are only accessible by other methods within
   * the interface.
   */
  void startEngine();

  void stop();

  void acc();

  int price = 7000;
}

interface Brake {
  void applyBrake();

}

interface Media {
  void playMedia();

  void stop();
}