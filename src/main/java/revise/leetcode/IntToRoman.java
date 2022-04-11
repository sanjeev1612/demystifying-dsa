package revise.leetcode;

import java.util.*;

public class IntToRoman {
  public static void main(String[] args) {
    System.out.println(intToRoman(60));
  }
  public static String intToRoman(int num) {
    Map<Integer, String> units = new HashMap<Integer, String>();
    Deque<String> finalResult = new ArrayDeque<String>();
    units.put(1, "I");
    units.put(2, "II");
    units.put(3, "III");
    units.put(4, "IV");
    units.put(5, "V");
    units.put(6, "VI");
    units.put(7, "VII");
    units.put(8, "VIII");
    units.put(9, "IX");
    units.put(60, "LX");
    units.put(70, "LXX");
    units.put(80, "LXXX");
    units.put(600, "DC");
    units.put(700, "DCC");
    units.put(800, "DCCC");
    units.put(10, "X");
    units.put(40, "XL");
    units.put(50, "L");
    units.put(100, "C");
    units.put(90, "XC");
    units.put(500, "D");
    units.put(400, "CD");
    units.put(900, "CM");
    units.put(1000, "M");
    int multiplier = 1;
    String value = "";
    while (num > 0) {
      int unit = num % 10;
      if (unit != 0)
        value = units.get(unit);

      if (multiplier >= 10) {
        if (units.containsKey(multiplier * unit)) {
          finalResult.addFirst(units.get(multiplier * unit));
        } else {
          String mu = units.get(multiplier);
          for (int i = 0; i < unit; i++)
            finalResult.addFirst(mu);
        }
      } else {
        finalResult.addFirst(value);
      }
      multiplier = multiplier * 10;
      num = num / 10;
    }
    String stringRep = "";
    for (String s : finalResult)
      stringRep += s;
    return stringRep;
  }
}
