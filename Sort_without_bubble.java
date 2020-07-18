import java.util.Arrays;
import java.util.Scanner;

public class Sort_without_bubble {
public static void main(String args[])
{
	Scanner obj = new Scanner(System.in);
	int i,j,a[],n;
	n = obj.nextInt();
	a = new int[n];
	for(i=0;i<n;i++)
	{
		a[i] = obj.nextInt();
	}
	Arrays.parallelSort(a);
	for(i=0;i<n;i++)
	{
	     System.out.print(a[i]+" ");
	}
}
	
}
