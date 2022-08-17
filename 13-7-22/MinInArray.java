/*
write a java program minimum value in array
*/

import java.util.*;
class MinInArray
{

public static void main(String args[])
{
	Scanner ck=new Scanner(System.in); // create a scanner object for user input
	System.out.println("Enter the length of an array"); // to get length of array elements
	int len=ck.nextInt(); // to read length of array elements
	int arr[]=new int[len]; // initializing the length of array
	System.out.println("Enter the "+len+" elements"); // to get elements of an array

	for(int i=0;i<len;i++) //loop for the elements in array
	{
	arr[i]=ck.nextInt(); // to read the array elements
	}

	int min=arr[4]; // just assuming 4th elements is a minimum value
	for(int j=0;j<len;j++)
	{
		if(arr[j]<min) // comparing the values
		{	
		min=arr[j]; // swapping
		}
	}
	System.out.println("The minimum value of array is "+min);
}
} 