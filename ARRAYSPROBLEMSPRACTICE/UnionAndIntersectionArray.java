

import java.util.*;

public class UnionAndIntersectionArray {

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 2, 1 };
    int[] arr2 = { 2, 4, 5, 6, 7 };

    System.out.println(intersection(arr1, arr2));
  }

  static Set<Integer> union(int[] arr1, int[] arr2) {
    HashSet<Integer> set1 = new HashSet<>();
    for (int i : arr1) {
      set1.add(i);
    }
    for (int i : arr2) {
      set1.add(i);
    }
    return set1;
  }

  static Set<Integer> intersection(int[] arr1, int[] arr2) {
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    for (int i : arr1) {
      set1.add(i);
    }

    for (int i : arr2) {
      if (set1.contains(i)) {
        set2.add(i);
      }
    }
    return set2;
  }

}
