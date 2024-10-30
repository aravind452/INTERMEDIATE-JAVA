package OBJECTCLASS;

import java.util.Arrays;

public class DeepCopy {
  public static void main(String[] args) throws CloneNotSupportedException {
    Human1 kunal = new Human1(23, "arun");
    Human1 twin = (Human1) kunal.clone();
    /*
     * In the clone() method, this refers to the current object on which the clone()
     * method is being called.
     * 
     * For example, if you call kunal.clone(), within the clone() method, this
     * refers to the kunal object.
     */

    // System.out.println(Arrays.toString(twin.arr));
    System.out.println("Twin obj before changing " + twin.age + " " + twin.name);

    twin.arr[0] = 100;
    twin.age = 243;

    System.out.println("Twin obj after changing " + twin.age + " " + twin.name);
    System.out.println("Kunal obj after changing " + kunal.age + " " + kunal.name);

    System.out.println("kunal arr deep copy " + Arrays.toString(kunal.arr));
    System.out.println("twin arr after changing " + Arrays.toString(twin.arr));
  }

}

class Human1 implements Cloneable {
  int age;
  String name;
  int[] arr;

  public Human1(int age, String name) {
    this.age = age;
    this.name = name;
    this.arr = new int[] { 3, 4, 5 };
  }

  public Human1(Human1 other) {
    this.age = other.age;
    this.name = other.name;

  }

  protected Object clone() throws CloneNotSupportedException {
    // deep copy

    Human1 twin = (Human1) super.clone();
    // System.out.println(twin.age);
    twin.arr = new int[this.arr.length];
    for (int i = 0; i < twin.arr.length; i++) {
      twin.arr[i] = this.arr[i];
    }

    return twin;
  }

}
