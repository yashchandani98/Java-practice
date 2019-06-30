import java.applet.*;
import java.awt.*;
class MyFirstApplet extends Applet
{
public static void main(String args[])
{
String str;
public void init()
{
str="Hello world";
}
public void paint()
{
Graphics g;
g.drawString(str,10,100);
}

}
}