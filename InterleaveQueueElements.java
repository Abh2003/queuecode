package queuedatastructures;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class InterleaveQueueElements {
    static void interleaveElements(Queue<Integer> q) {
    	Stack<Integer> s=new Stack<Integer>();
    	int k=q.size()/2;
    	for(int i=0;i<k;i++) {
    		s.push(q.remove());
    	}
    	while(!s.isEmpty()) {
    		q.add(s.pop());
    	}
    	for(int i=0;i<k;i++) {
    		q.add(q.remove());
    	}
    	for(int i=0;i<k;i++) {
    		s.push(q.remove());
    	}
    	while(!s.empty()) {
    		q.add(s.pop());
    		q.add(q.remove());
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        System.out.println(q);
        interleaveElements(q);
        System.out.print(q);
        
	}

}
