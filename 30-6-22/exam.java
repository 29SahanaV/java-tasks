class exam
{
static int abc=100;//static variable
int a=25;// Instance variable
public void prep()
{
System.out.println("the score is "+a);
}
public static void main(String args[])
{
int cha=50;//local variable
System.out.println("the value is "+cha);
exam n=new exam();
n.prep();
System.out.println("the value is "+abc);
}
} 