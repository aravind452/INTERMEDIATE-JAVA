public class StaticIntializers {

  public static void main(String[] args) {
    // Child12 c = new Child12();
    // Child12 c2 = new Child12();
  }

}

class Parent12 {
  static {
    System.out.println("Parent static initializer");
  }

  {
    System.out.println("Parent instance initializer");
  }
}

class Child12 extends Parent12 {
  static {
    System.out.println("Child static initializer");
  }

  {
    System.out.println("Child instance initializer");
  }
}

/*
 * Why Static Initializers Are Not Inherited:
 * Class-Specific Behavior:
 * 
 * Static blocks are associated with the class where they are defined. They are
 * executed when that specific class is loaded.
 * A child class has its own lifecycle and will not execute the parent class's
 * static initializer blocks.
 * Independent Execution:
 * 
 * When a subclass is loaded, the parent class's static initializers are
 * executed first, but they are not "inherited." They execute as part of the
 * parent class's initialization process.
 * No Override Mechanism:
 * 
 * There is no overriding or shadowing mechanism for static initializers in
 * Java. Each class maintains its own static initializers.
 * 
 * Order of Execution:
 * 
 * Static initializers of the parent class → Static initializers of the child
 * class → Instance initializers of the parent class → Instance initializers of
 * the child class.
 * Static Initializers Are Not Re-Executed:
 * 
 * Once the parent class's static initializer runs, it will not execute again,
 * even if another subclass is loaded.
 */

/*
 * 4. Instance Initializer Blocks
 * Are not inherited, similar to static blocks. They are tied to the class where
 * they are defined and executed during object creation for that class.
 */

/*
 * Key Differences: Why Blocks Are Not Inherited?
 * Static and Instance Variables:
 * 
 * These are members of the class and follow the inheritance hierarchy.
 * Static variables belong to the class, but they are accessible in child
 * classes.
 * Static and Instance Initializer Blocks:
 * 
 * These are class-specific and execution-time-specific constructs.
 * They are designed to initialize the class or instance itself, not to be
 * reused or inherited by child classes.
 */