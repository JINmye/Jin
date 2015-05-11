import java.awt.event.KeyEvent;
import java.security.MessageDigest;

import javax.swing.JOptionPane;


public class Quiz_Time  extends Thread
{
	static int n;
	synchronized public void run()
	{
		n=31;
		while(true)
		{
			try
			{
				n--;
				Frame.Time.setText(n+"");
				if(n<1)
				{
					if(Quiz.Quiz_Start==true)
					{
						JOptionPane.showMessageDialog(Frame.P, "! _ !","Time Over!!",JOptionPane.WARNING_MESSAGE);
						Quiz.Quiz_Start=false;
						Main.Life=Main.Life-1;
					}
					//showConfirmDialog(null,"M","Confirmation","M".YES_NO_OPTION);//
					new Quiz_Time2().start();
					return ;
				}
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}

class Quiz_Time2  extends Thread
{
	int n = 0;
	synchronized public void run()
	{
		while(true)
		{
			try
			{
				System.out.println("dd123457383873     "+n);
				n++;
				if(n==2)
				{
					if(Quiz.Quiz_Start==false)
					{
					//showConfirmDialog(null,"M","Confirmation","M".YES_NO_OPTION);//
						Frame.Quiz.setVisible(false);
						Frame.Time.setVisible(false);
						
					}
					return ;
				}
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}
