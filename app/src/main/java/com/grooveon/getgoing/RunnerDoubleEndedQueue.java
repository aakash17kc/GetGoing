import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunnerDoubleEndedQueue {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = 1;
        int data;

        DoubleEndedQueue dequeue = new DoubleEndedQueue();
        //DoublyLinkedList list  = new DoublyLinkedList();

        while(1==1) {
            System.out.println("1 -> Insert Front");
            System.out.println("2 -> Insert Rear");
            System.out.println("3 -> Delete Front");
            System.out.println("4 -> Delete Rear");
            System.out.println("5 -> Show");
            System.out.println("6 -> Show Front");
            System.out.println("7 -> Show Rear");
            System.out.println("0 -> exit");
            input = Integer.parseInt(br.readLine());

            switch (input){
                case 1:
                    System.out.println("Enter data");
                    data = Integer.parseInt(br.readLine());
                    dequeue.enQueueFront(data);
                    break;

                case 2:
                    System.out.println("Enter data");
                    data = Integer.parseInt(br.readLine());
                    dequeue.enQueueRear(data);
                    break;
                case 3:
                    dequeue.deQueueFront();
                    break;
                case 4:
                    dequeue.deQueueRear();
                    break;
                case 5:
                    dequeue.show();
                    break;
                case 6:
                    dequeue.showFront();
                    break;
                case 7:
                    dequeue.showRear();
                    break;
                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong input");
            }

        }
    }
}
