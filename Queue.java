public class Queue {

    Node rear = null, front = null;
    Node head;

    public void enQueue(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (rear == null) {
            rear = node;
            head = node;
            front = node;

        } else {
            Node n = head;
            front = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
            rear = node;
        }
    }

    public void show() {
        Node n = head;

        if (head == null) {
            System.out.println("Empty");
        } else {

            while (n != null) {

                System.out.println("Data -> " + n.data);
                n = n.next;
            }
        }
    }

    public void deQueue() {
        Node n = head;
        if (n == null) {
            System.out.println("Queue Underflow");
        } else {
            Node temp;
            System.out.println("Deleted Data -> " + front.data);
            temp = front;
            front = head.next;
            head = head.next;

            temp = null;
        }
    }


}