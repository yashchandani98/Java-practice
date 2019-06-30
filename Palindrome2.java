import java.util.Scanner;
class A
{
public void isPalindrome(String str)
{
int length=str.length();
char arr[]=new char[length];
String reverse="";
for(int i=length-1;i>=0;i--)
{
reverse=reverse+str.charAt(i);
}
int  count=0;
for(int i=0;i<length;i++)
{
if(str.charAt(i)==reverse.charAt(i))
{
count=1;
}
else
{
break;
}
}
if(count==1)
	System.out.println("Palindrome");
else
	{
System.out.println("Not");
}

}
}
class Palindrome2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
A a=new A();
System.out.println("Enter any string:");
String str=sc.nextLine();
a.isPalindrome(str);
}
}
