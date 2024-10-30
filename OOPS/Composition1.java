// package OOPS;
// import java.util.*;

// public class Composition1 {
//   public static void main(String[] args) {

//     Car car = new Car(121, 4);
//     car.startCar();
//     car.stopCar();
//   }

// }

// class Car {
//   // Car - has a relationship

//   private Engine engine;
//   private List<Wheel> wheels;

//   public Car(int horsePower, int size) {

//     this.engine = new Engine(horsePower);
//     this.wheels = new ArrayList<>();
//     for (int i = 1; i <= 4; i++) {
//       wheels.add(new Wheel(i));
//     }
//   }

//   public void startCar() {
//     engine.start();
//     for (Wheel wheel : wheels) {
//       wheel.rotate();
//     }
//   }

//   public void stopCar() {
//     engine.stop();

//   }

// }

// class Engine {
//   private int horsePower;

//   public Engine(int horsePower) {
//     this.horsePower = horsePower;
//   }

//   public int getHorsePower() {
//     return horsePower;
//   }

//   public void start() {
//     System.out.println("Engine with horse power " + horsePower + " HP started");
//   }

//   public void stop() {
//     System.out.println(this.hashCode() + "Engine stopped");
//   }
// }

// class Wheel {

//   private int size;

//   public Wheel(int size) {
//     this.size = size;
//   }

//   public int getSize() {
//     return size;

//   }

//   public void rotate() {
//     System.out.println("Wheel of size " + size + " is rotating");
//   }

// }
