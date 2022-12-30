package queuedatastructures;

public class PriorityQLL {
    static class node{
    	int data;
    	int p;
    	node next;
    	node(int data,int p){
    		this.data=data;
    		this.p=p;
    		this.next=null;
    	}
    }
    static node push(node m,int data,int p) {
    	node lk=new node(data,p);
    	node start=m;
    	if(m.p>p) {
    		lk.next=m;
    		m=lk;
    	}else {
    		while(m.next!=null && m.next.p<p) {
    			start=start.next;
    		}
    		lk.next=start.next;
    		start.next=lk;
    	}
    	return m;
    }
    static node pop(node head) {
    	node temp=head;
    	head=head.next;
    	return head;
    }
    static int peek(node head) {
    	return head.data;
    }
    static int isEmpty(node head) {
    	return (head==null)?1:0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         node lk=new node(5,2);
         node pq=push(lk,4,3);
         pq=push(pq,3,0);
         while(isEmpty(pq)==0) {
        	 System.out.println(peek(pq));
        	 pq=pop(pq);
         }
	}

}
