class member{

String name;
int id;
int salary;

public void printDetails()
{
	System.out.println(name+ " is credited rs "+salary );

}
}

class banker extends member
{
String accountNumber;
String bankName;
}

class customer extends member
{
String city;
}

class company

{
public static void main(String args[])
{
	banker bk=new banker();
	bk.accountNumber="1234567";
	bk.bankName="canara";
	bk.name="chaithra";
	bk.id=120;
	bk.salary=12000;
	bk.printDetails();
	customer ck=new customer();
	ck.city="Bangalore";
	ck.name="Bhavana";
	ck.id=120;
	ck.salary=12000;
	ck.printDetails();
}

}