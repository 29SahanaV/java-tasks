class ReverseArray{

public static void main(String args[])
{
	int a[]={1,2,3,4,5}; //initialize the array elements
	int len=a.length; // initialize the length of array
	for(int i=a.length-1;i>=0;i--) // loop for array values
	{
		System.out.println(a[i]); //print array elements
	}
}
} 