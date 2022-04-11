package revise.arrays;

class LongestCommonPrefix {
  public static String longestCommonPrefix(String[] strs) {
    String result = "";
    int smallest = Integer.MAX_VALUE;
    int count = 0;

    for (String s : strs) {
      if (s.length() < smallest) {
        smallest = s.length();
      }
    }

    while (smallest > 0) {
      for (int i = 0; i < strs.length - 1; i++) {
        if (strs[i].charAt(count) != strs[i + 1].charAt(count)) {
          return result;
        }
      }
      result = result + strs[0].charAt(count);
      smallest--;
      count++;
    }
    return result;
  }

  public static void main(String[] args) {
    String[] list = new String[]{"flower", "flow"};
    System.out.println(longestCommonPrefix(list));
  }
}