import java.util.*;
class LoginPwd
{
public static void main(String args[])
{
	String username; // string input
	String password;	// integer password
	Scanner ck=new Scanner(System.in); // create a scanner object to get the input
	System.out.print("Enter username:"); // to get the user name
	username=ck.nextLine(); 
	System.out.print("Enter password:"); // to get the password
	password=ck.nextLine();
	System.out.println(password);
	String pwd=username.substring(0,4);
	pwd=pwd+"2008";

	{
		if(pwd.equals(password)) // condition for checking the user pwd and entered password
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