package revise.linkedlist;

class ListNode {
  int val;
  LiNode next;

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, LiNode next) {
    this.val = val;
    this.next = next;
  }
}

class SumUsingLinkedList {
  public LiNode addTwoNumbers(LiNode l1, LiNode l2) {

    LiNode resultNode = new LiNode(0);
    LiNode dumHead = resultNode;

    int carry = 0;

    while(l1 != null || l2 != null) {
      int val1 = l1 == null ? 0 : l1.val;
      int val2 = l2 == null ? 0 : l2.val;

      int sum = val1 + val2 + carry;
      carry = sum / 10;
      sum = sum % 10;

      dumHead.next = new LiNode(sum);
      dumHead = dumHead.next;

      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
    }
    if (carry > 0) {
      dumHead.next = new LiNode(carry);
    }
    return resultNode.next;
  }
  }
