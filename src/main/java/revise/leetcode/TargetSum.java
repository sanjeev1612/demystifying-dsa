package revise.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TargetSum {
  public static void main(String[] args) {
    int[] result = twoSum2(new int[]{3, 2, 4}, 6);
    System.out.println("result is " + Arrays.toString(result));
  }

  public static int[] twoSum1(int[] numbers, int target) {
    List<Integer> set = new ArrayList<>();
    for (int i = 0; i <= numbers.length - 1; i++) {
      for (int j = numbers.length - 1; j >= 0; j--) {
        if (numbers[i] + numbers[j] == target && i != j) {
          set.add(i);
          set.add(j);
          return set.stream().mapToInt(Integer::intValue).toArray();
        }
      }
    }
    return set.stream().mapToInt(Integer::intValue).toArray();
  }

  public static int[] twoSum2(int[] nums, int target) {
    List<Integer> set = new ArrayList<>();
    List<Integer> newList = new ArrayList<>();
    for (int num : nums)
      newList.add(num);
    for (int i = 0; i < newList.size(); i++) {
      int temp = newList.get(i);
      int result = newList.contains(target - temp) ? newList.indexOf(target - temp) : -1;
      if (result >= 0 && i != result) {
        set.add(i);
        set.add(result);
        return set.stream().mapToInt(Integer::intValue).toArray();
      }

    }
    return set.stream().mapToInt(Integer::intValue).toArray();
  }
}
