/*
write a program for sum of elements in an array
*/

import java.util.*;
class SumOfArray
{

public static void main(String args[])
{
	Scanner ck=new Scanner(System.in);  // create a scanner object for user input
	System.out.println("Enter the length of an array");   // to get length of an array
	int len=ck.nextInt();  // to read length of array
	System.out.println("Enter the "+len+" elements");   //to get elements of an array
	int arr[]=new int[len];

	for(int i=0;i<len;i++) // loopr for elements of array
	{
	arr[i]=ck.nextInt(); // to read array elements
	}

	int sum=0; // initializing the sum
	for(int j=0;j<len;j++)
	{	
		sum=sum+arr[j]; // summing elements
	}
	System.out.println("Sum of all the elements of an array is " +sum);
}
}

