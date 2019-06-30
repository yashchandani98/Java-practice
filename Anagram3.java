import java.util.Scanner;
class Anagram3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int found=0,not_found=0;
System.out.println("Enter 1st string:");
String s1=sc.nextLine();
System.out.println("Enter 2nd string:");
String s2=sc.nextLine();
int len1=s1.length();
int len2=s2.length();
if(len1==len2)
{
for(int i=0;i<len1;i++)
{
for(int j=0;j<len1;j++)
{
if(s1.charAt(i)==s2.charAt(j))
{
found=1;
break;
}
}
if(found==0)
{
not_found=1;
break;
}
}
if(not_found==1)
{
System.out.println("Not anagram");
}
else
{
System.out.println("Anagram");
}
}
else
{
System.out.println("Number of words mismatches");
}
}
}
