package STATIC;

public class Static1 {

  public static void main(String[] args) {
    HumanClass h = new HumanClass(23, "aravind");
    System.out.println(h.age);
    System.out.println(HumanClass.population);

    HumanClass h1 = new HumanClass(24, null);
    System.out.println(h1.age);
    System.out.println(HumanClass.population);

  }

}

class HumanClass {
  int age;
  String name;
  static long population;

  public HumanClass(int age, String name) {
    this.age = age;
    this.name = name;
    population++;

  }

}