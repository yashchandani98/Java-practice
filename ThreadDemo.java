import yash.Console;
class NewThread extends Thread
{
Thread t;
NewThread()
{
Thread t=new Thread(this,"Demo thread");
System.out.println("child thread"+t);
t.start();
}
public void run()
{
try{
for(int i=6;i>0;i--)
{
System.out.println("child thread"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("child interrupted");
}
System.out.println("Exiting child thread");
}
}
class ThreadDemo
{
public static void main(String args[])
{
NewThread t=new NewThread();
try{
for(int i=5;i>0;i--)
{
System.out.println("Main thread"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("Main thread interrupted");
}
/*this method is user defined method*/Console.disp("Main thread exiting");
}
}