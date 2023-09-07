package c230907;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class FIFOFILO {
	// First In First Out => Queue
	// First In Last Out => Stack
	
	public static void main(String[] args) {
		Queue<Integer> qqq = new LinkedList<>(); // Array, LinkedList, ArrayList

		System.out.println(qqq.isEmpty());
		
		qqq.offer(1);
		qqq.offer(2);
		qqq.offer(3);
		qqq.offer(4);
		qqq.offer(5);

		System.out.println(qqq.isEmpty());
		System.out.println(qqq);
		System.out.println(qqq.poll());
		System.out.println(qqq);
		
		Stack<Integer> sss = new Stack<>(); // Array, LinkedList, ArrayList

		System.out.println(sss.isEmpty());

		sss.push(4);
		sss.push(3);
		sss.push(2);
		sss.push(1);
		sss.push(5);

		System.out.println(sss.isEmpty());
		System.out.println(sss);
		System.out.println(sss.pop());
		System.out.println(sss);
	}
	
}
