package THISANDSUPER;

public class ThisKeyword {

  public static void main(String[] args) {
    Person p = new Person().setAge(25).setName("Aravind");
    p.display();

  }

}

class Person {
  int age;
  String name;

  // Constructor with parameters having the same names as instance variables
  public Person(int age, String name) {
    // 'this.age' refers to the instance variable, 'age' refers to the constructor
    // parameter
    this.age = age;
    this.name = name;
  }

  /*
   * You can use this() to call one constructor from another within the same
   * class. This is known as constructor chaining, and it helps avoid redundant
   * code by reusing constructor logic.
   */
  // Constructor chaining
  public Person() {
    this(0, "aravind");
  }

  /*
   * Why this is needed here:
   * In the constructor, the parameters age and name shadow the instance
   * variables. By using this.age and this.name, you are referring to the instance
   * variables and assigning the parameter values to them.
   */

  public Person setAge(int age) {
    this.age = age;
    return this; // Returns the current object
  }

  public Person setName(String name) {
    this.name = name;
    return this; // Returns the current object
  }

  void display() {
    System.out.println("Age: " + this.age);
    System.out.println("Name: " + this.name);
  }

  void greet(Person other) {
    System.out.println(this.name + " says hello to " + other.name);
  }

  void greetSelf() {
    greet(this); // Passing the current object as an argument
  }
}

// Summary of this

/*
 * Refers to the current object: this is a reference to the object on which the
 * method is invoked.
 * Differentiates between instance variables and parameters: When local
 * variables (parameters) shadow instance variables, this clarifies that you are
 * referring to the instance variable.
 * Used for constructor chaining: this() can call one constructor from another
 * within the same class.
 * Enables method chaining: Returning this allows chaining multiple method calls
 * on the same object.
 * Can pass the current object as a method parameter: You can use this to pass
 * the current object to another method or constructor.
 */
