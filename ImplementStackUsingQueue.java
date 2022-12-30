package queuedatastructures;
import java.util.LinkedList;
import java.util.Queue;
public class ImplementStackUsingQueue {
     static class Stack{
    	Queue<Integer> q1=new LinkedList<Integer>();
        Queue<Integer> q2=new LinkedList<Integer>();
    	
        int size=0;
    	void push(int x) {
    		size++;
    		q2.add(x);
    		while(!q1.isEmpty()) {
    			q2.add(q1.peek());
    			q1.remove();
    		}
    		Queue<Integer> q=q1;
    		q1=q2;
    		q2=q;
    	}
    	void pop() {
    		if(q1.isEmpty()) {
    			return;
    		}
    		q1.remove();
    		size--;
    	}
    	int top() {
    		if(q1.isEmpty()) {
    			return -1;
    		}
    		return q1.peek();
    	}
    	int size() {
    		return size;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Stack s=new Stack();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    s.push(4);
	    System.out.print(s.top());
	    s.pop();
	    System.out.print(s.top());
	    s.pop();
	    System.out.print(s.top());
        
	    s.pop();
	}

}
