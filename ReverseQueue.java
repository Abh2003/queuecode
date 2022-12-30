package queuedatastructures;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class ReverseQueue {
    static Queue<Integer> queue;
    static void reversequeue() {
    	Stack<Integer> stack=new Stack<Integer>();
    	while(!queue.isEmpty()) {
    		stack.push(queue.peek());
    		queue.remove();
    	}
    	while(!stack.isEmpty()) {
    		queue.add(stack.peek());
    		stack.pop();
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         queue =new LinkedList<Integer>();
         queue.add(1);
         queue.add(2);
         queue.add(3);
         queue.add(4);
         queue.add(5);
         System.out.println(queue);
         reversequeue();
         System.out.println(queue);
	}

}
