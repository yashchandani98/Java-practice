import java.lang.*;
class Type
{
public static void main(String args[]){
//int a='\0';implicit type casting
//double i=a;
//----------------------------explicit type casting----------------------
int a=100;
byte b=(byte) a;//explicit
System.out.println(b);
double d=99.9;
int c=(int) d;
char e=(char) d;
float f=28.9f;
short g=(byte) f;
System.out.println(g);
System.out.println(e);
System.out.println(c);
short s=65;
//char h=(byte) s; error
//System.out.println(h);
double b1=10.9;
double b2=20.2;
double b3=(float)(b1+b2);
System.out.println(b3);
double c1=10.67;
byte c2=(byte)(int)(short)(long)(float) c1;
System.out.println(c2);
//System.out.println(Byte.MAX_VALUE);
int i=130;
byte l=(byte)i;
System.out.println(l);
}
}