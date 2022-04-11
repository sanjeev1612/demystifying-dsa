package revise.arrays;

import java.util.Scanner;

public class TargetsumSubarr {

  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int[] arr = new int[scn.nextInt()];
    int target = scn.nextInt();

    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    System.out.print("arr[]: {");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i]);
    }

    System.out.println(" }");
    solveEfficient(arr, target);

  }

  public static void solveEfficient(int[] arr, int target) {
    int start = 0, end = 0;
    int runningSUm = 0;
    while (start < arr.length && end <= arr.length) {
        if (runningSUm == target) {
            System.out.println("start and end index are " + start + " " + (int) (end - 1));
            if (end <= arr.length - 1) {
                runningSUm = runningSUm + arr[end];
            }
            end++;
        } else {
            if (runningSUm > target) {
                runningSUm = runningSUm - arr[start];
                start++;
            } else {
                if (end <= arr.length - 1) {
                    runningSUm = runningSUm + arr[end];
                }
                end++;
            }
        }
    }
  }
}
 