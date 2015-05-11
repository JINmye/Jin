import javax.swing.JLabel;


public class Timer_RL extends Thread
{
	JLabel Ch=Frame.Character;
	synchronized public void run()
	{
		while(true)
		{
			try
			{	
				if(Move.Right==true)
				{
					if(Ch.getX()<Frame.Size-(Frame.Character.getWidth()) )
					{
						Ch.setLocation(Ch.getX()+2,Ch.getY());
					}
					else
						Ch.setLocation(Ch.getX()-2,Ch.getY());
				}				
				
				if(Move.Left==true)
				{
					if(0<Ch.getX())
					{
						Ch.setLocation(Ch.getX()-2,Ch.getY());					
					}
					else
						Ch.setLocation(Ch.getX()+2,Ch.getY());
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
