import java.util.Scanner;
class A
{
public String removeChar(String str)
{
Scanner sc=new Scanner(System.in);
String hell="";
System.out.println("Enter a character you want to remove:");
char a=sc.next().charAt(0);
int length=str.length();
for(int i=0;i<length;i++)
{
if(a==str.charAt(i))
{
//char b=str.charAt(i);
str.charAt(i)=" ";
//str.charAt(i)='*';
}
//hell=hell+str.charAt(i);
}
return str;
}
}
class Remove
{
public static void main(String args[])
{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter a string");
String str=sc1.nextLine();
A a=new A();
System.out.println(a.removeChar(str));
}
}