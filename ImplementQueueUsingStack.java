package queuedatastructures;
import java.util.Stack;
public class ImplementQueueUsingStack {
//    static class Queue{
//    	Stack<Integer> s1=new Stack<Integer>();
//    	Stack<Integer> s2=new Stack<Integer>();
//    	void enqueue(int x) {
//    		while(!s1.isEmpty()) {
//    			s2.push(s1.pop());
//    		}
//    		s1.push(x);
//    		while(!s2.isEmpty()) {
//    			s1.push(s2.pop());
//    		}
//    	}
//    	void dequeue() {
//    		if(s1.isEmpty()) {
//    			System.out.print("q is empty");
//    			System.exit(0);
//    		}
//    		int x=s1.peek();
//    		s1.pop();
//    		System.out.println(x);
//    	}
//    }
    //part 2
    static class Queue1{
    	Stack<Integer> s3;
    	Stack<Integer> s4;
    }
    static void push(Stack<Integer> s5,int x) {
    	s5.push(x);
    }
    static int pop(Stack<Integer> s5) {
    	if (s5.isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(0);
    	}
        return s5.pop();
    }
    static void enqueue1(Queue1 q1,int x) {
    	push(q1.s3,x);
    }
    static int dequeue1(Queue1 q1)
    {
        int x;
 
        /* If both stacks are empty then error */
        if (q1.s3.isEmpty() && q1.s4.isEmpty()) {
            System.out.println("Q is empty");
            System.exit(0);
        }
 
        /* Move elements from stack1 to stack 2 only if
        stack2 is empty */
        if (q1.s4.isEmpty()) {
            while (!q1.s3.isEmpty()) {
                x = pop(q1.s3);
                push(q1.s4, x);
            }
        }
        x = pop(q1.s4);
        return x;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue q=new Queue();
//		q.enqueue(1);
//		q.enqueue(2);
//		q.enqueue(3);
//		q.enqueue(4);
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
//		q.dequeue();
		//part2
		Queue1 q1=new Queue1();
		q1.s3=new Stack<Integer>();
		q1.s4=new Stack<Integer>();
		enqueue1(q1,1);
		enqueue1(q1,2);
		enqueue1(q1,3);
		enqueue1(q1,4);
		System.out.print((dequeue1(q1)));
		System.out.print((dequeue1(q1)));
		System.out.print((dequeue1(q1)));
		System.out.print((dequeue1(q1)));
				

	}

}
