abstract class A
{
A()
{
System.out.println("A-con");
}
}
class B extends A
{
B()
{
System.out.println("B-con");
}
}
class C extends A
{
C()
{
System.out.println("C-con");
}
void hell()
	{}
}
class Inheritance2
{
public static void main(String y[])
{
C c=new C();
//A a=new A();
B b=new B();
A r;
r=b;
//r=c;
//c.hell();
}
}