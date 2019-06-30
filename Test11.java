class A
{
A()
{
System.out.println("A-con");
}
{//instance block it will be executed before constructor.
System.out.println("Instance block");
}
int a=m1();//instance variable it will be executed first before constructor.
int m1()
{
System.out.println("m1-A");
return 10;
}
}
class Test11
{
public static void main(String args[])
{
A a=new A();
}
}