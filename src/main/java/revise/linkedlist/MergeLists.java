package revise.linkedlist;

class LiNode {
  int val;
  LiNode next;

  LiNode() {
  }

  LiNode(int val) {
    this.val = val;
  }

  LiNode(int val, LiNode next) {
    this.val = val;
    this.next = next;
  }
}

class Solution {
  public LiNode mergeTwoLists(LiNode list1, LiNode list2) {
    LiNode res = new LiNode();
    LiNode temp = res;
    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        temp.next = list1;
        list1 = list1.next;
      } else {
        temp.next = list2;
        list2 = list2.next;
      }
      temp = temp.next;
    }
    if (list1 != null)
      temp.next = list1;
    if (list2 != null)
      temp.next = list2;
    return (res.next);
  }
}