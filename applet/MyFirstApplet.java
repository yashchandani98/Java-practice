import java.awt.*;
import java.applet.*;
class MyFirstApplet extends Applet
{
/*public void init()
{
int a=5;
int b=6;
}*/
public void paint(Graphics g)
{
Font f=new Font("arial",Font.BOLD,30);
g.setFont(f);
g.drawString("Yash chandani",100,100);
}
}