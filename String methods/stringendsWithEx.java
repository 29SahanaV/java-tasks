import java.util.*;

class stringendsWithEx
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String simple = "Hello people welcome to java sessions";
		System.out.println("The given string is :" +simple);
		System.out.println("Enter the string to search at the end of the string");
		
		String se = scan.next();
		
		boolean res	= simple.endsWith(se);
		System.out.println(res);		
		
	}

}