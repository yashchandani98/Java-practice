import java.util.Scanner;
class A
{
public int removeChar(String str)
{
Scanner sc=new Scanner(System.in);
String hell="";
System.out.println("Enter a character you want to count number of occurence:");
char a=sc.next().toLowerCase().charAt(0);
int length=str.length();
int j=0;
for(int i=0;i<length;i++)
{
if(a==str.charAt(i))
{
//char b=str.charAt(i);
j++;
//str.charAt(i)='*';
}
hell=hell+str.charAt(i);
}
return j;
}
}
class Occurence
{
public static void main(String args[])
{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter a string");
String str=sc1.nextLine().toLowerCase();
A a=new A();
System.out.println("Number of occurence:"+a.removeChar(str));
}
}