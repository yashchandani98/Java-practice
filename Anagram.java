//package pa;
//package pa2;
import java.util.*;
import java.io.*;
//@Override//annotations
class Anagram
{
public static void main(String args[])
{
	int d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st word:");
//int f=sc.nextInt();
String str1=sc.next();/*new String("reactive")*/
System.out.println("Enter 2nd word:");
String str2=sc.next();/*new String("creative")*/;
int s1=str1.length();
int s2=str2.length();
int  found=0;
int not=0;
if(s1==s2)
{
char a[]=new char[s1];
char b[]=new char[s2];
int z=0;
for(int x=0;x<s1;x++)
{
a[x]=str1.charAt(x);
b[x]=str2.charAt(x);
}
for(int i=0;i<s1;i++)
{
for(int j=0;j<s2;j++)
{
if(str1.charAt(i)==str2.charAt(j))
{
if(str2.charAt(i)==str1.charAt(j))
found=1;
//
break;
}
else{
found=0;
//break;
}
}
}
if(found==1)
	{System.out.println("Anagram");}
else
	{
System.out.println("Not");
}
}
else{
System.out.println("Not anagram");
}
}
//System.out.println("Press 1 to continue:");
//char a;
//a=sc.nextChar();
}

//str1=sc.nextString();
