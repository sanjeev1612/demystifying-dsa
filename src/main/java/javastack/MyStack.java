package javastack;

import java.util.Arrays;

public class MyStack {
    private int[] stack;
    private int capacity;
    private int top;

    public MyStack() {
        this.capacity = 5;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("stack is full now " + data + " cannot be inserted to the stack ");
            return;
        }
        top = top + 1;
        stack[top] = data;
        System.out.println("data inserted inside stack " + data);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("stack is empty .. nothing to pop");
            return;
        }
        int value = stack[top--];
        System.out.println("value popped out is " + value);
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top + 1 == capacity;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stack=" + Arrays.toString(stack) +
                ", capacity=" + size() +
                ", top=" + top +
                '}';
    }

    public static void main(String[] args) {
        MyStack mst = new MyStack();
        mst.push(1);
        mst.push(2);
        mst.push(3);
        mst.push(4);
        mst.push(5);
        mst.push(6);
        mst.push(7);
        System.out.println("isEmpty " + mst.isEmpty());
        System.out.println("isFull " + mst.isFull());

        mst.pop();
        mst.pop();
        mst.pop();
        mst.pop();
        mst.pop();
        mst.pop();

        System.out.println("isEmpty " + mst.isEmpty());
        System.out.println("isFull " + mst.isFull());
    }
}
