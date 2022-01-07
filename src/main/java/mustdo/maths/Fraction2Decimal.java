package mustdo.maths;

import java.util.LinkedHashSet;
import java.util.Set;

public class Fraction2Decimal {
  public static void main(String[] args) {
    System.out.println(fractionToDecimal(16, 13));
  }

  public static String fractionToDecimal(int numerator, int denominator) {
    double result = (double) numerator / denominator;
    String res = String.valueOf(result);

    if (res.contains(".")) {
      String[] parts = res.split("\\.");
      String leftPart = parts[0];
      String rightPart = parts[1];
      Set<Character> set = new LinkedHashSet<>();
      for (char c : rightPart.toCharArray()) {
        set.add(c);
      }
      if (rightPart.length() > set.size()){
        StringBuilder ne=new StringBuilder("");
        for(char t:set){
          ne.append(t);
        }
        return leftPart+"."+"("+ ne.toString()+")";
      } else {
        return res;
      }
    } else {
      return res;
    }
  }
}
