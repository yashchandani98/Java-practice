class Clicker implements Runnable//error comes in extend
{
int click=0;
Thread t;
private volatile boolean running=true;
public Clicker(int p)
{
t=new Thread(this);
t.setPriority(p);
}
public void run()//run is calling fom where
{
while(running)
{
click++;
System.out.println("click="+click);//it is not going infinite loop.
}
}
public void stop()
{
running=false;
}
public void start()
{
t.start();
}
}
class Thread1
{
public static void main(String args[])
{
Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
Clicker hi=new Clicker(Thread.NORM_PRIORITY+2);
Clicker lo=new Clicker(Thread.NORM_PRIORITY-2);
lo.start();
hi.start();
try{
Thread.sleep(500);
}
catch(InterruptedException e)
{
System.out.println("Main thread interrupted");
}
lo.stop();
hi.stop();
/*try
{
hi.t.join();
lo.t.join();
}
catch(InterruptedException e)
{
System.out.println("Interrupted exception caught");
}*/
System.out.println("Low priority thread:"+lo.click);
System.out.println("High priority thread:"+hi.click);
}
}