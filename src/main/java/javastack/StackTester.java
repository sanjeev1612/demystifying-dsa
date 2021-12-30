package javastack;

public class StackTester {
  public static void main(String[] args) {
    StackAdt<Integer> intStack = new MyStack<>(5);
    intStack.push(10);
    intStack.push(20);
    intStack.push(30);
    intStack.push(40);
    intStack.push(50);

    System.out.println("size of stack before is " + intStack.size());

    while(!intStack.isEmpty()) {
      System.out.println(intStack.pop());
    }

    System.out.println("size of stack after is " + intStack.size());
  }
}
