
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
       
        Queue<String> queue = new LinkedList<>();
        queue.offer("Biswa");
        queue.offer("Ranjan");
        queue.offer("Prusty");

        System.out.println("Queue after insertion: " + queue);

        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + queue);
    }
}
