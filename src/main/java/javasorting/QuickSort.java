package javasorting;

public class QuickSort implements Sorting {

  @Override
  public int[] sort(int[] input) {
    quickSort(input, 0, input.length - 1);
    return input;
  }

  private void quickSort(int[] input, int start, int end) {
    if (start < end) {
      int pp = partitionPoint(input, start, end);
      quickSort(input, start, pp - 1);
      quickSort(input, pp + 1, end);
    }
  }

  private int partitionPoint(int[] inputArray, int start, int end) {
    int pivot = inputArray[end];
    int i = start - 1;
    for (int j = start; j <= end - 1; j++) {
      if (inputArray[j] < pivot) {
        i = i + 1;
        int ival = inputArray[i];
        int jval = inputArray[j];
        inputArray[i] = jval;
        inputArray[j] = ival;
      }
    }
    int iValue = inputArray[i + 1];
    inputArray[end] = iValue;
    inputArray[i + 1] = pivot;

    return i + 1;
  }
}
