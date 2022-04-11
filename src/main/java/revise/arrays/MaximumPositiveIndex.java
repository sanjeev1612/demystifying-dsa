package revise.arrays;

import java.util.*;

// PROBLEM :  Given an array arr[], find the maximum j – i such that arr[j] > arr[i]

class MaximumPositiveIndex {

  static int maxIndexDiffON2(int arr[], int n) {
    int maxDiff = -1;
    int i, j;

    for (i = 0; i < n; ++i) {
      for (j = n - 1; j > i; --j) {
        System.out.println("value of i and j are "+i+"  "+j);
        if (arr[j] > arr[i] && maxDiff < (j - i))
          maxDiff = j - i;
      }
    }

    return maxDiff;
  }

  static int maxIndexDiffNLogN(ArrayList<Integer> arr, int n) {

    Map<Integer, ArrayList<Integer>> hashmap = new HashMap<Integer, ArrayList<Integer>>();

    for (int i = 0; i < n; i++) {
      if (!hashmap.containsKey(arr.get(i))) {
        hashmap.put(arr.get(i), new ArrayList<Integer>());
      }
      hashmap.get(arr.get(i)).add(i);
    }
    Collections.sort(arr);
    int maxDiff = Integer.MIN_VALUE;
    int temp = n;

    for (int i = 0; i < n; i++) {
      if (temp > hashmap.get(arr.get(i)).get(0)) {
        temp = hashmap.get(arr.get(i)).get(0);
      }
      maxDiff = Math.max(maxDiff, hashmap.get(arr.get(i)).get(hashmap.get(arr.get(i)).size() - 1) - temp);
    }
    return maxDiff;
  }

  public static void main(String[] args) {
    int n = 6;
    ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(5, 3, 2, 1, 1, 4));
    int ans = maxIndexDiffNLogN(arr, n);
    System.out.println("The maxIndexDiff using map is : " + ans);
    int resultN2=maxIndexDiffON2(new int[]{5, 3, 2, 1, 1, 4},6);
    System.out.println("The maxIndexDiff using two for loop is : " + resultN2);

  }

}