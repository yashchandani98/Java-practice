class A
{
A()
{
this.m();
this.m1();
}
void m()
{
this.m1();
/* we can call multiple method in one method by using this 
keyword in case of method calling. but in constructor we can call 
only one constructor.
*/
this.m2();
}
void m1()
{
System.out.println("A-m1 method");
}
void m2()
{
System.out.println("A-m2 method");
}
}
class This_method
{
public static void main(String args[])
{
A a=new A();
//this.main();
}
}