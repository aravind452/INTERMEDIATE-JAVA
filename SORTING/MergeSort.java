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
    System.out.println(Arrays.toString(left));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    System.out.println(Arrays.toString(right));
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

/*
 * package SORTING;
 * 
 * import java.util.Arrays;
 * 
 * public class MergeSort {
 * 
 * public static void main(String[] args) {
 * int[] arr = { 5, 1, 2, 4 };
 * mergeSort(arr, 0, arr.length - 1);
 * System.out.println(Arrays.toString(arr));
 * }
 * 
 * static void mergeSort(int[] arr, int start, int end) {
 * if (start >= end) {
 * return;
 * }
 * 
 * int mid = start + (end - start) / 2;
 * mergeSort(arr, start, mid);
 * mergeSort(arr, mid + 1, end);
 * merge(arr, start, mid, end);
 * }
 * 
 * static void merge(int[] arr, int start, int mid, int end) {
 * int[] merged = new int[end - start + 1];
 * int leftIndex = start, rightIndex = mid + 1, mergedIndex = 0;
 * 
 * while (leftIndex <= mid && rightIndex <= end) {
 * if (arr[leftIndex] < arr[rightIndex]) {
 * merged[mergedIndex++] = arr[leftIndex++];
 * } else {
 * merged[mergedIndex++] = arr[rightIndex++];
 * }
 * }
 * 
 * while (leftIndex <= mid) {
 * merged[mergedIndex++] = arr[leftIndex++];
 * }
 * while (rightIndex <= end) {
 * merged[mergedIndex++] = arr[rightIndex++];
 * }
 * 
 * System.arraycopy(merged, 0, arr, start, merged.length);
 * }
 * 
 * }
 * 
 */