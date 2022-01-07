package search;

public class LinearSearch {
  public int searchIterative(int key, int[] A) {
    for (int i = 0; i < A.length; i++) {
      if (A[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public int searchRecursive(int[] array, int start, int key) {
    if (start > array.length) {
      return -1;
    } else if (array[start] == key) {
      return start;
    } else {
      return searchRecursive(array, start + 1, key);
    }
  }
}
