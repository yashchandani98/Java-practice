interface A1
{
int a=1;
}
interface A2
{
int b=20;
}
interface A extends A1,A2//multiple inheritance is possible in interface
{
void m1();
void m2();
}
class B  implements A 
{
	int y;
public void m1()
{
System.out.println("m1-a");
}
public void m2()
{
System.out.println("m2-a");
}
public void m3()
{
System.out.println("m3-b");
}
}
class Hell{
public static void main(String args[])
{
//int c;
//System.out.println(c);
A a=new B();
a.m1();
a.m2();
//System.out.println(a.a);
//a.m3();
B b=new B();
b.m1();
System.out.println(b.y);
b.m2();
b.m3();
}
}
