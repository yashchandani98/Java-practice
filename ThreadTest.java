class A extends Thread
{
int i=0;
public void run()
 {
 for(int i=0;i<5;i++)
 {
  System.out.println("Thread-A"+i);
  if(i==3)
  {
   try{
   sleep(+5000);
      }
	  catch(Exception e)
	  {
	  System.out.println(e);
	  }
  }
  System.out.println("Thread A is executing");
 }
 }
//System.out.println("Thread-A exiting");
}
class B extends Thread
{
int i=0;
public void run()
{
i++;
System.out.println("Thread-B"+i);
}
//System.out.println("Thread-B exiting");
}
class C extends Thread
{
int i=0;
public void run()
{
i++;
System.out.println("Thread-C"+i);
}
//System.out.println("Thread-C exiting");
}
class ThreadTest
{
public static void main(String args[])
{
Thread.currentThread().setPriority(-12);
A a=new A();
B b=new B();
C c=new C();
a.start();
b.start();
c.start();
System.out.println(a.i);
System.out.println(b.i); 
System.out.println(c.i);
System.out.println("Hello main thread is  executing.");
}
}