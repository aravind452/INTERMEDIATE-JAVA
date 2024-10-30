package OBJECTCLASS;

public class ObjectDemo {
  int num;

  public ObjectDemo(int i) {
    num = i;

  }

  @Override
  protected Object clone() throws CloneNotSupportedException {

    return super.clone();
  }

  @Override
  public boolean equals(Object obj) {
    /*
     * Compares two objects for equality. The default implementation compares object
     * references, but it can be overridden in derived classes to provide a
     * value-based equality check.
     */

    return this.num == ((ObjectDemo) obj).num;
  }

  @Override
  public int hashCode() {

    return super.hashCode();
  }

  @Override
  public String toString() {

    return super.toString();
  }

  public static void main(String[] args) {

    ObjectDemo obj1 = new ObjectDemo(45);
    System.out.println(obj1 instanceof Object);
    ObjectDemo obj2 = new ObjectDemo(45);
    System.out.println(obj1 == obj2); // compares the refs
    System.out.println(obj1.equals(obj2));
    System.out.println(obj1.getClass().getName());
    System.out.println(obj1.getClass());

    // System.out.println(obj1.num);
    // System.out.println(obj1.toString());
    // System.out.println(obj1.hashCode());
    // System.out.println(obj1.clone());

    // Instance of - The instanceof operator is used to test whether an object is an
    // instance of a specific class or any of its subclasses.

    /*
     * In Java, the keyword this is a reference to the current instance of the class
     * in which the code is being executed.
     * 
     * It allows you to refer to the object that is invoking the method or
     * constructor. For example, if you create an object like this:
     * ObjectDemo obj1 = new ObjectDemo(45);
     * Inside the equals() method of obj1, this refers to obj1.
     * 
     * 
     * Context of equals() Method:
     * 
     * When you call obj1.equals(obj2), the equals() method in the ObjectDemo class
     * is invoked on obj1. This means:
     * Inside the equals() method, this refers to obj1.
     * The obj parameter refers to obj2 (the object you're comparing against).
     * 
     * 
     * this.num:
     * 
     * When you're inside the equals() method and use this.num, you're accessing the
     * num field of the object that is calling the method (in this case, obj1). So
     * if obj1 was created with new ObjectDemo(45), then this.num will be 45.
     * 
     * 
     * 
     * 
     * "Current Object" means the instance of the class on which a method is being
     * called. In the context of the equals() method, it's the object invoking the
     * method (this).
     */

  }

}
