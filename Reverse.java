import java.util.Scanner;
class A
{
public String reverseStr(String str)
{
int length=str.length();
String reverse="";
for(int i=length-1;i>=0;i--)
{
reverse=reverse+str.charAt(i);
//System.out.println(a);
}
return reverse;
}
}
class Reverse
{
public static void main(String args[])
{
A a=new A();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a string");
String str3=sc.nextLine();
System.out.println(a.reverseStr(str3));
}
}