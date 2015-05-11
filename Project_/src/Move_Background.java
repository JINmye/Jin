public class Move_Background extends Thread
{
	public static boolean Choice1=true, Choice2=false;
	int alpa = 190;
	synchronized public void run()
	{
		while(true)
		{
			try
			{
				if(Choice1 == true)
				{
					Frame.Back_1.setLocation(Frame.Back_1.getX()-1,Frame.Back_1.getY());
					
					if(Frame.Back_1.getX()<-alpa)
					{
						Choice2=true;
					}
					if(Frame.Back_1.getX()<-Frame.Size-alpa)
					{
						Frame.Back_1.setLocation(Frame.Size,0);
						Choice1 = !Choice1;
					}
				}
				if(Choice2 == true)
				{
					Frame.Back_2.setLocation(Frame.Back_2.getX()-1,Frame.Back_2.getY());
					if(Frame.Back_2.getX()<-alpa)
					{
						Choice1=true;
					}
					if(Frame.Back_2.getX()<-Frame.Size-alpa)
					{
						Frame.Back_2.setLocation(Frame.Size,0);
						Choice2 = !Choice2;
					}
				}
				Thread.sleep(Main.Speed*20);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}
