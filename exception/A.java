import java.util.*;
class A
{
public static void main(String args[])
{
try{
int a=10;
int b=0;
int c;
//c=a/b;
int ch[]=new int[3];
//DataInputStream ob=new DataInputStream(System.in);
Scanner sc=new Scanner(System.in);
int d;
for(int i=0;i<10;i++)
{
System.out.println("Enter values ch["+i+"]=");
d=sc.nextInt();
ch[i]=d;
}
System.out.println("inside try block");
}
catch(Exception e)
{
System.out.println("Inside catch block"+e);
}
System.out.println("Outside try block");
}
}