class A
{
void m1()
{
//this(13); this will be first statement in constructor only
}
A()
{
this(10);
System.out.println("A-con");
}
A(int i)
{
this(12.5f);//if we cannot use f with it will treat as a double  
System.out.println("A-con"+i);
}
A(float j)
{
System.out.println("A-con"+j);
}
}
class This_constructor
{
public static void main(String args[])
{
A a=new A();
a.m1();
}
}