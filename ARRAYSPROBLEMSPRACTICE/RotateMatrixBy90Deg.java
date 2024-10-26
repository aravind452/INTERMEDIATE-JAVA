package ARRAYSPROBLEMSPRACTICE;

import java.util.*;

public class RotateMatrixBy90Deg {

  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    rotate(arr);

  }

  static void rotate(int[][] arr) {

    int[][] B = new int[arr.length][arr[0].length];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {

        B[i][j] = arr[j][i];

      }
    }
    for (int i = 0; i < B.length; i++) {
      for (int j = 0; j < B.length / 2; j++) {
        int temp = B[i][j];
        B[i][j] = B[i][B.length - 1 - j];
        B[i][B.length - 1 - j] = temp;

      }
    }
    System.out.println(Arrays.deepToString(B));

  }

}
