package SORTING;

import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = { 5, 1, 2, 4 };
    int[] res = mergeSort(arr);
    System.out.println(Arrays.toString(res));
  }

  static int[] mergeSort(int[] arr) {
    if (arr.length == 1) {
      return arr;
    }
    int mid = arr.length / 2;
    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left, right);
  }

  static int[] merge(int[] left, int right[]) {
    int[] merged = new int[left.length + right.length];
    int leftIndex = 0, rightIndex = 0, mergedIndex = 0;
    while (leftIndex < left.length && rightIndex < right.length) {
      if (left[leftIndex] < right[rightIndex]) {
        merged[mergedIndex++] = left[leftIndex++];
      } else {
        merged[mergedIndex++] = right[rightIndex++];
      }
    }
    while (leftIndex < left.length) {
      merged[mergedIndex++] = left[leftIndex++];
    }
    while (rightIndex < right.length) {
      merged[mergedIndex++] = right[rightIndex++];
    }
    return merged;
  }

}
