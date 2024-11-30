

import java.util.*;

public class SubArrayWithSum {

  public static void main(String[] args) {
    int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
    int sum = 23;
    int[] res = sum1(arr, sum);
    System.out.println(Arrays.toString(res));
  }

  static int[] sum1(int[] arr, int sum) {

    int curr_sum = 0;
    int start = 0;
    for (int end = 0; end < arr.length; end++) {
      curr_sum += arr[end];
      while (curr_sum > sum && start <= end) {
        curr_sum -= arr[start];
        start++;
      }

      if (curr_sum == sum) {
        return Arrays.copyOfRange(arr, start, end+1);
      }

    }
    return new int[] { -1 };
  }

}
