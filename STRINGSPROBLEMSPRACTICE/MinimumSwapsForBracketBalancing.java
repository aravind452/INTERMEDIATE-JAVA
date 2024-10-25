package STRINGSPROBLEMSPRACTICE;

public class MinimumSwapsForBracketBalancing {

  public static void main(String[] args) {
    String str = "[]][][";

    System.out.println(minSwaps(str));
  }

  static int minSwaps(String str) {
    int imbalance = 0;
    int swap = 0;
    int left = 0;
    int right = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '[') {
        left++;
        if (imbalance > 0) {
          swap += imbalance;
          imbalance = 0;
        }

      } else if (str.charAt(i) == ']') {
        right++;
        imbalance = (right - left);
      }
    }
    return swap;

  }
}

// another solution

/*
 * static int minSwaps(String str) {
 * int balance = 0;
 * int swaps = 0;
 * 
 * for (char ch : str.toCharArray()) {
 * if (ch == '[') {
 * balance++; // Increment balance for opening bracket
 * } else {
 * balance--; // Decrement balance for closing bracket
 * }
 * 
 * // If balance goes negative, we need a swap
 * if (balance < 0) {
 * swaps++; // Increment the swap count
 * balance++; // Simulate the effect of swapping an opening bracket
 * }
 * }
 * 
 * return swaps; // Return the total number of swaps needed
 * }
 * 
 */
