class A{
int i=20;
int j=30;
void method(int i,int j)
{
System.out.println(i+" "+j);
System.out.println(this.i+" "+this.j);
}
}
class Test12
{
public static void main(String args[])
{
A a=new A();
a.method(1,2);
}
}