class A implements Runnable
{
public void run()
{
System.out.println("Hello");
}
synchronized public void hell()
{
System.out.println("Hello");
}
}
class RunnableTest
{
public static void main(String args[])
{
A a=new A();
Thread x=new Thread(a);
x.start();
a.hell();
System.out.println("End of main thread");
}
}
