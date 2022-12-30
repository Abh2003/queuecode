package queuedatastructures;
class Queue{
	int front,rear,size;
	int capacity;
	int array[];
	public Queue(int c) {
		capacity=c;
		front=size=0;
		rear=capacity-1;
		array=new int[capacity];
	}
	boolean isFull() {
		return (size==capacity);
	}
	boolean isEmpty() {
		return size==0;
	}
	void enqueue(int data) {
		if(isFull()) {
			return;
		}
		rear=(rear+1)%capacity;
		array[rear]=data;
		size=size+1;
		System.out.println(data+"enqueued to queue");
	}
	int dequeue() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		int item=array[front];
		front = (front + 1);
        size = size - 1;
        return item;
	}
	int front() {
		if(isEmpty()) {
			return Integer.MAX_VALUE;
		}
		return array[front];
	}
	int rear() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return array[rear];
	}
}
public class ImplementQueueArray {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(1000);
		 
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
 
        System.out.println(queue.dequeue()
                           + " dequeued from queue\n");
 
        System.out.println("Front item is "
                           + queue.front());
 
        System.out.println("Rear item is "
                           + queue.rear());
	}

}
