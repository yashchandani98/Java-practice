abstract class A
{
abstract void hell();
abstract void hell2();
}
class B extends A
{
void hell()
{
System.out.println("Abstract hell");
}
/*void hell2()
{
System.out.println("Abstract hell2");
}*/
}
class C extends A
{
void hell2()
{
System.out.println("Abstract hell2");
}
}
class Abstract
{
public static void main(String args[])
{
B b=new B();
C c=new C();
b.hell();
c.hell2();
}
}