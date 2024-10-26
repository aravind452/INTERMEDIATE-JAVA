package ARRAYSPROBLEMSPRACTICE;

import java.util.*;

public class WaveArray {

  public static void main(String[] args) {
    int[] arr1 = { 10, 5, 6, 3, 2, 20, 100, 80 };
    wave(arr1);
  }

  static void wave(int[] arr) {
    Arrays.sort(arr);
    for (int i = 0; i < arr.length - 1; i = i + 2) {
      int temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }

    System.out.println(Arrays.toString(arr));

  }

}
