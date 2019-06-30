class A
{
int a;
int b;
public A get(int a,int b)
{
this.a=a;
this.b=b;
return this;
}
}
class This_object
{
public static void main(String args[])
{
A a=new A();
System.out.println(a.get(10,20));
}
}