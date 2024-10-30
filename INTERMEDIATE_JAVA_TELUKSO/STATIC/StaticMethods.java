package STATIC;
class Mobile1 {
  String brand;
  int price;
  static String name;

  void show() {
    System.out.println("Brand: " + brand + " Price: " + price + " Phone: " + name);
  }

  static void show1(Mobile1 m1) {
    System.out.println("In static method");
    System.out.println("Brand: " + m1.brand + " Price: " + m1.price + " Phone: " + name);

  }

}

public class StaticMethods {

  public static void main(String[] args) {
    Mobile1 m1 = new Mobile1();
    m1.brand = "Redmi";
    m1.price = 45558;
    Mobile1.name = "SmartPhone";

    Mobile1 m2 = new Mobile1();
    m2.brand = "Realme";
    m2.price = 78000;
    Mobile1.name = "SmartPhone";

    m1.show();
    m2.show();

    Mobile1.show1(m1);
  }

}
