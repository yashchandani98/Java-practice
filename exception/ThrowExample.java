import java.util.Scanner;
class ThrowExample
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number between 1 to 10:");
int a=sc.nextInt();
//try{
if(a==0||a>10)
{
throw new ArithmeticException("Invalid number"); 
}
//}
//catch(ArithmeticException e)
//{
//System.out.println("Exception:"+e);
//}
}
}