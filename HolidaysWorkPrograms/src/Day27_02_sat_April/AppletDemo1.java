package Day27_02_sat_April;

import java.applet.Applet;
import java.awt.*;

public class AppletDemo1 extends Applet
{
	TextField t1,t2,t3;
	Label l;
	Button b1,b2;
	public void init()
	{
		add(t1=new TextField(5));
		add(l=new Label("+"));
		add(t2=new TextField(5));
		add(b1=new Button("="));
		add(t3=new TextField(5));
		add(b2=new Button("Clear"));
	}
	public boolean action(Event e,Object o)
	{
		if(e.target.equals(b2))
			t1.setText("");
		if(e.target.equals(b2))
			t2.setText("");
		if(e.target.equals(b2))
			t3.setText("");
			{
				String s1=t1.getText();
				int i=Integer.parseInt(s1);
				String s2=t2.getText();
				int j=Integer.parseInt(s2);
				int k=i+j;
				String s3=String.valueOf(k);
				t3.setText(s3);				
			}
				return true;
	}

}


