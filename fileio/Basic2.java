import java.io.*;
class Basic2
{
public static void main(String args[]) throws IOException
{

FileInputStream fin=new FileInputStream("H:\\Java Programs/A1.java"); 
int c;
while((c=fin.read())!=-1)
{
System.out.println((char)c);
}
}
}