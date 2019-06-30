abstract class A
{
abstract void m1();
}
abstract class B
{
abstract void m2();
}
abstract class C extends A
{
abstract void m3();
}
class D extends C
{
public void m1()
{

}
public void m2()
{

}
public void m3()
{

}
}
class Hell2{
public static void main(String args[])
{
D d=new D();
//Hell2 h2=new Hell2();
//h2.main('Hell2');
}
}