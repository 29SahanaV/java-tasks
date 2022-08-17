import java.util.*;
import java.lang.*;
class ArmStrongNumber
{

public static void main(String args[])
{
	int num,digit=0,dummy1,dummy2,sum=0,rem; // initialize the variable
	Scanner ck=new Scanner(System.in); // create a scanner class for user input
	System.out.println("Enter a number "); // get a number from user to check whether it is armstrong or not
	num=ck.nextInt(); // to read the integer value
	dummy1=num; // copy num to dummy1
	dummy2=num; // copy num to dummy2

	while(num!=0) // create loop for find the number of digits
	{
		num=num/10; // to iterate the loop
		digit++; // to store the number of digits
	}
	// for finding armstrongNumber
	while(dummy1!=0)
	{
	rem=dummy1%10;
	sum+=Math.pow(rem,digit);
	dummy1=dummy1/10;
	}
	if(sum==dummy2) // checking for armstrongNumber
	{
		System.out.println(dummy2+ " is a armstrong number ");
	}
	else
	{
		System.out.println(dummy2+ " is not a armstrong number ");
	}
}
} 