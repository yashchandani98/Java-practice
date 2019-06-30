class Break
{
public static void main(String args[])
{
int n[]={10,20,30,40,50};
int a=5;
for(int x:n)
{
if(x==30)
break;
System.out.println(x);
}
System.out.println(a);
}
}