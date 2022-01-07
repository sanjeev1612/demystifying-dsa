package maths;

public class SquareRoot {
  public static void main(String[] args) {
    double number = 4;
    double temp;
    double sr = number / 2.0;

    do {
      temp = sr;
      sr = (temp + (number / temp)) / 2;
    } while (temp - sr != 0);

    System.out.println("square root is " + sr);
  }

}
