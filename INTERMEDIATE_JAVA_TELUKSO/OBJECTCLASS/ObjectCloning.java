package OBJECTCLASS;

import java.util.Arrays;

public class ObjectCloning {

  public static void main(String[] args) throws CloneNotSupportedException {
    Human kunal = new Human(23, "arun");
    // Human twin = new Human(kunal);

    // Cloning
    Human twin = (Human) kunal.clone();
    // System.out.println(twin.age + " " + twin.name + twin.arr);

    // Shallow copy

    System.out.println(Arrays.toString(twin.arr));
    System.out.println("Twin obj before changing " + twin.age + " " + twin.name);

    twin.arr[0] = 100;
    twin.age = 243;

    System.out.println("Twin obj after changing " + twin.age + " " + twin.name);
    System.out.println("Kunal obj after changing " + kunal.age + " " + kunal.name);

    System.out.println(Arrays.toString(kunal.arr));
    System.out.println(Arrays.toString(twin.arr));

  }

}

class Human implements Cloneable {
  int age;
  String name;
  int[] arr;

  public Human(int age, String name) {
    this.age = age;
    this.name = name;
    this.arr = new int[] { 3, 4, 5 };
  }

  public Human(Human other) {
    this.age = other.age;
    this.name = other.name;

  }

  protected Object clone() throws CloneNotSupportedException {
    // this is shallow copy
    return super.clone();
  }

}