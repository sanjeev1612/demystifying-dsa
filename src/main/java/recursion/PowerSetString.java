package recursion;

public class PowerSetString {
  public static void powerSet(String str, int i, String curr) {
    if (i == str.length()) {
      System.out.println("value is :" + curr);
      return;
    }
    powerSet(str, i + 1, curr);
    powerSet(str, i + 1, curr + str.charAt(i));
  }

  public static void main(String[] args) {
    powerSet("abc", 0, "");
  }
}
