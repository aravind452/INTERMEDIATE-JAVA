package GENERICS;

public class Generic1 {

  public static void main(String[] args) {

    // GENERICS

    /*
     * Generics allow you to create classes, interfaces, and methods that can work
     * with any data type while providing type safety at compile time. This means
     * you can use the same code for different types without writing separate
     * versions for each type
     * 
     * Flexibility: You can use one class or method for multiple types (like String,
     * Integer, etc.).
     */
    Box<String> stringBox = new Box<>();
    stringBox.setItem("Hello");
    System.out.println(stringBox.getItem());

    Box<Integer> integerBox = new Box<>();
    integerBox.setItem(123);
    System.out.println(integerBox.getItem());

  }

}

class Box<T> {

  // Here, Box<T> can hold any type specified when the class is instantiated.
  private T item;

  public void setItem(T item) {
    this.item = item;
  }

  public T getItem() {
    return item;
  }
}
