package search;

public class BinarySearch {
  public static int findIterative(int[] array, int key) {
    int start = 0;
    int end = array.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (key < array[mid]) end = mid - 1;
      else if (key > array[mid]) start = mid + 1;
      else return mid;
    }
    return -1;
  }

  public static int findRecursive(int[] array, int start, int end, int key) {
    if (start <= end) {
      int mid = (start + end) / 2;
      if (key < array[mid]) return findRecursive(array, start, mid - 1, key);
      else if (key > array[mid]) return findRecursive(array, mid + 1, end, key);
      else return mid;
    }
    return -1;
  }
}

