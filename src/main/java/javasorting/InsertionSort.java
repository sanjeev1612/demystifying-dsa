package javasorting;

public class InsertionSort implements Sorting {
  @Override
  public int[] sort(int[] input) {
    for (int i = 1; i < input.length; i++) {
      int element = input[i];
      int j = i - 1;
      while (j >= 0 && input[j] > element) {
        input[j + 1] = input[j];
        j--;
      }
      input[j + 1] = element;
    }
    return input;
  }
}
