import java.util.Scanner;
class StrongNumber
{

public static void main(String args[])
{
	int num,i,fact=1,sum=0,dummy,rem; // initialize the variable
	Scanner ck=new Scanner(System.in); // create a scanner class
	System.out.println("Enter the number:"); // to get the number from user to check whether it is strong number or not
	num=ck.nextInt(); // to read integer value
	dummy=num; //copy num to dummy

	while(num!=0) // loop to find the number of digits
	{
		rem=num%10;
		i=1;
		fact=1;
		while(i<=rem)
		{	
			fact=fact*i;
			i++; // to store the factorial numbers
		}
		sum=sum+fact;
		num=num/10;
	}
	if(sum==dummy) // checking for strong number
	{
		System.out.println(dummy+ " is a strong number ");
	}
	else
	{
		System.out.println(dummy+ " is not a strong number ");
	}

}
}
