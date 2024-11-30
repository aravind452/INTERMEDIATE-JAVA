

import java.util.*;

public class TripletSumZero {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    int sum = 9;
    System.out.println(triple(arr, sum));
  }

  static boolean triple(int[] arr, int sum) {

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      int left = i + 1;
      int right = arr.length - 1;

      while (left < right) {
        int currentSum = arr[i] + arr[left] + arr[right];
        if (currentSum == sum) {
          return true;
        } else if (currentSum < sum) {
          left++;
        } else {
          right--;
        }
      }
    }
    return false;

  }

}
