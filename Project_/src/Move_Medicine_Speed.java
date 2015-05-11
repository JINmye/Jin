import javax.swing.JLabel;


public class Move_Medicine_Speed extends Thread 
{
	int alpa=15; // 캐릭터의 크기가 정확하게 사각형이 아니니까 캐릭터의 범위를  좀 더 작게
	JLabel M_S;
	Move_Medicine_Speed(JLabel M_S)
	{
		this.M_S = M_S;
	}
	synchronized public void run()
	{
		while(true)
		{
			try
			{		
				if( Frame.Character.getX() - Frame.M_Size +alpa <= M_S.getX() && M_S.getX() <= Frame.Character.getX() + Frame.Character.getWidth() -alpa)
				{
					if(Frame.Character.getY() - Frame.M_Size +alpa<= M_S.getY() && M_S.getY() <= Frame.Character.getY() + Frame.Character.getHeight() -alpa )
					{
						M_S.setVisible(false);
						M_S.setLocation(Frame.Size+20, 300+(int)(Math.random()*350));
						Main.Ch_Speed=(int)(Math.random()*13)+2;
						return;
					}
				}		
				if(M_S.getX()<-100)
				{
					M_S.setVisible(false);
					M_S.setLocation(Frame.Size+20, 300+(int)(Math.random()*350));
					return;
				}
				M_S.setLocation(M_S.getX()-2, M_S.getY());
				Thread.sleep(Main.Speed * 3);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}
