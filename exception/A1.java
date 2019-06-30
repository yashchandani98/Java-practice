class A1
{
public static void main(String args[])
{
try{
String str=null;
int length=str.length();
int a=3/0;
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(Exception e)
	{
		System.out.println("Error:"+e);
    }
	System.out.println("Main program");
}
}