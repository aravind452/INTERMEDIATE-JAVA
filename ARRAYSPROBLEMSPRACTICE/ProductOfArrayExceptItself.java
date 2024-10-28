package ARRAYSPROBLEMSPRACTICE;

import java.util.*;

public class ProductOfArrayExceptItself {

  public static void main(String[] args) {

    int[] arr = productExceptSelfPrefixProduct(new int[] { 1, 2, 3, 4 });
    System.out.println(Arrays.toString(arr));

  }

  // Using division operator

  public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] result = new int[n];

    int totalProduct = 1;
    int zeroCount = 0;
    for (int num : nums) {
      if (num != 0) {
        totalProduct *= num;
      } else {
        zeroCount++;
      }
    }
    for (int i = 0; i < n; i++) {
      if (zeroCount > 1) {
        result[i] = 0;
      } else if (zeroCount == 1) {

        result[i] = nums[i] == 0 ? totalProduct : 0;
      } else {

        result[i] = totalProduct / nums[i];
      }
    }

    return result;

  }

  public static int[] productExceptSelfPrefixProduct(int[] nums) {
    int n = nums.length;
    int[] left = new int[n];
    int[] right = new int[n];
    int[] result = new int[n];

    left[0] = 1;
    right[n - 1] = 1;

    for (int i = 1; i < n; i++) {
      left[i] = nums[i - 1] * left[i - 1];
    }

    for (int i = n - 2; i >= 0; i--) {
      right[i] = nums[i + 1] * right[i + 1];
    }

    System.out.println(Arrays.toString(left));
    System.out.println(Arrays.toString(right));

    for (int i = 0; i < n; i++) {
      result[i] = left[i] * right[i];
    }

    return result;
  }
}
