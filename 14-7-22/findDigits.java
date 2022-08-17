import java.util.*;
class findDigits{

public static void main(String args[])
{
	int num,digit=0,dummy; // initalize the variable
	Scanner ck=new Scanner(System.in); // create a scanner class
	System.out.println("Enter the variable:"); // to get the user input
	num=ck.nextInt(); // to read the integer value
	dummy=num; // copy the number in dummy
	while(num!=0) // loop to find the number
	{
		num=num/10; // iterate the loop
		digit++; // store number of digits
	}
	System.out.println("The number of digits in " +dummy+ " is " +digit);
}
} 