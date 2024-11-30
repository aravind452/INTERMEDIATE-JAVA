package STRINGSPROBLEMSPRACTICE;

public class LongestSubString {
    public static void main(String[] args) {
        // String input = "abcabcbb";
        // String result = longestSubstring(input);
        // System.out.println("Output: " + result);
    }

    // public static String longestSubstring(String s) {
    // int n = s.length();
    // int start = 0, end = 0, maxLength = 0, startOfMax = 0;
    // HashSet<Character> set = new HashSet<>();

    // while (end < n) {
    // char currentChar = s.charAt(end);
    // if (!set.contains(currentChar)) {
    // set.add(currentChar);
    // end++;
    // if (end - start > maxLength) {
    // maxLength = end - start;
    // startOfMax = start;
    // }
    // } else {
    // set.remove(s.charAt(start));
    // start++;
    // }
    // }

    // return s.substring(startOfMax, startOfMax + maxLength);
    //     }
}
