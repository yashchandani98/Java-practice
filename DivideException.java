class DivideException
{
static void divide()
{
int a=5;
int b=0;
try{
int c=a/b;
System.out.println(c);
}
catch (ArithmeticException d)
{
System.out.println(d);
}
System.out.println("Other than Exception");
}
public static void main(String args[])
{
divide();
}
}