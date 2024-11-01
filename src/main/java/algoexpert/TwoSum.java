package algoexpert;

import java.util.*;

class TwoSum {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    Map<Integer, String> numMap = new HashMap<>();
    int[] result = new int[2]; boolean found=false ;
    for(int i=0; i < array.length ;i++){
      if(numMap.containsKey(targetSum-array[i])){
        result[0]=array[i];
        result[1]= targetSum-array[i];
        found= true ;
      }
      else {
        numMap.put(array[i],"PROCESSED");
      }
    }
  return found ? result : new int[0];
  }
}