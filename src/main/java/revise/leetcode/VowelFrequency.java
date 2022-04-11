package revise.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class VowelFrequency {
  public static void main(String[] args) {
    String input = "elephant";
    char[] inputArray=input.toCharArray();

    Map<Character,Integer> vowelFrequency=new HashMap<Character, Integer>();

    vowelFrequency.put('a',0);
    vowelFrequency.put('e',0);
    vowelFrequency.put('i',0);
    vowelFrequency.put('o',0);
    vowelFrequency.put('u',0);

    for(char c:inputArray){
      if(c =='a'|| c =='e'||c =='i'||c =='o'||c =='u') {
        int existingCount =vowelFrequency.get(c);
        vowelFrequency.put(c,existingCount+1);
      }
    }

    vowelFrequency.entrySet().stream().sorted(new Comparator<Map.Entry<Character, Integer>>() {
      @Override
      public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
        return -o1.getValue().compareTo(o2.getValue());
      }
    }).forEach(System.out::println);
  }
}
