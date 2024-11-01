package algoexpert;

import java.util.Arrays;
import java.util.List;

class ValidSequence {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    int seqIndex = 0;
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i) == sequence.get(seqIndex))
        seqIndex++;
      if (seqIndex == sequence.size())
        break;
    }
    return sequence.size() == seqIndex;
  }

  public static void main(String[] args) {
    System.out.println(isValidSubsequence(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10), Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10)));
  }
}
