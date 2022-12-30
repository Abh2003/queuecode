package queuedatastructures;

public class ImplementCQueueUsingCLL {
    static class node{
    	int data;
    	node next;
    	node(int data){
    		this.data=data;
    	}
    }
    static class Queue{
    	node front,rear;
    }
    static void enqueue(Queue q,int data) {
    	node l=new node(data);
    	if(q.front==null) {
    		q.front=l;
    	}else {
    		q.rear.next=l;
    	}
    	q.rear=l;
    	q.rear.next=q.front;
    }
    static int dequeue(Queue q) {
    	if(q.front==null) {
    		System.out.print("queue is empty");
    		return Integer.MIN_VALUE;
    	}
    	int value=0;
    	if(q.front==q.rear) {
    		value=q.front.data;
    		q.front=null;q.rear=null;
    	}
    	else {
    		node temp=q.front;
    		value=temp.data;
    		q.front=q.front.next;
    		q.rear.next=q.front;
    	}
    	return value;
    }
    static void displayQueue(Queue q) {
    	node temp=q.front;
    	System.out.println("elements in circulr queue are");
    	while(temp.next !=q.front) {
    		System.out.print(temp.data+" ");
    		temp=temp.next;
    	}
    	System.out.println(temp.data);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Queue q=new Queue();
        q.front=q.rear=null;
        enqueue(q, 14);
        enqueue(q, 22);
        enqueue(q, 6);
  
        // Display elements present in Circular Queue
        displayQueue(q);
  
        // Deleting elements from Circular Queue
        System.out.printf("\nDeleted value = %d", dequeue(q));
        System.out.printf("\nDeleted value = %d", dequeue(q));
  
        // Remaining elements in Circular Queue
        displayQueue(q);
  
        enqueue(q, 9);
        enqueue(q, 20);
        displayQueue(q);
	}

}
