
/*
 Yes, static variables can be inherited in Java, but they are not bound to individual instances of the subclass. Instead, they belong to the class where they are declared.

Key Points:
Shared Across All Instances:
Static variables are shared among all instances of the class (and subclasses) and are associated with the class rather than any specific instance.

Access in Subclasses:
A subclass inherits static variables and can access them using the class name, the subclass name, or this (though using this for static variables is not recommended).

No Polymorphism for Static Variables:
Static variables do not follow polymorphism. The reference type determines which static variable is accessed.
 */

public class StaticInheritance {

  public static void main(String[] args) {
    System.out.println("From Parent Class - " + Parent.message);
    System.out.println("From Parent Using Child Ref - " + Child.message);

  }

}

class Parent {
  static String message = "Hello from parent";
}

class Child extends Parent {
  // static String message = "Hello from child";
}