package revise.maths;

public class SwapWithXor {
  public static void main(String[] args) {
    int a = 10;
    int b = 6;

    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("Numbers Swapped a :" + a + "  b:" + b);
  }
}
