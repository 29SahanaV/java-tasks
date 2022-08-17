/* 
read three values from the user for operation
first and second values as operands
third value as operator
if user press1 => print addition of first and second
if user press2 => print subtraction of first and second
if user press3 => print multiplication of first and second
if user press4 => print division of first and second
*/
import java.util.Scanner;
class calc{

public static void main(String args[])
{
	int num1,num2,oper;
	Scanner ck=new Scanner(System.in);//object scanner
	calc obj=new calc();//object for calc class

	System.out.print("Enter the first Number");
	num1=ck.nextInt();
	System.out.print("Enter the second Number");
	num2=ck.nextInt();
	System.out.print("Press 1 for addition \n press 2 for subtraction \n press 3 for multiplication \n press 4 for division");
	oper=ck.nextInt();
	//based on Oper value calling different methods
	switch(oper)
	{
		case 1: 
		obj.addition(num1,num2);
		break;
		case 2:
		obj.subtraction(num1,num2);
		break;
		case 3:
		obj.multiplication(num1,num2);
		break;
		case 4:
		obj.division(num1,num2);
		break;
		default:
		System.out.println("Invalid statement");
	}
}
public void addition(int num1, int num2)
{
	System.out.println("Addition is "+(num1+num2));
}
public void subtraction(int num1,int num2)
{
	System.out.println("Subtraction is"+(num1-num2));
}
public void multiplication(int num1, int num2)
{
	System.out.println("Multiplication is"+(num1*num2));
}
public void division(int num1, int num2)
{
	System.out.println("Division is"+(num1/num2));
}
} 