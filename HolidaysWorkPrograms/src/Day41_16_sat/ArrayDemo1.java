package Day41_16_sat;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ArrayDemo1 extends Frame implements ActionListener
{
	Button[][] b;
	public ArrayDemo1()
	{
		setLayout(new GridLayout(3,3));
		b=new Button[3][3];
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				if(Math.random()<2)
					add(b[i][j]=new Button("X"));
				else
					add(b[i][j]=new Button("O"));
				b[i][j].addActionListener(this);
			}
		}
		addWindowListener(new WindowAdapter()
				{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new ArrayDemo1();

	}
	public void actionPerformed(ActionEvent arg0)
	{
		Object o=arg0.getSource();
		if(o instanceof Button)
		{
			//Button b=(Button)o;
			//String s=b.getLabel();
			String c=((Button)o).getLabel();
			if(c.equals("X"))
				((Button)o).setLabel("O");
			else
				((Button)o).setLabel("X");
					
		}
	}

}
