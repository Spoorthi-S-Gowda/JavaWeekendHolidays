package Day46_21_thur;

import java.awt.*;
import java.awt.event.*;

public class ThreadDemo4Part1 extends Frame implements Runnable
{
	Thread th1;
	TextField t1,t2;
	int i,j;
	public ThreadDemo4Part1()
	{
		setLayout(new FlowLayout());
		add(t1=new TextField(15));
		add(t2=new TextField(15));
		th1=new Thread(this);
		th1.start();
		G g=new G();
		g.start();
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
	public void run()
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
	}
 class G extends Thread
	{
		public void run()
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
		}
	}
public static void main(String[] args) 
{	
	new ThreadDemo4Part1(); 

}
}
