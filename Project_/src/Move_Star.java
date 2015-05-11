import javax.swing.JLabel;


public class Move_Star extends Thread
{
	int alpa=10; // 캐릭터의 크기가 정확하게 사각형이 아니니까 캐릭터의 범위를  좀 더 작게
	JLabel Star;
	int y=0;
	Move_Star (JLabel Star)
	{
		this.Star = Star;
/*		y=(int)(Math.random()*2);
		if(y==0)
		{
			y=(int)(Math.random()*2);
		}
		else
		{
			y=(int)(Math.random()*2)*-1;
		}
*/
	}
	synchronized public void run()
	{
		while(true)
		{
			try
			{	
				if(Main.MaxMp==Main.Mp)
				{
					if( Frame.Boss.getX() - Frame.S_Size +alpa <= Star.getX() && Star.getX() <= Frame.Boss.getX() + Frame.Boss.getWidth() -alpa)
					{
						if(Frame.Boss.getY() - Frame.S_Size +alpa<= Star.getY() && Star.getY() <= Frame.Boss.getY() + Frame.Boss.getHeight() -alpa )
						{
							Star.setVisible(false);
							Star.setLocation(Frame.Size+20, (int)(Math.random()*Frame.Size));
							Main.Boss_Life=Main.Boss_Life-1;
							return;
						}
					}
				}
				if(Star.getX()>Frame.Size+100)
				{
					Star.setVisible(false);
					Star.setLocation(Frame.Size+20, 0);
					return;
				}
				Star.setLocation(Star.getX()+5, Star.getY()+y);
				Thread.sleep(Main.Speed * 3);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}
