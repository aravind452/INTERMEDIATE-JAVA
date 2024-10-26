package ARRAYSPROBLEMSPRACTICE;

import java.util.*;

public class NegativeToBeginningPositiveToEnd {

  public static void main(String[] args) {
    int[] arr = { -1, 2, 3, -4, -5, 8, 5, 6 };
    move(arr);
  }

  static void move(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {

      if (arr[left] < 0 && arr[right] < 0) {
        left++;
      }

      else if (arr[left] > 0 && arr[right] < 0) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      } else if (arr[left] > 0 && arr[right] > 0) {
        right--;
      }

      else if (arr[left] < 0 && arr[right] > 0) {
        left++;
        right--;
      }

    }
    System.out.println(Arrays.toString(arr));

  }

}
