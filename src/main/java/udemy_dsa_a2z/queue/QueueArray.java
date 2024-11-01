package udemy_dsa_a2z.queue;

public class QueueArray {
  public static final int DEFAULT_SIZE = 5;
  private Object data[];
  private int rear;

  public QueueArray() {
    data = new Object[DEFAULT_SIZE];
  }

  public boolean isEmpty() {
    return rear == 0;
  }

  public void enqueue(Object element) throws Exception {
    if (rear == DEFAULT_SIZE - 1) {
      System.out.println("Queue is full. Dequeue some objects");
    }
    this.data[rear] = element;
    this.rear++;
  }

  public Object dequeue() { // 2 3
    if (isEmpty())
      System.out.println(("Queue is empty"));
    Object obj = this.data[0];
    for (int i = 0; i < this.rear - 1; i++) {
      data[i] = data[i + 1];
    }
    this.rear--;
    return obj;
  }

  public void printStackElements() {
    System.out.print("Elements are in Stack ::: ");
    for (int i = 0; i < data.length - 1; i++) {
      System.out.print(data[i]);
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    QueueArray queue = new QueueArray();
    queue.enqueue("1");
    queue.enqueue("2");
    queue.enqueue("3");
    System.out.println(queue.dequeue());
    queue.enqueue("5");
    queue.enqueue("6");
    queue.printStackElements();
  }
}