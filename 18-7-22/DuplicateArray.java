import java.util.*;
class DuplicateArray{

public static void main(String args[])
{
	int i,j;
	Scanner ck=new Scanner(System.in);
	System.out.println("Enter the length of an array :");
	int len=ck.nextInt();
	int arr[]=new int[len]; int count=0;
	System.out.println("Enter the array elements :");

	for(i=0;i<len;i++)
	arr[i]=ck.nextInt();
	for(i=0;i<len;i++)
	{
		for(j=i+1;j<len;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
			}
		}
	}
	System.out.println("Array is: ");
	for(int n:arr)
	System.out.print(n+" ");
	{
	System.out.println(" Number of duplicates in an above array is " +count);
	}
}
} 