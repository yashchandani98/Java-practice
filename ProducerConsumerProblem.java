class A
{
int count=0;
boolean flag=true;
public synchronized void  produce()
{
	try{
	while(true)
	{
	if(flag==true)
	{
	  flag=false;
	  count++;
	  System.out.println("Produce:"+count);
	  notify();
	  wait();
	}
	else
	{
	wait();
	}
	}
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
}
public synchronized void  consume()
{
	try{
	while(true)
	{
	if(flag==true)
	{
	wait();
	}
	else
	{
	flag=true;
	System.out.println("Consume:"+count);
	wait();
	notify();
	}
	}
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
}
}
class Producer extends Thread
{
A a;
Producer(A a)
{
this.a=a;
}
public void run()
{
a.produce();
}
}
class Consumer extends Thread
{
A a;
Consumer(A a)
{
this.a=a;
}
public void run()
{
a.consume();
}
}
class ProducerConsumerProblem
{
	public static void main(String args[])
	{
	A a=new A();
	Producer p=new Producer(a);
	Consumer c=new Consumer(a);
	p.setName("Producer Thread");
	c.setName("Consumer Thread");
	p.start();
	c.start();
	}
}