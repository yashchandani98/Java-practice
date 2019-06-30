class Test2 implements B
{
	void display()
	{
	System.out.println("Hello display()");
	}
	void display2()
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
}
}