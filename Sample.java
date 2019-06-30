class A
{
	
}
class B
{
	int i;
}
class  Sample
{
public static void main(String args[])
{
A a=new A();
System.out.println(new A()/*a*/);//Heap memory.
System.out.println(new B());
}
}