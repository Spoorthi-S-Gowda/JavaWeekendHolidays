package Day56_01_sun_May;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletExample1 extends Applet implements ActionListener, ItemListener
{
Label label1, label2, label3; 
TextField tf1, tf2, tf3;
Checkbox ck1, ck2;
CheckboxGroup cb;

public void init()
{
System.out.println("Initializing an applet");

label1 = new Label("Enter your name");
tf1= new TextField(10);

label2 = new Label("Enter your city");
tf2= new TextField(10);

label3 = new Label("Gender");

cb= new CheckboxGroup();
ck1 = new Checkbox("Male",cb,false);
ck2 = new Checkbox("Female",cb,false);

add(label1);			//adding first label to the applet window.
add(tf1);			//adding first textfield to the applet window.

add(label2);			//adding second label to the applet window.
add(tf2);			//adding second textfield to the applet window.

add(label3);			//adding third label to the applet window.
add(ck1);			//adding the first checkbox to the applet window
add(ck2);			//adding the second checkbox to applet window

tf1.addActionListener(this); 	//AppletExample1 class registering to listen to textfield events
tf2.addActionListener(this); 	//AppletExample1 class registering to listen to textfield events
ck1.addItemListener(this);	//AppletExample1 class registering to listen to checkbox events
ck2.addItemListener(this);	//AppletExample1 class registering to listen to checkbox events
}


public void actionPerformed(ActionEvent ae) //listening to textfields events when enter is pressed in a textField
{
repaint();	//repaint() calls paint() method when a button click event is generated.
}

public void itemStateChanged(ItemEvent ie) //Listening to checkboxes when a checkbox is selected
{
repaint();	//repaint() calls paint() method when a checkbox is checked or unchecked.
}


public void paint(Graphics g)
{
g.drawString("Your name is "+ tf1.getText(),  10, 150 );
g.drawString("Your city is "+ tf2.getText(), 10,170 );
if(cb.getSelectedCheckbox()!=null)
{
g.drawString("Your gender is "+ cb.getSelectedCheckbox().getLabel(), 10,190);
}
}
}
