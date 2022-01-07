package javasorting;

public class MergeSort implements Sorting {
  @Override
  public int[] sort(int[] input) {
    mergeSort(input, 0, input.length - 1);
    return input;
  }

  private void mergeSort(int[] input, int start, int end) {
    if (end <= start) {
      return;
    }
    int mid = (start + end) / 2;
    mergeSort(input, start, mid);
    mergeSort(input, mid + 1, end);
    merge(input, start, mid, end);
  }

  public void merge(int[] inputArray, int start, int mid, int end) {
    int[] tempArray = new int[end - start + 1];
    int leftSlot = start;
    int rightSlot = mid + 1;
    int k = 0;
    while (leftSlot <= mid && rightSlot <= end) {               // element comparison
      if (inputArray[leftSlot] <= inputArray[rightSlot]) {
        tempArray[k] = inputArray[leftSlot];
        leftSlot++;
      } else {
        tempArray[k] = inputArray[rightSlot];
        rightSlot++;
      }
      k = k + 1;
    }

    if (leftSlot <= mid) {                       // nested if and while for both parts for slot
      while (leftSlot <= mid) {
        tempArray[k] = inputArray[leftSlot];
        leftSlot++;
        k = k + 1;
      }
    } else if (rightSlot <= end) {
      while (rightSlot <= end) {
        tempArray[k] = inputArray[rightSlot];
        rightSlot++;
        k = k + 1;
      }
    }

    for (int i = 0; i < tempArray.length; i++) { // REMEMBER to iterate over tempArray
      inputArray[start + i] = tempArray[i];
    }
  }
}
