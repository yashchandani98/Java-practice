class MyThread extends Thread
{
public void run()
{
try{
for(int i=0;i<10;i++)
{
System.out.println("CSVTU");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class Test67
{
public static void main(String args[])
{
MyThread ob=new MyThread();
ob.start();
}
}