class A
{
private String uname;
private String upwd;
public void set(String uname,String upwd)
{
this.uname=uname;
this.upwd=upwd;
}
public String getName()
{
return uname;
}
public String getPwd()
{  
return upwd;
}
/*public A get()
{
return A;
}*/
}
class JavaBean
{
public static void main(String args[])
{
A a=new A();
a.set("Yash","110198");
System.out.println(a.getName());
System.out.println(a.getPwd());
//System.out.println(a.get());
}
}