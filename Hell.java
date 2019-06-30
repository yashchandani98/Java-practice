class A extends Thread
{
Thread t;
public void run()
{
System.out.println("A class");
}
public void start()
{
t.start();
}
}
class Hell 
{
public static void main(String args[])
{
A a=new A();
a.start();
}
}