import java.util.*;
class factorialNumbers{

public static void main(String args[])
{
	int fact=1,num,i; //initializing the variables
	Scanner ck=new Scanner(System.in); // create a scanner class
	System.out.println("Enter the number to print its factorial:"); // to get the number from user
	num=ck.nextInt(); // to read integer value

	for(i=1;i<=num;i++) // loop for values
	{	
		fact=fact*i;
	}	
	System.out.println("Factorial of" +num+ "is:" +fact); // print the factorial of number
}
} 