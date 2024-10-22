package STRINGS;

public class PrettyPrinting {

  public static void main(String[] args) {
    float a = 543.3444f;
    System.out.printf("%.2f%n", a);

    int b = 45;
    System.out.printf("%05d%n", b); // 0: Pad the output with leading zero

    System.out.println(String.format("Right-aligned: %5d", b));

    System.out.printf("Percentage: 100%% complete.%n");
   

  }

  

}
