import java.util.*;
class secondBiggestNumber
{

public static void main(String args[])
{
	Scanner ck=new Scanner(System.in);
	System.out.println("Enter the length of an array");
	int len=ck.nextInt();
	int arr[]=new int[len]; int temp=0; 
	System.out.println("Enter the array elements:");

	for(int i=0;i<len;i++)
	arr[i]=ck.nextInt();
	for (int i=0;i<len;i++)
	{
		for(int j=i+1;j<len;j++)
		{
			if(arr[i]>arr[j])
			{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
	System.out.println("Increasing Sorted Array is ");

	for(int n:arr)
	{
		System.out.print(n+ " " );
	}
	{
	System.out.println("Second Biggest number is:: "+arr[len-2]);
	}
}
} 