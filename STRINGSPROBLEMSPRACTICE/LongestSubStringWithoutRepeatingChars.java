// package STRINGSPROBLEMSPRACTICE;

// import java.util.*;

// public class LongestSubStringWithoutRepeatingChars {

//   public static void main(String[] args) {
//     System.out.println(length1("abcdeabcbb"));
//     // String input = "abcabcbb";
//     // String result = largestSubstring(input);
//     // System.out.println("Output :" + result);

//     System.out.println(length1("abcabcbb"));

//   }

//   // static int length(String s) {
//   // int start = 0, maxLength = 0, end = 0;
//   // Set<Character> set = new LinkedHashSet<>();

//   // for (end = 0; end < s.length(); end++) {
//   // System.out.println(set);
//   // while (set.contains(s.charAt(end))) {
//   // set.remove(s.charAt(start));
//   // start++;

//   // }
//   // set.add(s.charAt(end));

//   // maxLength = Math.max(maxLength, end - start + 1);

//   // }
//   // return maxLength;
//   // }

//   // static int length1(String s) {
//   //   int i = 0, j = 0, max = 0;
//   //   boolean isMax = false;
//   //   Set<Character> set = new HashSet<>();

//   //   while (j < s.length()) {
//   //     if (!set.contains(s.charAt(j))) {
//   //       set.add(s.charAt(j++));
//   //       max = Math.max(max, set.size());
//   //       isMax = true;

//   //     } else {

//   //       if (max >= set.size() && isMax) {

//   //         System.out.println(set);

//   //       }
//   //       set.remove(s.charAt(i++));

//   //     }
//   //   }

//   //   return max;
//   // }

//   // public static String largestSubstring(String s) {
//   // int n = s.length();
//   // int start = 0, end = 0;
//   // int max = 0;
//   // HashSet set = new HashSet<>();

//   // }


//   public static void main(String[] args) {
//         String input = "abcabcbb";
//         String longestSubstring = findLongestSubstring(input);
//         System.out.println("The longest substring without repeating characters is: " + longestSubstring);
//         System.out.println("Length: " + longestSubstring.length());
//     }

//     public static String findLongestSubstring(String s) {
//         int[] charIndex = new int[256]; // To track the last seen index of each character

//         // Explicitly initialize the array to -1
//         for (int i = 0; i < charIndex.length; i++) {
//             charIndex[i] = -1;
//         }

//         int start = 0;                // Start of the current window
//         int maxLength = 0;            // To track the length of the longest substring
//         int startOfLongest = 0;       // Start index of the longest substring

//         for (int i = 0; i < s.length(); i++) {
//             char currentChar = s.charAt(i);

//             // If the character has been seen in the current window
//             if (charIndex[currentChar] >= start) {
//                 start = charIndex[currentChar] + 1; // Move the start to avoid the repeating character
//             }

//             // Update the character's last index
//             charIndex[currentChar] = i;

//             // Check if the current substring is the longest
//             if ((i - start + 1) > maxLength) {
//                 maxLength = i - start + 1; // Update the maximum length
//                 startOfLongest = start;   // Update the start index of the longest substring
//             }
//         }

//         // Return the longest substring using the calculated start index and length
//         return s.substring(startOfLongest, startOfLongest + maxLength);
//     }
// }

// }
