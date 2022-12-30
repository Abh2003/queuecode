package queuedatastructures;
public class ImplementQueueLL {
	class Qnode{
		int key;
		Qnode next;
		Qnode(int data){
			key=data;
			next=null;
		}
	}
		Qnode front,rear=null;
		void enqueue(int data) {
			Qnode temp=new Qnode(data);
			if(rear==null) {
				front=rear=temp;
				return;
			}
			rear.next=temp;
			rear=temp;
		}
		void dequeue() {
			if(front==null) {
				return;
			}
			Qnode temp=front;
			front=front.next;
			if(front==null) {
				rear=null;
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementQueueLL q=new ImplementQueueLL();
         q.enqueue(10);
         q.enqueue(20);
         q.dequeue();
         q.dequeue();
         q.enqueue(30);
         q.enqueue(40);
         q.enqueue(50);
         q.dequeue();
         System.out.println("Queue Front : " + q.front.key);
         System.out.println("Queue Rear : " + q.rear.key);
	}

}
