import java.util.Scanner;
class MyException2 extends Exception
{
MyException2(String s)
{
super(s);
}
}
class UserDefinedException2
{
public static void msg(String s1) throws MyException2
{
int length=s1.length();
if(length>10)
throw new MyException2("Large string");
else
System.out.println("Your name:"+s1);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any small name:");
String s=sc.nextLine();
try{
msg(s);
}
catch(Exception e)
{
System.out.println("Exception:"+e);
}
}
}