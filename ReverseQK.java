package queuedatastructures;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class ReverseQK {
    static void reverse(Queue<Integer> q,int k) {
    	Stack<Integer> s=new Stack<Integer>();
    	for(int i=0;i<k;i++) {
    		s.push(q.remove());
    	}
    	while(!s.isEmpty()) {
    		q.add(s.pop());
    	}
    	for(int i=0;i<q.size()-k;i++) {
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
        System.out.println(q);
        int k=3;
        reverse(q,k);
        System.out.println(q);
	}

}
