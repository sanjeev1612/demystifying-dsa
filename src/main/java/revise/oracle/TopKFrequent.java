package revise.oracle;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequent {
  public static int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> occurance = new HashMap<>();
    for (int i : nums) {
      occurance.put(i, occurance.getOrDefault(i,Integer.valueOf(0))+1);
    }

    return occurance.entrySet().stream()
            .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue())).limit(2).map(a->a.getKey()).collect(Collectors.toList())
            .stream().mapToInt(Integer::new).toArray();
  }


  public static void main(String[] args) {
    int[] arr = new int[]{1,1,1,3,3,3,2};
    System.out.println(Arrays.toString(topKFrequent(arr, 2)));
  }
}
