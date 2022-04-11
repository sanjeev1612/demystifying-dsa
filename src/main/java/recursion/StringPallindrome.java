package recursion;

public class StringPallindrome {

  public static boolean isPallindrome(String s, int l, int r) {
    if (l >= r) {
      return true;
    }

    if (s.charAt(l) != s.charAt(r)) {
      return false;
    }

    return isPallindrome(s, l + 1, r - 1);
  }

  public static void main(String[] args) {
    System.out.println(isPallindrome("abba",0,3));
  }
}
