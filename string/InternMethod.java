class InternMethod{
public static void main(String args[])
{
String s1=new String("yash");
String s2=new String("yash");
String str=s2;
String s3=s2.intern();
System.out.println(str==s3);
}
}