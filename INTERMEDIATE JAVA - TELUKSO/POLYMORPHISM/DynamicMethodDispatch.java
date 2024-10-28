public class DynamicMethodDispatch {
  public static void main(String[] args) {
    M obj = new N(); // N show
    obj.show();

    obj = new M();
    obj.show(); // M show
  }

}

class M {

  void show() {
    System.out.println("in M show");
  }

}

class N extends M {
  void show() {
    System.out.println("in N show");
  }

}

/*
 * Imagine Parent has one basic tool (method), showToolA(), and Child has that
 * same basic tool plus one more, showToolB().
 * 
 * class Parent {
 * void showToolA() {
 * System.out.println("Using Tool A from Parent toolbox.");
 * }
 * }
 * 
 * class Child extends Parent {
 * void showToolB() {
 * System.out.println("Using Tool B from Child toolbox.");
 * }
 * }
 * Case 1: Assigning Child to Parent (This Works)
 * 
 * Parent toolboxA = new Child(); // Parent (Toolbox A) points to Child (Toolbox
 * B)
 * toolboxA.showToolA(); // Works because Tool A is in Parent
 * 
 * Why it works: Toolbox A only needs basic tools (showToolA()), and Toolbox B
 * has those basic tools.
 * What you can do: Only use basic tools (showToolA()). You can’t use the extra
 * ToolB from Child.
 * 
 * Case 2: Assigning Parent to Child (Doesn’t Work)
 * Child toolboxB = new Parent(); // Trying to assign Toolbox A to Toolbox B -
 * error
 * Why it fails: Toolbox B expects to have extra tools (like showToolB()), which
 * the Parent object doesn’t have.
 * 
 * 
 * 
 */