package javasorting;

public class SelectionSort implements Sorting {

  @Override
  public int[] sort(int[] input) {
    for (int i = 0; i < input.length; i++) {
      int minimum = i;
      for (int j = i + 1; j < input.length; j++) {
        if (input[j] < input[minimum]) {
          minimum = j;
        }
      }
      int temp = input[i];
      input[i] = input[minimum];
      input[minimum] = temp;
    }

    return input;
  }
}
