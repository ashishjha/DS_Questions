
public class Binary_search 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt(),array[]=new int[5];
		
		System.out.println("Enter the array: ");
		
		for(int i=0;i<size;i++) array[i]=sc.nextInt();
		
		System.out.println("Enter the number to be searched: ");
		
		int target=sc.nextInt(),first=0,middle,last=size;
		
		middle=(first+last)/2;
		
		while(first<=last) 
		{
		    if(first<=target) first = middle + 1;  
		    else if(first==target) break;
            else last = middle - 1;
            middle=(first+last)/2;
		}
      System.out.println("The number "+target+" is found at "+middle);
	}

}
