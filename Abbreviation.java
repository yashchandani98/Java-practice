import java.util.Scanner;
class Abbreviation
{
public static String cut(String str1)
{
int length=str1.length();
String str2=" ";
int count=0;
for(int i=0;i<length;i++)
{
if(i==0)
{
str2=str2+str1.charAt(i);
count=1;
}
if(str1.charAt(i)==' ')
{
if(count==2)
{i++;
str2=str2+str1.charAt(i);
count=3;
i++;
}
else{
	i++;
count=2;
str2=str2+str1.charAt(i);
}
}
if(count==3)
{
str2=str2+str1.charAt(i);
}
}
return str2;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter any String:");
String str=sc.nextLine();
System.out.println(cut(str));
}
}