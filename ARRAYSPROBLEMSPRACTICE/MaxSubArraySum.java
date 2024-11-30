

import java.util.*;;

public class MaxSubArraySum {

  public static void main(String[] args) {
    int[] arr = { 3, -1, 5, -1 };
    // System.out.println(sum(arr));
    maxSubArray(arr);
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

  public static void maxSubArray(int[] nums) {
    int maxCurrent = nums[0];
    int maxGlobal = nums[0];
    int start = 0, end = 0, tempStart = 0;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] > maxGlobal + nums[i]) {
        maxGlobal = nums[i];
        tempStart = i;
      } else {
        maxGlobal += nums[i];
      }

      if (maxGlobal > maxCurrent) {
        maxCurrent = maxGlobal;
        start = tempStart;
        end = i;
      }
    }

    int[] subArray = new int[end - start + 1];
    for (int i = start; i <= end; i++) {
      subArray[i - start] = nums[i];
    }

    System.out.println(Arrays.toString(subArray));
    System.out.println(maxCurrent);
  }

}
