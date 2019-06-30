abstract class A
{
abstract void add();
}
class B extends A
{
void add()
{
System.out.println("HEll");
}
}
class Hell{
public static void main(String args[])
{
//A a=null;
B a =new B();
a.add();
}
}