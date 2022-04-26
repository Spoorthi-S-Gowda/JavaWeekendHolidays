package Day46_21_thur;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Day46_21_thur.ThreadDemo4Part1.G;

public class ThreadDemo4Part2 extends Frame{
	Thread th1,th2;
	TextField t1,t2;
	int i,j;
	public ThreadDemo4Part2() {
		setLayout(new FlowLayout());
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		th1 = new Thread(new Runnable() {
			public void run() {
				while(true) {
					
					t1.setText(String.valueOf(i));
					if(i==20)
						i=0;
					else 
					    i++;
				try {
					Thread.sleep(40);
				}
				catch(Exception e) {
				}
			}
			}
		});
		th1.start();
		th2 = new Thread(new Runnable() {
			public void run() {
				while(true) {
					
					t2.setText(String.valueOf(j));
					if(j==20)
						j=0;
					else 
					    j++;
				try {
					Thread.sleep(40);
				}
				catch(Exception e) {
				}
			}
			}
			
		});
		th2.start();
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e ) {
				System.exit(0);
			}
		});
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadDemo4Part2();
	}
}

