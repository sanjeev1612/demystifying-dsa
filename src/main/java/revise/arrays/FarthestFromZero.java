package revise.arrays;

import java.util.TreeSet;

public class FarthestFromZero {

  // Using Tree Set
  public static int farthestFromZero(int N, int[] Arr) {
    TreeSet<Integer> ts = new TreeSet<Integer>();
    for (int i = 0; i < N; i++) {
      ts.add(Arr[i]);
    }
    int maxV = ts.last();
    int minV = ts.first();

    if (Math.abs(minV) >= maxV) {
      return minV;
    }
    return maxV;

  }

  //less memory
  public static int farthestFromZeroUsingArrays(int N, int[] Arr) {
    //You don't really need to store every element
    int best = 0;

    for (int i = 0; i < N; i++) {

      if (Math.abs(Arr[i]) > Math.abs(best)) {
        best = Arr[i];
      }
      else if (Math.abs(best) == Math.abs(Arr[i])
              && best > Arr[i]) {
        best = Arr[i];
      }
    }
    return best;
  }
}
