class A
{
A()
{
System.out.println("A-con");
}
A(int a)
{
System.out.println(a);
}
A(float a)
{
System.out.println(a);
}
}
class ConstructorOverLoading
{
public static void main(String arg[])
{
A a=new A();
A a1=new A(4);
A a2=new A(4.3f);
//a.A(4);
//for(int i=0;i<5;i++)");
// System.out.println(arg[i]);
}
}