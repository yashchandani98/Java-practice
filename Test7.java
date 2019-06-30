class Test7
{
public static void main(String args[])
{
String s1=new String("Yash");//immutable object
String s2=s1.concat("Chandani");
System.out.println(s1);
System.out.println(s2);
StringBuffer sb1=new StringBuffer("Yash");//mutable object
StringBuffer sb2=sb1.append("Chandani");
System.out.println(sb1);
System.out.println(sb2);
}
}