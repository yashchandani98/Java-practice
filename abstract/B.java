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
B ob1=new B();
ob1.fun1();
}