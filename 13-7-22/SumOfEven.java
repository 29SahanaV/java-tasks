import java.util.Scanner;
class SumOfEven
{

public static void main(String args[])
{
	int num,i,sum=0; // initializing the variables
	Scanner ck=new Scanner(System.in); // create a scanner class
	System.out.println("Enter a Number:"); // to get user number
	num=ck.nextInt(); // to read integer value

	for(i=1;i<=num;i++) // loop for values
	{
		if(i%2==0) // condition for even number
		{	
			sum+=i; // to store the sum of even numbers
		}
	}
	System.out.println("The sum of even numbers" +num+ "=" +sum); // print the sum
} 
} 