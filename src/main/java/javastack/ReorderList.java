package javastack;

import java.util.Stack;

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

public class ReorderList {

  public static void main(String[] args) {

    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(2);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(4);
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;

    reorderList(node1);

    System.out.println("result is here ....");

    ListNode current = node1;

    while (current != null) {
      System.out.print(" " + current.val);
      current = current.next;
    }
  }

  public static void reorderList(ListNode head) {
    if (head == null || head.next == null) {
      throw new RuntimeException("head is null or head next is null");
    }
    Stack<ListNode> stack = new Stack<>();
    ListNode ptr = head;
    while (ptr != null) {
      stack.push(ptr);
      ptr = ptr.next;
    }
    int cnt = (stack.size() - 1) / 2;
    ptr = head;
    while (cnt-- > 0) {
      ListNode top = stack.pop();
      ListNode tmp = ptr.next;
      ptr.next = top;
      top.next = tmp;
      ptr = tmp;
    }
    stack.pop().next = null;
  }


  }

