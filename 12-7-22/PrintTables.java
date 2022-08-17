import java.util.Scanner;
class PrintTables
{
public static void main(String args[])
{
int i;
	Scanner ck=new Scanner(System.in);
	System.out.println("Enter a number to print tables");
	int num=ck.nextInt();
	for(i=1;i<=20;i++)
	{
		System.out.println(num+"X"+i+"="+(num*i));
	}
}
}