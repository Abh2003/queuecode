package queuedatastructures;
import java.util.LinkedList;
import java.util.Queue;
public class ImplementStackOneQueue {
    Queue <Integer> q=new LinkedList<Integer>();
    void push(int x) {
    	int size=q.size();
    	q.add(x);
    	for(int i=0;i<size;i++) {
    		int z=q.remove();
    		q.add(z);
    	}
    }
    int pop() {
    	if(q.isEmpty()) {
    		return -1;
    	}
    	int x=q.remove();
    	return x;
    }
    int top() {
    	if(q.isEmpty()) {
    		return -1;
    	}
    	return q.peek();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementStackOneQueue s=new ImplementStackOneQueue();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.print(s.top());
		s.pop();
		System.out.print(s.top());
		
	}

}
