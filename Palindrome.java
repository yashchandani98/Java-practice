import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1,s2;
int a,b;
int no_found=0;
int found=0;
//s1=new String("yash");
//s2=new String("abcd");
System.out.println("Enter 1st word:");
s1=sc.nextLine();
System.out.println("Enter 2nd word:");
s2=sc.nextLine();
a=s1.length();
b=s2.length();
if(a==b)
{
char p[]=new char[a];
char q[]=new char[b];
for(int i=0;i<a;i++)
{
//p[i]=s1.charAt(i);
for(int j=b-1;j>=0;j--)
{
//q[j]=s2.charAt(j);
if(s1.charAt(i)==s2.charAt(j))
{
found=1;
no_found=0;
}
else
{
found=0;
no_found=1;
}
}
}
if(found==1)
{
System.out.println("Strings are Palindrome");
}
else
{
System.out.println("Strings are not palindrome.");
}
}
else{
System.out.println("Strings are not palindrome.");
}
}
}