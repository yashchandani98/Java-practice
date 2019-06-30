import java.io.*;
class CopyContent
{
	public static void main(String args[]) throws IOException 
{
FileInputStream fin =null;
FileOutputStream fout=null;

try{
fin =new FileInputStream("abc.txt");
fout=new FileOutputStream("output2.txt");
int c;
while((c=fin.read())!=-1)
{
fout.write(c);
}
}
finally{
if(fin!=null)
fin.close();
if(fout!=null)
fout.close();
}
}
}