package revise.string;

public class LongestPassword {

  public static int solution(String S) {
    String[] passwords = S.split(" ");
    int maxLengthPassword = -1;
    String resultString="";
    for (String s : passwords) {
      boolean result = isValidPassword(s);
      if (result) {
        if (s.length() > maxLengthPassword) {
          maxLengthPassword = s.length();
          resultString=s;
        }
      }
    }
    System.out.println("result String "+resultString);
    return maxLengthPassword;
  }

  public static boolean isValidPassword(String s) {
    int letterCount = 0;
    int digitCount = 0;
    for (char c : s.toCharArray()) {
      if (Character.isDigit(c)) {
        digitCount++;
      } else if (Character.isLetter(c)) {
        letterCount++;
      } else {
        return false;
      }
    }
    if (letterCount % 2 == 0 && digitCount % 2 == 1) {
      return true;
    } else return false;
  }

  public static void main(String[] args) {
    System.out.println(solution("test 5 a0A pass007 ?xy1"));
  }
}
