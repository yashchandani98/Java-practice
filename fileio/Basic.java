import java.io.*;
class Basic
{
public static void main(String args[]) throws IOException
{
FileInputStream fin=new FileInputStream("abc.txt");
FileOutputStream fout=new FileOutputStream("output.txt");
int length=fin.available();
//System.out.println(length);
//byte b[]=fin.getBytes();
//fout.write(b);
int c;
int count=0;
   while ((c = fin.read()) != -1) {
   if(c=='\n')
	count++;
   
}
if(count==0)
System.out.println("Number of lines:"+count);
else
	System.out.println("Number of lines:"+ ++count);
}
}