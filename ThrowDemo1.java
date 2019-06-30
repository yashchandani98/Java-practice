import java.io.*;
class ThrowDemo1
{
static void throwone()throws IllegalAccessException
{
System.out.println("Inside throw one ");
throw new IllegelAccessException("demo");
}
public static void main(String args[])
{
try{
throwone();
}
catch(IllegalAccessException e)
{
System.out.println("Exception:"+e);
}
}
}