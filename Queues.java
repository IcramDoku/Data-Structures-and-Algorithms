package DataStructuresAndAlgorithms;

import java.util.Queue;
import java.util.LinkedList;

public class Queues {
    public static void main(String[] args) {

        // Queue = FIFO data structure. First-In First-Out (ex. A line of ppl)
        //         A collection designed for holding elements priro to processing
        //         Linear data structure

        //         add    = enqueue, offer()
        //         remove = dequeue, poll()

        Queue<String> queue = new LinkedList<String>(); //queue is an interface not a class, so can't instantiate a queue itself, unlike Stacks. Use LinkedList
        
        System.out.println(queue.isEmpty()); //true, it's empty

        queue.offer("Karen"); //add using Offer
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.size()); //4, the # of objects in the queue

        System.out.println(queue.contains("Harold"));

        System.out.println(queue);
        System.out.println(queue.peek()); //head of the queue
        
        queue.poll(); //remove dequeue FIFO
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll(); //will not throw exception just return []
        // queue.element(); //exception will be thrown so use .poll instead

        System.out.println(queue);


    }
}
