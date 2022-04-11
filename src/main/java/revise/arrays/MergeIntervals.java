package revise.arrays;

import java.util.ArrayList;
import java.util.List;

class MergeIntervals {
  public int[][] merge(int[][] intervals) {

    if (intervals.length <= 1) {
      return intervals;
    }

    List<int[]> output = new ArrayList<>();
    int[] currentInterval = intervals[0];
    output.add(currentInterval);

    for (int[] interval : intervals) {
      int current_begin = currentInterval[0];
      int current_end = currentInterval[1];
      int next_begin = interval[0];
      int next_end = interval[1];

      if (current_end >= next_begin) {
        currentInterval[1] = Math.max(current_end, next_end);
      } else {
        currentInterval = interval;
        output.add(currentInterval);
      }
    }
    return output.toArray(new int[output.size()][]);
  }
}