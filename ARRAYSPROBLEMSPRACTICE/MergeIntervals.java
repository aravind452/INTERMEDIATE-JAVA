package ARRAYSPROBLEMSPRACTICE;

import java.util.*;

public class MergeIntervals {

  public static void main(String[] args) {
    int[][] intervals = { { 9, 10 }, { 1, 3 }, { 2, 4 }, { 6, 8 } };

    List<int[]> size = merge(intervals);
    System.out.println("Size of merged intervals: " + size);
    // for (int i = 0; i < size; i++) {
    // System.out.println(intervals[i][0] + " " + intervals[i][1]);
    // }

    System.out.println(size);

  }

  static int mergeIntervals(int[][] arr) {
    Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

    int resIdx = 0;

    for (int i = 1; i < arr.length; i++) {

      if (arr[resIdx][1] >= arr[i][0])

        arr[resIdx][1] = Math.max(arr[resIdx][1], arr[i][1]);

      else {
        resIdx++;
        arr[resIdx] = arr[i];
      }
    }

    return resIdx + 1;

  }
  // without sorting - will not work for all the cases

  static List<int[]> merge(int[][] intervals) {
    List<int[]> merged = new ArrayList<>();
    // System.out.println(merged);

    for (int[] interval : intervals) {
      boolean isMerged = false;
      for (int[] mergedInterval : merged) {

        if (interval[0] <= mergedInterval[1] && interval[1] >= mergedInterval[0]) {

          mergedInterval[0] = Math.min(mergedInterval[0], interval[0]);
          mergedInterval[1] = Math.max(mergedInterval[1], interval[1]);
          isMerged = true;
          break;
        }
      }

      if (!isMerged) {
        merged.add(interval);
      }
    }

    return merged;
  }

}
