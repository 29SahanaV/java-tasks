import java.util.Scanner;
class DisplayEvenNumbers
{

public static void main (String args[])
{
int i;
Scanner ck= new Scanner(System.in);
System.out.println("Enter the limit" );
int limit=ck.nextInt();

	for(i=1;i<=limit;i++)

{
	if(i%2==0)
{
System.out.println(i);

}
}
}
}
