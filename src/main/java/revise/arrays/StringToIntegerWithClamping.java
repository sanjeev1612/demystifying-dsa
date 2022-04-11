package revise.arrays;

class StringToIntegerWithClamping {

  public static int myAtoi(String s) {
    if (s == null || s.isEmpty()) {
      return 0;
    }
    char[] letters = s.toCharArray();
    long result = 0;

    boolean isNegative = false;
    boolean symbolEncountered = false;
    boolean numbersStarted = false;

    for (int i = 0; i < letters.length; ++i) {
      char c = letters[i];

      if (!Character.isDigit(c)) {
        if (numbersStarted) {
          break;
        }
        if (c == '-') {
          if (symbolEncountered) {
            return 0;
          }
          isNegative = true;
          numbersStarted = true;
          symbolEncountered = true;
          continue;
        }
        if (c == '+') {
          if (symbolEncountered) {
            return 0;
          }
          numbersStarted = true;
          symbolEncountered = true;
          continue;
        }
        if (c == ' ') {
          if (!numbersStarted) {
            continue;
          }
        }
        return 0;
      }

      numbersStarted = true;
      int numLetter = Character.getNumericValue(c);
      result = result * 10 + numLetter;

      if (isNegative && result > Integer.MAX_VALUE) {
        return Integer.MIN_VALUE;
      }

      if (result > Integer.MAX_VALUE) {
        return Integer.MAX_VALUE;
      }
    }

    if (isNegative) {
      result = result * -1;
    }
    return (int) result;
  }

  public static void main(String[] args) {
    System.out.println(myAtoi("+1"));
  }

}