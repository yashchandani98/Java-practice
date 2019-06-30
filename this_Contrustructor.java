class A
{
A()
{
System.out.printl("A-con");
}
A(int i)
{
System.out.println("A-con"+i);
}
A(float j)
{
System.out.println("A-con"+j);
}
}
class this_Constructor
{
public static void main(String args[])
{
A a=new A();
}
}