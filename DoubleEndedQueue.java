public class DoubleEndedQueue {

    Node rear = null, front = null;
    Node head;


    public void enQueueFront(int data){

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (rear == null || front==null) {
            rear = node;
            head = node;
            front = node;

        } else {

            front = head;// not imp
            node.next = head;
            head = node;
            front = node;
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

    public void enQueueRear(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (rear == null || front==null) {
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

    public void deQueueFront(){
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

    public void deQueueRear(){
        Node n = head;
        if (n == null) {
            System.out.println("Queue Underflow");
        } else {
            Node temp,prev = null;
            while (n.next != null) {
                prev = n;
                n = n.next;
            }
            System.out.println("Deleted Data -> " + n.data);
            prev.next = n.next;
            rear = prev;

            temp = null;
        }
    }
    public void showFront(){
        System.out.println("Front data -> "+front.data);
    }
    public void showRear(){
        System.out.println("Rear Data -> "+rear.data);
    }
}
