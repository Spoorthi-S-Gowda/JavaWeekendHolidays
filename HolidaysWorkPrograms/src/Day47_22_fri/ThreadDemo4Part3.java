package Day47_22_fri;

import java.awt.*;
import java.awt.event.*;

public class ThreadDemo4Part3 extends Frame
{
	Thread th1,th2;
	TextField t1,t2;
	int i,j;
	public ThreadDemo4Part3()
	{
		setLayout(new FlowLayout());
		add(t1=new TextField(15));
		add(t2=new TextField(15));
		th1=new Thread(()->
		{
			while(true)
			{
				t1.setText(String.valueOf(i));
				if(i==20)
					i=0;
				else
					i++;
				try
				{
					Thread.sleep(40);
				}
				catch(Exception e)
				{	
				}
			}
		});
		th1.start();
		th2=new Thread(()->
		{
			while(true)
			{
				t2.setText(String.valueOf(j));
				if(j==20)
					j=0;
				else
					j++;
				try
				{
					Thread.sleep(40);
				}
				catch(Exception e)
				{
				}
			}
		});
		th2.start();
		addWindowListener(new WindowAdapter()
				{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(300,300);
		setVisible(true);
}
public static void main(String[] args) 
{
	new ThreadDemo4Part3();

}

}

