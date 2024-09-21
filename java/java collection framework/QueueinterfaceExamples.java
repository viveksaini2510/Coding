import java.util.*;

public class QueueinterfaceExamples {

    static void dequeExamples(){
        Deque<Integer> dq = new ArrayDeque();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }

    static void PriorityQueueExamples(){
       // PriorityQueue<Integer> pq = new PriorityQueue<>(); //min pq
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //max pq
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek());  // 5 priority of smallest number
        System.out.println(pq);  // only topmost priority element will be processed first
        System.out.println(pq.poll());//5
        System.out.println(pq.peek());
        System.out.println(pq);


    }

    static void queueExamples(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
        System.out.println(q.size());
        System.out.println(q);
    }
    public static void main(String[] args) {
       // queueExamples();
      //  PriorityQueueExamples();
      dequeExamples();
    } 
}
