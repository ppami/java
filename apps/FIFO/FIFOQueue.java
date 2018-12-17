package hackathon2.FIFO;

import java.util.LinkedList;
import java.util.Queue;
 
public class FIFOQueue {
     
    public static void main(String args[]){
         
        Queue<String> myQueue = new LinkedList<String>();
        myQueue.add("Item1");
        myQueue.add("Item2");
        myQueue.add("Item3");
        myQueue.offer("Item4");
         
        for(String item : myQueue){
            System.out.println("Item: " + item);
        }
         
        System.out.println("Queue: " + myQueue);
        System.out.println(myQueue.peek());
        System.out.println("After peek: " + myQueue);
        System.out.println(myQueue.poll());
        System.out.println("After poll: " + myQueue);
        System.out.println(myQueue.remove());
        System.out.println("After remove: " + myQueue);
             
    }
}
