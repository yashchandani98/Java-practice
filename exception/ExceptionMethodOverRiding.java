class A
{
public void msg()
{
System.out.println("A-class");
}
}
class ExceptionMethodOverRiding extends A
{
public void msg() throws ArithmeticException,IOException
{
System.out.println("Main-class");
}
public static void main(String args[])
{
ExceptionMethodOverRiding ob=new ExceptionMethodOverRiding();
ob.msg();
}
}