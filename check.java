class Test2 implements C
{
	public void display()
	{
	System.out.println("Hello display()");
	}
	public void display2()
	{
	System.out.println("Hello display2()");
	}
	
}
class check
{
public static void main(String args[])
{
//B b=new B();
Test2 ob=new Test2();
ob.display();
ob.display2();
//ob.display();
}
}