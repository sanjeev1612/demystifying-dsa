package maths;

import java.math.BigDecimal;
import java.math.MathContext;

public class SquareRoot {

  public static void main(String[] args) {
    double number = 2;
    double temp;
    double sr = number / 2.0;
    do {
      temp = sr;
      sr = (temp + (number / temp)) / 2;
    } while (temp - sr != 0);

    System.out.println("square root is " + sr);
    System.out.println("Big decimal square root is " + BigDecimal.valueOf(sr)
            .round(new MathContext(12)));

  }
  
}
