import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
class MyLabel extends JLabel
{
	int barSize = 100;
	int maxBarSize;

	MyLabel(int maxBarSize)
	{
		this.barSize=maxBarSize;
		this.maxBarSize = maxBarSize;
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.RED);
		int width = (int) (((double)(this.getWidth()))/maxBarSize*barSize);
		g.fillRect(0,0,width,this.getHeight());
	}
/*
	synchronized void fill()
	{
		if(barSize == maxBarSize)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				return;
			}
		}
		barSize++;
		repaint();
		notify();
	}	
*/
	
	synchronized void consume()
	{
		if(barSize > Main.Life/(double)Main.MaxLife * 100)
		{
			barSize--;
			repaint();
			notify();
		}		
	}
	synchronized void consume2()
	{
		if(barSize > Main.Boss_Life/(double)Main.Boss_MaxLife * 200)
		{
			barSize--;
			repaint();
			notify();
		}		
	}
}

class ConsumerThread extends Thread
{
	MyLabel bar;
	ConsumerThread(MyLabel bar)
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
				bar.setLocation(Frame.Character.getX(),Frame.Character.getY()-Frame.Character.getHeight()/10);
				if(bar.barSize == 0)
				{
					Frame.Hp.setVisible(false);
					JOptionPane.showMessageDialog(Frame.P, "»ç ¸Á...","Game Over !",JOptionPane.ERROR_MESSAGE);
					System.exit(0);
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

class ConsumerThread3 extends Thread
{
	MyLabel bar;
	ConsumerThread3(MyLabel bar)
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
				bar.consume2();
				bar.setLocation(Frame.Boss.getX(),Frame.Boss.getY()-Frame.Boss.getHeight()/10);
				if(bar.barSize == 0)
				{
					Frame.Boss_Hp.setVisible(false);
					JOptionPane.showMessageDialog(Frame.P, "°× ³¡...","Game Clear !",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
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

public class HP 
{
	HP()
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
		ConsumerThread th = new ConsumerThread(Frame.Hp);
		th.start();
		
		ConsumerThread3 th2 = new ConsumerThread3(Frame.Boss_Hp);
		th2.start();
	}
}