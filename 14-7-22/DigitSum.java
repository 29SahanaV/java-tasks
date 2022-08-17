import java.util.Scanner;
class DigitSum
{
	public static void main(String args[])
	{
		int num,digit,sum=0;
		Scanner ck=new Scanner(System.in); // create a scanner object to get user input
		System.out.print("Enter the number:"); // to get the number
		num=ck.nextInt(); // read the integer value

		while(num>0) // find the number of digits
		{	
			digit=num%10;
			sum=sum+digit;
			num=num/10; // to iterate the loop
		}
		System.out.println("Sum of digits:"+sum); // print the sum
	}
} 