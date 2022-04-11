package revise.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
// PROBLEM : https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/practice-problems/algorithm/disk-tower-b7cc7a50/
public class DiskTower {
  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(reader.readLine());
    String[] s = reader.readLine().split(" ");

    PriorityQueue<Integer> q2 = new PriorityQueue<>(java.util.Collections.reverseOrder());

    int[] s1 = new int[n];
    int max = n;
    for (int i = 0; i < n; i++) {
      s1[i] = Integer.parseInt(s[i]);
      q2.add(s1[i]);

      while (!q2.isEmpty() && q2.peek() == max) {
        System.out.print(q2.poll() + " ");
        max--;
      }
      System.out.println();
    }
  }
}
