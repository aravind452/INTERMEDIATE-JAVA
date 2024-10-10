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

    StringBuffer stringBuffer2 = new StringBuffer("aravind");
    System.out.println(stringBuffer.equals(stringBuffer2)); // why false?

    // NOTE

    /*
     * StringBuffer and StringBuilder equals(): By default, these classes use
     * reference equality (i.e., compare memory locations, not contents).
     */

    /*
     * INTERNING
     * Java provides a method called intern() to manually place strings into the
     * constant pool:
     * String str1 = new String("Hello");
     * String str2 = str1.intern();
     * 
     */

    String internString = heapString.intern();
    System.out.println(internString == s1); // true
    System.out.println(internString.equals(s1));

  }
}