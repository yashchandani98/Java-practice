interface A
{
public void display();
/*{
System.out.println("Interface-A");
}*/
}
interface B extends A
{
public void display2();
/*{
System.out.println("Interface-B");
}*/
}
interface C extends A,B
{
	public void display();
}