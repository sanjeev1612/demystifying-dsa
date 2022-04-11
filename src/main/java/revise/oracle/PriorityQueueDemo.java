package revise.oracle;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    PriorityQueue<Integer> pq= new PriorityQueue<>();
    pq.add(10);
    pq.add(5);
    pq.add(2);
    pq.add(29);

while(pq.peek() !=null ){
  System.out.println(pq.poll());
}

  }
}
