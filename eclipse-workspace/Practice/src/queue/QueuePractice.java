package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {
	
	
	
	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		System.out.println(queue);
		
		queue.remove();
		System.out.println(queue);
		
		queue.add(30);
		System.out.println(queue); 
		
		
		
	}
}
