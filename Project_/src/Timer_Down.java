import javax.swing.JLabel;


public class Timer_Down extends Thread
{
	JLabel Ch=Frame.Character;
	static int Down=0,Up2=0;
	synchronized public void run()
	{
		while(true)
		{
			try
			{
				if(Move.Up==false)
				{
					if(Ch.getY()<Frame.Size-(Frame.Character.getHeight()+Frame.Alpa))
					{
					//	System.out.println("작동 중 " +Frame.Size + "  " + Frame.Character.getHeight());
						Ch.setLocation(Ch.getX(),Ch.getY()+2+Down+Up2);
					}
					else
					{
						System.out.println("down정지");
						return;
					}
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
