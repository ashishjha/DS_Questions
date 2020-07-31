class Main 
{ 
  
static class Node 
{ 
    int data; 
    Node next; 
}; 
  
static Node Empty(Node last, int data) 
{ 
    if (last != null) 
    return last; 
  
    Node temp = new Node(); 
  
    temp.data = data; 
    last = temp; 
  
    last.next = last; 
  
    return last; 
} 
  
static Node Begining(Node last, int data) 
{ 
    if (last == null) 
        return Empty(last, data); 
  
    Node temp = new Node(); 
  
    temp.data = data; 
    temp.next = last.next; 
    last.next = temp; 
  
    return last; 
} 
  
static Node End(Node last, int data) 
{ 
    if (last == null) 
        return Empty(last, data); 
      
    Node temp = new Node(); 
  
    temp.data = data; 
    temp.next = last.next; 
    last.next = temp; 
    last = temp; 
  
    return last; 
} 
  
  
static void traverse(Node last) 
{ 
    Node p; 
  
    if (last == null) 
    { 
        System.out.println("List is empty."); 
        return; 
    } 
  
    p = last.next; 
  
    do
    { 
        System.out.print(p.data + " "); 
        p = p.next; 
  
    } 
    while(p != last.next); 
  
} 
  
public static void main(String[] args) 
{ 
    Node last = null; 
  
    last = Empty(last, 6); 
    last = Begining(last, 4); 
    last = Begining(last, 2); 
    last = End(last, 8); 
    last = End(last, 12); 
  
    traverse(last); 
} 
} 
  
