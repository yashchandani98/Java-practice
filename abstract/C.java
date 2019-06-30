abstract class A
{
abstract void fun1();
}
class B extends A
{
void fun1(){
System.out.println("Function1 body");
}
}
class C
{
public static void main(String args[])
{
B ob1=new B();
ob1.fun1();
}
}