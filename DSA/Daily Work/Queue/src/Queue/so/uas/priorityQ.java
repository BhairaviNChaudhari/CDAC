package Queue.so.uas;

import java.util.PriorityQueue;

//using adt:'
public class priorityQ {
public static void main(String[] args) {
	PriorityQueue<Integer> q =new PriorityQueue<Integer>();
	q.offer(5);
	q.offer(9);
	q.offer(6);
	q.offer(2);
	while(!q.isEmpty()) 
		System.out.println(q.poll());
	
}//time complexity 0(logn)
}
