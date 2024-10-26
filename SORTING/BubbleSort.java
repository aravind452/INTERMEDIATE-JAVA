package SORTING;

import java.util.*;

public class BubbleSort {

  public static void main(String[] args) {
    int[] arr = { 11, 2, 3, 4 };
    for (int i = 0; i < arr.length; i++) {
      boolean swap = false;
      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j - 1] > arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j - 1];
          arr[j - 1] = temp;
          swap = true;
        }
      }
      if (!swap) {
        break;
      }
    }
    System.out.println(Arrays.toString(arr));
  }

}
