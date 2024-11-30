package RECURSIONANDBACKTRACKING;

import java.util.Arrays;

public class ReverseArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    // swapValues(arr, 0, 4);
    swapValuesUsingSinglePointer(arr, 0, arr.length);

  }

  // using two pointers
  static void swapValues(int[] arr, int l, int r) {
    if (l >= r) {
      System.out.println(Arrays.toString(arr));
      return;
    }
    int temp = arr[l];
    arr[l] = arr[r];
    arr[r] = temp;
    swapValues(arr, l + 1, r - 1);
  }

  // using single pointer

  static void swapValuesUsingSinglePointer(int[] arr, int i, int n) {
    if (i >= n / 2) {
      System.out.println(Arrays.toString(arr));
      return;
    }
    int temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;
    swapValuesUsingSinglePointer(arr, i + 1, n);
  }

}
