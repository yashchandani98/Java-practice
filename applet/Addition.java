import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<APPLET CODE="Addition.class" width="700" height="700"></APPLET>
*/
public class Addition extends Applet implements ActionListener
{
TextField txt1,txt2,txt3;
Label lb1,lb2,lb3;
public void init()
{
setLayout(null);
//setVisible(true);
lb1=new Label("Enter A:");
lb1.setBounds(20,20,100,20);
//setSize(700,700);
add(lb1);
txt1=new TextField("0",5);
txt1.setBounds(100,20,100,20);
add(txt1);
lb2=new Label("Enter B:");
lb2.setBounds(20,50,100,20);
add(lb2);
txt2=new TextField("0",5);
txt1.setBounds(150,50,100,20);
add(txt2);
lb3=new Label("Addition:");
lb3.setBounds(20,80,130,20);
add(lb3);
txt3=new TextField("0",5);
txt3.setBounds(150,80,100,20);
add(txt3);
Button button=new Button("Calculate");
button.setBounds(150,110,100,20);
add(button);
button.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
int num1=Integer.parseInt(txt1.getText());
int num2=Integer.parseInt(txt2.getText());
int sum=num1+num2;
lb3.setText(Integer.toString(sum));
}
//public void paint(Graphics g)
//{
//g.drawString("Yash chandani",10,20);
//}
}