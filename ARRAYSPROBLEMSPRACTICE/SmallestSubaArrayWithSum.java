package ARRAYSPROBLEMSPRACTICE;

import java.util.*;

public class SmallestSubaArrayWithSum {

  public static void main(String[] args) {
    int[] arr = { 1, 10, 5, 2, 7 };
    System.out.println(smallestSubArrayWithSum(arr, 9));
  }

  static int smallestSubArrayWithSum(int[] arr, int sum) {
    int start = 0;
    int end = 0;
    int min = Integer.MAX_VALUE;
    int sum1 = 0;
    // ArrayList<Integer> list = new ArrayList<>();

    for (end = 0; end < arr.length; end++) {

      sum1 = sum1 + arr[end];

      while (sum1 > sum) {

        min = Math.min(min, end - start + 1);
        sum1 = sum1 - arr[start];
        start++;
      }

    }

    return min == Integer.MAX_VALUE ? 0 : min;
  }

  // to find the array as well

  static ArrayList<Integer> smallestSubArrayWithSumWithArray(int[] arr, int sum) {
    int start = 0;
    int end = 0;
    int min = Integer.MAX_VALUE;
    int sum1 = 0;
    ArrayList<Integer> list = new ArrayList<>();

    for (end = 0; end < arr.length; end++) {

      sum1 += arr[end];

      while (sum1 > sum) {

        if (end - start + 1 < min) {
          min = end - start + 1;
          list.clear();
          for (int i = start; i <= end; i++) {
            list.add(arr[i]);
          }

        }
        sum1 = sum1 - arr[start];
        start++;

      }

    }

    return min == Integer.MAX_VALUE ? new ArrayList<>() : list;
  }

}
