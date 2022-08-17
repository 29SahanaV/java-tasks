class GreatestNumber
{
public static void main(String args[])
{
int a=21,b=14,c=8,large;
large=(a<b)?(a<c?a:c):(b>c?b:c);
System.out.println("Largest number among" +a+","+b+" and "+c+" is " +large);
}
} 