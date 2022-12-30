package queuedatastructures;

public class ImplementQueueUsingCircularArray {
    static final int max=1000;
    int arr[];
    int size;
    int front;
    int rear;
    public ImplementQueueUsingCircularArray(int size) {
    	arr=new int[max];
    	this.size=size;
    	front=-1;
        rear=0;
    }
    boolean isFull() {
    	return ((front==0 && rear==size-1)||front==rear+1);
    }
    boolean isEmpty() {
    	return ((front==-1));
    }
    void insertFront(int x) {
    	if(isFull()) {
    		System.out.println("overflow");
    		return;
    	}
    	if(front==-1) {
    		front=0;
    		rear=0;
    	}
    	else if(front==0) {
    		front=size-1;
    	}else {
    		front=front-1;
    		
    	}
    	arr[front]=x;
    }
    void insertRear(int x) {
    	if(isFull()) {
    		System.out.println("overflow");
    		return;
    	}
    	if(front==-1) {
    		front=0;
    		rear=0;
    	}
    	else if(rear==size-1) {
    		rear=0;
    	}else {
    		rear=rear+1;
    		
    	}
    	arr[rear]=x;
    }
    void deleteFront() {
    	if (isEmpty())
        {
            System.out.println("Queue Underflow\n");
            return ;
        }
  
        // Deque has only one element
        if (front == rear)
        {
            front = -1;
            rear = -1;
        }
        else
            // back to initial position
            if (front == size -1)
                front = 0;
  
            else 
                front = front+1;
    }
    void deleteRear() {
    	if(isEmpty()) {
    		System.out.print("empty");
    		return;
    	}
    	if (front == rear)
        {
            front = -1;
            rear = -1;
        }else if(rear==0) {
        	rear=size-1;
        }else {
        	rear=rear-1;
        }
    }
    int getFront()
    {
        // check whether Deque is empty or not
        if (isEmpty())
        {
            System.out.println(" Underflow");
            return -1 ;
        }
        return arr[front];
    }
  
    // function return rear element of Deque
    int getRear()
    {
        // check whether Deque is empty or not
        if(isEmpty() || rear < 0)
        {
            System.out.println(" Underflow\n");
            return -1 ;
        }
        return arr[rear];
    }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementQueueUsingCircularArray dq = new ImplementQueueUsingCircularArray(5);
        
        System.out.println("Insert element at rear end  : 5 ");
        dq.insertRear(5);
         
        System.out.println("insert element at rear end : 10 ");
        dq.insertRear(10);
         
        System.out.println("get rear element : "+ dq.getRear());
         
        dq.deleteRear();
        System.out.println("After delete rear element new rear become : " +
                               dq.getRear());
         
        System.out.println("inserting element at front end");
        dq.insertFront(15);
         
        System.out.println("get front element: " +dq.getFront());
         
        dq.deleteFront();
         
        System.out.println("After delete front element new front become : " +
                                   +  dq.getFront());

	}

}
