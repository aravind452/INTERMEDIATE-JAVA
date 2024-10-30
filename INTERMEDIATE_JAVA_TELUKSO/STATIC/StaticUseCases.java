package STATIC;
public class StaticUseCases {

  public static void main(String[] args) throws ClassNotFoundException {
    Mobile m1 = new Mobile();
    m1.brand = "Redmi";
    m1.price = 45558;
    m1.color = "Black";
    Mobile.name = "SmartPhone";

    Mobile m2 = new Mobile();
    m2.brand = "Realme";
    m2.price = 78000;
    m2.color = "Blue";
    Mobile.name = "SmartPhone";

    m1.show();
    m2.show();

    Class.forName("Mobile"); // used to load a class dynamically at runtime.

  }

}

class Mobile {
  String brand;
  int price = 23;
  String color;
  static String name;

  static { // Called only once
    name = "Phone";
    // Static variables should generally be initialized in a static context, like a
    // static block
    System.out.println("static block");

  }

  public Mobile() {
    System.out.println("in constructor");
    brand = "";
    price = 2000;
    color = "red";
    // name = "Phone"; // Since static variables belong to the class and are shared
    // by all instances,
    // it is unusual to initialize a static variable within an instance-level
    // constructor.
  }

  void show() {
    System.out.println("Brand: " + brand + " Price: " + price + " color: " + color + " Phone: " + name);
  }
}
