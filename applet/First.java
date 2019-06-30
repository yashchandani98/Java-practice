import java.awt.*;

class First{//extends Frame

First(){
	Frame f=new Frame();
Button b=new Button("click me");
b.setBounds(30,100,80,30);// setting button position

f.add(b);//adding button into frame
f.setSize(600,600);//frame size 300 width and 300 height
f.setLayout(null);//no layout now bydefault BorderLayout
f.setVisible(true);//now frame willbe visible, bydefault not visible

}
public static void main(String args[]){

First f=new First();

}
}