package queuedatastructures;

public class ImplementDequeueUsingDL {
    static class node{
    	int data;
    	node next;
    	node prev;
    	node (int data){
    		this.data=data;
    	}
    }
    node head=null;
    node tail=null;
    boolean isEmpty()
    {
        if (head == null)
            return true;
             
        return false;
    }
 
    void insertFront(int data) {
    	node temp=new node(data);
    	if(head==null) {
    		head=tail=temp;
    		temp.next=temp.prev=null;
    	}
    	else {
    		head.prev=temp;
    		temp.next=head;
    		temp.prev=null;
    		head=temp;
    	}
    }
    void inserRear(int data) {
    	node temp=new node(data);
    	if(head==null) {
    		head=tail=temp;
    		temp.next=temp.prev=null;
    	}
    	else {
    		tail.next=temp;
    		temp.next=null;
    		temp.prev=tail;
    		tail=temp;
    	}
    }
    void removeFirst() {
    	if(!isEmpty()) {
    		node temp=head;
    		head=head.next;
    		head.prev=null;
    		return;
    	}
    	System.out.println("dequeu is empty");
    }
    void removelast() {
    	if(!isEmpty()) {
    		node temp=tail;
    		tail=tail.prev;
    		tail.next=null;
    		return;
    	}
    	System.out.println("dequeu is empty");
    }
    void display()
    {
        if (!isEmpty())
        {
            node temp = head;
             
            while (temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
             System.out.println();
            return;
        }
        System.out.print("List is Empty");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementDequeueUsingDL lk=new ImplementDequeueUsingDL();
		lk.insertFront(10);
		lk.inserRear(30);
		lk.inserRear(20);
		lk.display();
		lk.removelast();
		lk.removeFirst();
		lk.display();
	}

}
