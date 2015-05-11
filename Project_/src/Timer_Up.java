import javax.swing.JLabel;


public class Timer_Up extends Thread
{
	JLabel Ch=Frame.Character;
	int n=0;
	synchronized public void run()
	{
		while(true)
		{
			try
			{				
				Ch.setLocation(Ch.getX(),Ch.getY()-3);			
				n++;
				if(n>100)
				{
					System.out.println(n);
					n=0;
					Move.Up=false;
					return;
				}
				Thread.sleep(Main.Ch_Speed);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}
