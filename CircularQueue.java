import java.util.*;
public class CircularQueue
{
	public static void main(String args[])
	{
			Queue b = new Queue();
			b.enqueue(10);
			b.enqueue(20);
			b.enqueue(30);
			b.enqueue(40);
			b.enqueue(50);
		    b.dequeue();
		    b.dequeue();
		    b.enqueue(70);
		    b.enqueue(80);
		    b.display();
		    b.peak();
			
	}
}

class Queue
{
	int front = -1;
	int rear = -1;
	int size = 5;
	int q[] = new int[size];
	
	public void enqueue(int x)
	{
		if(front==-1 && rear==-1)
		{
			front = 0;
			rear = 0;
			q[rear] = x;
		}
		else if((rear+1)%size == front)
		{
			System.out.println("Queue is full");
		}
		else
		{
			rear = (rear+1)%size;
			q[rear] = x;
		}
	}
	
	public void dequeue()
	{
		if(front==-1 && rear==-1)
		{ 
			System.out.println("Queue is empty");
		}
		else if(front == rear)
		{
			System.out.println("Dequeue at "+front+" "+q[front]);
			front = -1;
			rear = -1;
		}
		else
		{
			System.out.println("Dequeue at "+front+" "+q[front]);
			front = (front+1)%size;
		}
	}
	
	public void display()
	{
		int i=front;
		while(i!=rear)
		{
			System.out.println(q[i]);
			i=(i+1)%size;
		}
		System.out.println(q[i]);
	}
	
	public void peak()
	{
		System.out.println("Peak "+q[front]);
	}
}
