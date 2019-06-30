class A
{
int a;
int b;
}
class B
{
int a;
int b;
}
class Test6{
public static void main(String args[])
{
A a=new A();
B b=new B();
System.out.println(a);
System.out.println(a.hashCode());//hash code
System.out.println(b);
System.out.println(b.hashCode());
}
}