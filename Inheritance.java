class A
{
int i,j;
A()
{
B b=new B(this);
}
void print()
{
System.out.println("i="+i+"j="+j);
}
}
class B extends A
{
int i=34;
B(A ob2)
{
super.i=this.i;
System.out.println(ob2.i);
}
}
class Inheritance
{
public static void main(String j[])
{
A a=new A();
//a.i=10;
//a.j=20;
///a.print();
//B b=new B();
//b.i=5;
//b.j=15;
//b.print();
a.print();
//b=a;
//a=b;
//b.i=98;
//b.print();
}
}