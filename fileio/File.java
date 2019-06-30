import java.io.*;
class File
{
public static void main(String args[])throws IOException
{
FileReader r=new FileReader("sakshi.txt");
int i;
String s1="";
while((i=r.read())!=-1)
{
char s=(char)i;
s1=s1+s;
}
System.out.println(s1);
}
}