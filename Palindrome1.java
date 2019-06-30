import java.util.Scanner;
class Palindrome1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1;
System.out.println("Enter any string:");
s1=sc.next();
int l=s1.length();
char a[]=new char [l];
char b[]=new char [l];
int found=0;
for(int i=0;i<l;i++)
{a[i]=s1.charAt(i);
for(int j=l-1;j>=0;j--)
{
b[j]=s1.charAt(j);
if(a[i]==b[j])
{
found=1;
i++;
break;
}
else
{found=0;
break;
}
}
if(found==0)
break;
}
if(found==1)
System.out.println("Entered string is palindrome");
else
System.out.println("Not palindrome");
}
}