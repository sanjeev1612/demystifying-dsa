package recursion;

public class Stairs {


  static int countWays(int n ){
    return fibo(n+1);
  }

  private static int fibo(int i) {
    if(i <= 1)
      return i;
    return fibo(i-1) +fibo(i-2);
  }

  public static void main(String[] args) {
    System.out.println(countWays(4));
  }
}
