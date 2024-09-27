class Strings {
  public static void main(String[] args) {
    String s1 = "aravind"; // stores the string in string pool
    String s2 = "aravind"; // stores the string in string pool

    String heapString = new String("aravind"); // this creates a new object in the heap, even if an identical string
    // exists in the string pool

    System.out.println(s1 == s2);
    System.out.println(s1.equals(heapString)); // checks the characters
    System.out.println(s1 == heapString); // checks the reference

    // StringBuilder and StringBuffer

    StringBuffer stringBuffer = new StringBuffer("aravind");
    System.out.println(stringBuffer);

  }
}