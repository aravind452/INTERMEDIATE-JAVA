public class WrapperClass {

  public static void main(String[] args) {
    int num = 7;
    // Integer num1 = new Integer(7); // deprecated
    Integer num2 = num; // boxing int to Integer
    int num3 = num2; // unboxing Integer to int
    // int num3 = num2.intValue();
    System.out.println(num2);
    System.out.println(num3);

    String str = "566";
    int i = Integer.parseInt(str);
    System.out.println(i);
    
  }

}
