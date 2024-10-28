package ARRAYSPROBLEMSPRACTICE;

public class MedianOfSortedArrayWithDiffSizes {

  public static void main(String[] args) {

    int[] arr1 = { -5, 3, 6, 12, 15 };
    int[] arr2 = { -12, -10, -6, -3, 4, 10 };
    System.out.println(findMedian(arr1, arr2));

  }

  static double findMedian(int[] arr1, int arr2[]) {
    int merged[] = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) {
        merged[k++] = arr1[i++];
      } else {
        merged[k++] = arr2[j++];
      }
    }

    while (i < arr1.length) {
      merged[k++] = arr1[i++];
    }
    while (j < arr2.length) {
      merged[k++] = arr2[j++];

    }

    if ((arr1.length + arr2.length) % 2 == 0) {
      return (merged[(arr1.length + arr2.length) / 2 - 1] + merged[(arr1.length + arr2.length) / 2]) / 2.0;
    }
    return (double) merged[(arr1.length + arr2.length) / 2];
  }

}
