package ABSTRACTION;

public class NiceCar {
  Engine1 engine1;
  Media1 media1;

  public NiceCar() {
    engine1 = new ElectricEngine();
    media1 = new CdPlayer();
  }

  public void start() {
    engine1.start();
  }

  public void stop() {
    engine1.stop();
  }

  public void startMedia() {
    media1.play();

  }

  public void stopMedia() {
    media1.stop();

  }

  public static void main(String[] args) {
    NiceCar car = new NiceCar();
    car.start();
    car.startMedia();

  }

}

class ElectricEngine implements Engine1 {

  @Override
  public void acc() {
    System.out.println("ElectricEngine acc");

  }

  @Override
  public void start() {
    System.out.println("Electric engine started");

  }

  @Override
  public void stop() {
    System.out.println("Electric engine stopped");

  }

}

class PowerEngine implements Engine1 {
  @Override
  public void acc() {
    System.out.println("PowerEngine acc");

  }

  @Override
  public void start() {
    System.out.println("Power Engine started");

  }

  @Override
  public void stop() {
    System.out.println("Power Engine stopped");

  }

}

class CdPlayer implements Media1 {

  @Override
  public void play() {
    System.out.println("CdPlayer playing media");

  }

  @Override
  public void stop() {
    System.out.println("CdPlayer stopped");

  }

}

interface Engine1 {

  void start();

  void stop();

  void acc();

  int price = 7000;
}

interface Brake1 {
  void applyBrake();

}

interface Media1 {
  void play();

  void stop();
}
