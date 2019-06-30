import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<APPLET CODE="FirstFrameExample" width="300" height="300"></APPLET>
*/
class FirstFrame extends Frame{
FirstFrame()
{
//	MyWindowAdapter adp=new MyWindowAdapter(this);
Frame f=new Frame("Button example");
Button b=new Button("Yash chandani");
f.add(b);
f.setVisible(true);
f.setLayout(null);
f.setSize(300,300);
}
}
public class FirstFrameExample{
public static void main(String args[])
{
FirstFrame f=new FirstFrame();
}
}