import java.util.Scanner;
class LoginPassword
{

public static void main(String args[])
{
	String username; // string input
	int password;	// integer password
	Scanner ck=new Scanner(System.in); // create a scanner object to get the input
	System.out.print("Enter username:"); // to get the user name
	username=ck.nextLine(); 
	System.out.print("Enter password:"); // to get the password
	password=ck.nextInt();
	System.out.println(password);
	{
		if(password==12345) // condition for checking the correct password
		{	
		System.out.println(username+ "Login succesful:" ); // print password successful
		}
		else
		{
		System.out.println(username+ "Login denied:"); // print password denied
		}
	}	
}
} 