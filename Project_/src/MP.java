import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class MP 
{
	MP()
	{
	/*		c.addKeyListener(new KeyAdapter()  
			{
				public void keyPressed(KeyEvent e)
				{
					bar.fill();
				}
			}
			);
			c.requestFocus();
	*/	
			ConsumerThread2 th = new ConsumerThread2(Frame.Mp);
			th.start();	
	}
}

class MyLabel2 extends JLabel
{
	int barSize = 0;
	int maxBarSize;

	MyLabel2(int maxBarSize)
	{
		this.maxBarSize = maxBarSize;
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		int width = (int) (((double)(this.getWidth()))/maxBarSize*barSize);
		g.fillRect(0,0,width,this.getHeight());
	}
	
	synchronized void consume()
	{
		if(barSize < Main.Mp/(double)Main.MaxMp * 100)
		{
			barSize++;
			repaint();
			notify();
		}		
	}
}

class ConsumerThread2 extends Thread
{
	MyLabel2 bar;
	ConsumerThread2(MyLabel2 bar)
	{
		this.bar = bar;
	}
	public void run()
	{
		while(true)
			
		{
			try
			{
				sleep(10);
				bar.consume();
				bar.setLocation(Frame.Character.getX(),Frame.Character.getY()-Frame.Character.getHeight()/10 + 10);
				
				if(bar.barSize == 100)
				{
					Frame.Mp.setVisible(false);
					new Last_Quiz();
					return;
				}
				
			}
			catch(InterruptedException e)
			{
				return;
			}
		}
	}
}

