import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunnerQueue {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = 1;
        int data;

        Queue queue = new Queue();
        //DoublyLinkedList list  = new DoublyLinkedList();

        while(1==1) {
            System.out.println("1 -> insert");
            System.out.println("2 -> show");
            System.out.println("3 -> Delete");
            System.out.println("0 -> exit");
            input = Integer.parseInt(br.readLine());

            switch (input){
                case 1:
                    System.out.println("Enter data");
                    data = Integer.parseInt(br.readLine());
                    queue.enQueue(data);
                    break;

                case 2:
                    queue.show();
                    break;
                case 3:
                    queue.deQueue();
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
