import java.util.*;
import java.io.*;
class A
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st word:");
String str1=sc.next();/*new String("reactive")*/
System.out.println("Enter 2nd word:");
String str2=sc.next();/*new String("creative")*/;
int s1=str1.length();
int s2=str2.length();
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
if(a[i]==b[j])
{
z++;
}
}
}
if(z==s1)
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
}
//str1=sc.nextString();
