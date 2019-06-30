class CurrentThread {
public static void main(String args[]){
	new Thread1();
	new Thread2();
Thread t=Thread.currentThread();
System.out.println("Current thread"+t.getName());//getId() is also a  method
t.setName("Yash thread");
System.out.println("Current thread"+t.getName());//Thread.currentThread().getName()
System.out.println(Thread.currentThread().getName());
try{
for(int i=0;i<10;i++)
{
System.out.println(i);
Thread.sleep(3000);
}
}
catch(InterruptedException e)
{
System.out.println("Interrupt"+e);
}
}
}
class Thread1 implements Runnable
{
	Thread1()
	{
		Thread t;
	t=new Thread(this,"Yash2Thread");
	t.start();
	}
	public void run(){
		try{
		for(int i=0;i<10;i++){
	System.out.println("ThreadYash2"+i);
	Thread.sleep(3000);	
	}
		}
		catch(InterruptedException e)
		{
		System.out.println("Thread 1 Interrupt"+e);
		}
	}
} 
class Thread2 extends Thread
{
	Thread2()
	{
	//super("Yash3Thread");
	start();
	}
	public void run()
	{
	try{
		for(int i=0;i<10;i++){
	System.out.println("ThreadYash3"+i);
	Thread.sleep(300);	
	}
		}
		catch(InterruptedException e)
		{
		System.out.println("Thread 2 Interrupt"+e);
		}
	}
}