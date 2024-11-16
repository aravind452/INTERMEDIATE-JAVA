public class VariableShadowing {

  public static void main(String[] args) {

    Parent1 obj1 = new Parent1();
    Parent1 obj2 = new Child1();
    Child1 obj3 = new Child1();

    System.out.println("obj1.name: " + obj1.name); // Access Parent's variable
    System.out.println("obj2.name: " + obj2.name); // Access Parent's variable (reference type)
    System.out.println("obj3.name: " + obj3.name); // Access Child's variable
  }

}

/*
 * Why Instance Variables Are Not Overridden:
 * Binding Happens at Compile-Time:
 * 
 * Instance variables are resolved based on the reference type, not the actual
 * object type.
 * When you access an instance variable, the compiler binds it to the variable
 * defined in the reference type, regardless of the object it points to.
 * Instance Variables Are Not Part of Polymorphism:
 * 
 * Overriding is a feature of polymorphism, which applies only to instance
 * methods.
 * Instance variables are tied to the class that declares them, not to the
 * runtime type of the object.
 * Each Class Has Its Own Copy:
 * 
 * If a subclass declares a variable with the same name as a parent class
 * variable, it hides the parent’s variable instead of overriding it.
 * This is known as variable shadowing, not overriding.
 */

class Parent1 {
  String name = "ParentName";
}

class Child1 extends Parent1 {
  String name = "ChildName"; // Shadows the parent's variable

  void display() {
    System.out.println("Child's name: " + name); // Access child variable
    System.out.println("Parent's name: " + super.name); // Access parent variable using super
  }
}

/*
 * Why Methods Can Be Overridden, But Not Variables:
 * Methods are designed to exhibit dynamic behavior, allowing the runtime type
 * to determine which method to invoke (polymorphism).
 * Variables, on the other hand, are designed for data storage and do not change
 * based on runtime object type.
 */