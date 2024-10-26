package ARRAYSPROBLEMSPRACTICE;

public class MaxSubArraySum {

  public static void main(String[] args) {
    int[] arr = { 3, -2, 5, -1 };
    System.out.println(sum(arr));
  }

  static int sum(int[] arr) {
    int maxCurrent = arr[0];
    int maxGlobal = arr[0];

    for (int i = 1; i < arr.length; i++) {
      maxCurrent = Math.max(maxCurrent + arr[i], arr[i]);
      maxGlobal = Math.max(maxGlobal, maxCurrent);
    }

    return maxGlobal;

  }

}
