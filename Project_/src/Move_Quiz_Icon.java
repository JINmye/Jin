import javax.swing.JLabel;


public class Move_Quiz_Icon extends Thread
{
	int alpa=15; // 캐릭터의 크기가 정확하게 사각형이 아니니까 캐릭터의 범위를  좀 더 작게
	JLabel Q_I;
	int y;
	Move_Quiz_Icon  (JLabel Q_I)
	{
		this.Q_I = Q_I;
		y=(int)(Math.random()*2);
		if(y==0)
		{
			y=(int)(Math.random()*2);
		}
		else
		{
			y=(int)(Math.random()*2)*-1;
		}
	}
	synchronized public void run()
	{
		while(true)
		{
			try
			{		
				if( Frame.Character.getX() - Frame.Q_Size +alpa <= Q_I.getX() && Q_I.getX() <= Frame.Character.getX() + Frame.Character.getWidth() -alpa)
				{
					if(Frame.Character.getY() - Frame.Q_Size +alpa<= Q_I.getY() && Q_I.getY() <= Frame.Character.getY() + Frame.Character.getHeight() -alpa )
					{
						Q_I.setVisible(false);
						Q_I.setLocation(Frame.Size+20, (int)(Math.random()*Frame.Size));
						
						if(Quiz.Quiz_Start==false && !(Main.Mp==Main.MaxMp))
						{
							new Quiz();
						}
						
						return;
					}
				}		
				if(Q_I.getX()<-100)
				{
					Q_I.setVisible(false);
					Q_I.setLocation(Frame.Size+20, (int)(Math.random()*Frame.Size));
					return;
				}
				Q_I.setLocation(Q_I.getX()-4, Q_I.getY()+y);
				Thread.sleep(Main.Speed * 6);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}
