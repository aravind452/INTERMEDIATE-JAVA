package OBJECTCLASS;

public class ObjectUsecases {

  public static void main(String[] args) {
    Computer computer = new Computer();
    computer.price = 12000;
    computer.model = "REDMI";
    System.out.println(computer.hashCode());
    System.out.println(computer.toString());

    // if toString() is not found
    // superclass toString() is called

    // if equals() is not found
    // superclass equals is called

    Computer computer1 = new Computer();
    computer1.price = 12000;
    computer1.model = "REDMI";

    boolean res = computer.equals(computer1);
    boolean res1 = computer == computer1;
    System.out.println(res + " " + res1); // false

  }

}

class Computer {

  int price;
  String model;

  public String toString() {
    return "Hey";
  }

  public boolean equals(Computer that) {
    return this.price == that.price && this.model.equals(that.model);

  }

}