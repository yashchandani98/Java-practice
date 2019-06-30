class A
{
A get()
{
A a=new A();
return a;
}
A get1()
{
return this;
}
}
class Y
{
public static void main(String args[])
{
A a=new A();
System.out.println(a.get());
System.out.println(a.get());
System.out.println(a.get());
System.out.println(a.get1());
System.out.println(a.get1());
}
}