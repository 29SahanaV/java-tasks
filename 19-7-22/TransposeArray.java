import java.util.*;
class Transpose
{

public static void main(String args[])
{

	int i,j;
	Scanner ck=new Scanner(System.in);
	System.out.println(" Enter number of rows ");
	int rows=ck.nextInt();
	System.out.println(" Enter number of columns ");
	int cols=ck.nextInt();
	int a[][]=new int[rows][cols];
	System.out.println(" Enter the elements of an array ");

	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			a[i][j]=ck.nextInt();
		}
	}
	System.out.println(" normal matrix is ");
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
		{
			System.out.print(a[i][j]+"  ");
		}
	System.out.println(" ");
	}
	System.out.println(" Transpose matrix is ");
	for(i=0;i<cols;i++)
	{
		for(j=0;j<rows;j++)
		{
		System.out.print(a[j][i]+" ");
		}
	System.out.println(" ");
	}
}
} 