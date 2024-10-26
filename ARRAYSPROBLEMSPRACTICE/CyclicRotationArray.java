package ARRAYSPROBLEMSPRACTICE;

import java.util.*;

public class CyclicRotationArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };
    rotate(arr);
  }

  static void rotate(int[] arr) {
    int last = arr[arr.length - 1];
    for (int i = arr.length - 1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }

    arr[0] = last;
    System.out.println(Arrays.toString(arr));
  }

}
