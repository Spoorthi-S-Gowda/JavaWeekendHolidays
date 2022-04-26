package Day49_24_sun;

import java.applet.Applet;
import java.awt.*;

public class Thread2 extends Applet implements Runnable 
{

 Image img;
 Thread t;
 Graphics g,g1;
 public void init() 
 {
  img = createImage(400,400);
  g = getGraphics();
  g1 = img.getGraphics();
  t = new Thread(this);
  t.start();
 }
 
 public void run() 
 {
  Font f = new Font("Cambria",Font.BOLD,16);
  g1.setFont(f);
  for(int i=1;i<=190;i+=3)
   drawme("Welcome to Java",20,i);
 }
 
 void drawme(String s,int x,int y) 
 {
  g1.setColor(Color.black);
  g1.fillRect(0,0,400,400);
  g1.setColor(Color.white);
  g1.drawString(s,x,y);
  g.drawImage(img,0,0,this);
  try
  {
   Thread.sleep(50);
  }catch(Exception ee){ }
 }
}

