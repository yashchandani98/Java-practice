class Basic
{
public static void main(String args[])
{
try{
String str=null;
System.out.println(str.length());//null pointer exception
}
catch(Exception e)
{
System.out.println("Error:"+e);
}

try{
int a=12/0;
System.out.println(a);//Arithmetic (Divide/0)exception
}
catch(Exception e)
{
System.out.println("Error:"+e);
}
try{
String str="abc";
int i=Integer.parseInt(str);//Number format exception.
}
catch(Exception e)
{
System.out.println(e);
}
try{
int a[]=new int[5];
for(int i=0;i<6;i++)//Array bound exception.
{
a[i]='*';
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}