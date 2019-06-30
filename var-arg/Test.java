class A{
int add(int...a)//var-arg method int...a,float...b not allowed float b,int...a allowed
{
int y=0;
for(int x:a)//for-each loop
{
y=y+x;
}
return y;
}
}
class Test
{
public static void main(String args[])
{
A a=new A();
System.out.println(a.add(20,30,40,30));
}
}