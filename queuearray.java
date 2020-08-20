import java.util.*;
public class queuearray
{
	public static void main(String[] args) 
	{
		que b = new que();
		b.enqueue(10);
		b.enqueue(20);
		b.enqueue(30);
		b.enqueue(40);
		b.enqueue(50);
		b.display();
		b.dequeue();
		b.dequeue();
		b.display();
		b.peak();	
	}
}

class que
{
	int front = -1;
	int rear  = -1;
    int size = 5;
    
	int queue[] = new int[size];

	
	public void enqueue(int x)
	{
       if(rear == size-1)
       {
           System.out.println("Overflow");
       }
       else if(front==-1 && rear==-1 )
       {
           front=rear=0;
           queue[rear] = x;
       }
       else
       {
           rear++;
           queue[rear]=x;
       }
	}
	
	public void dequeue()
	{
	    if(front==-1 && rear==-1)
	    {
	        System.out.println("Underflow");
	    }
	    else if(front==rear)
	    {
	        front = -1;
	        rear = -1;
	    }
	    else
	    {
	        System.out.println("Dequeue at "+front+" "+ queue[front]);
	        front++;
	    }
	}
	
	public void display()
	{
	    int i;
	    if(front==-1 && rear==-1)
	    {
	        System.out.println("Queue is empty");
	    }
	    else
	    {
	        for(i=front;i<=rear;i++)
	        {
	            System.out.println(queue[i]);
	        }
	    }
	}
	
	public void peak()
	{
	    if(front==-1 && rear==-1)
	    {
	        System.out.println("Queue is empty");
	    }
	    else
	    {
	        System.out.println("Peak "+queue[front]);
	    }
	}
}
