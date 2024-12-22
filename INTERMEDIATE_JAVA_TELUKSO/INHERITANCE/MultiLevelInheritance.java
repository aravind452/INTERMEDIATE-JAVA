package INHERITANCE;
public class MultiLevelInheritance {

  public static void main(String[] args) {

    // BoxWeight1 boxWeight1 = new BoxWeight1(1, 2, 3, 4);
    // System.out.println(boxWeight1.h);
    // BoxWeight1 boxWeight2 = new BoxWeight1(boxWeight1);
    // System.out.println(boxWeight2.h);

    BoxPrice boxPrice = new BoxPrice();
    System.out.println(boxPrice.cost);

  }

}

class Box1 {
  private double l;
  double h;
  double w;

  Box1(double l, double h, double w) {
    this.l = l;
    this.h = h;
    this.w = w;
  }

  Box1() {
    // super();
    System.out.println("box1 class constructor called");
    this.h = -2;
    this.l = -1;
    this.w = -1;
  }

  Box1(double side) {
    this.w = side;
    this.h = side;
    this.l = side;
  }

  Box1(Box1 old) {
    this.l = old.l;
    this.h = old.h;
    this.w = old.w;
  }

  public void info() {
    System.out.println("Running the box");
  }

}

class BoxWeight1 extends Box1 {
  double weight;
  // double h;

  public BoxWeight1(double l, double h, double w, double weight) {
    super(l, h, w);
    this.weight = weight;
  }

  public BoxWeight1() {
    this(4, 5, 6, 6);
    System.out.println("boxweight1 class constructor called");
    // this.weight = -1;

    // this.h = -1;
    // System.out.println(this.h);
  }

  public BoxWeight1(BoxWeight1 boxWeight) {
    super(boxWeight);
    this.weight = boxWeight.weight;

  }
}

class BoxPrice extends BoxWeight1 {
  double cost;

  BoxPrice() {

    System.out.println("boxprice constructor called");

    this.cost = -1;
  }

  BoxPrice(BoxPrice other) {
    super(other);
    this.cost = other.cost;
  }

  BoxPrice(double l, double h, double w, double weight, double cost) {
    super(l, h, w, weight);
    this.cost = cost;
  }

}

/*
 * Parent class references can refer to child class objects because the child
 * "is a" type of the parent (an is-a relationship).
 * 
 * However, the reverse is not true: a child class reference cannot refer to a
 * parent class object because the parent does not "have" the properties of the
 * child.
 * 
 * A child class generally extends the behavior and properties of the parent
 * class. So, the parent class object does not have the additional behaviors or
 * fields introduced by the child class, making this reference invalid.
 * 
 * 
 * Parent Reference and Child Object (Valid):
 * 
 * Parent p = new Child(); works because the parent reference can hold a child
 * object. The child "is a" type of parent.
 * However, the reference type is Parent, so only methods declared in the Parent
 * class can be accessed (e.g., show()), even though the object is of type
 * Child. The methods specific to Child (like display()) are not accessible
 * without type casting.
 * 
 * 
 * What happens with references
 * Parent reference to a Child object (valid):
 * 
 * A parent can refer to a child object because the child has everything the
 * parent has (the child class extends the parent class).
 * The child class object has all the features of the parent, so it's okay for a
 * parent to point to it.
 * 
 * A child class cannot refer to a parent object because the parent object
 * doesn’t have the extra features that the child class has.
 * The child expects both its own features and the parent's, but the parent
 * object doesn't know about the child’s extra features, so this would be
 * incompatible.
 */