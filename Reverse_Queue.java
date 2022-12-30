package queuedatastructures;
import java.util.LinkedList;
import java.util.Queue;
//import java.util.Stack;
public class Reverse_Queue {
    static Queue<Integer> reverse(Queue<Integer> q) {
    	if(q.isEmpty()) {
    		return q;
    	}
    	int data=q.peek();
    	q.remove();
    	q=reverse(q);
    	q.add(data);
    	return q;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.print(q);
        q=reverse(q);
        System.out.print(q);
	}

}
