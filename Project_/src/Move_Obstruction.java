import javax.swing.JLabel;

public class Move_Obstruction extends Thread
{
	int alpa=15; // 캐릭터의 크기가 정확하게 사각형이 아니니까 캐릭터의 범위를  좀 더 작게
	JLabel O_S;
	int y;
	Move_Obstruction (JLabel O_S)
	{
		this.O_S = O_S;
		y=(int)(Math.random()*2);
		if(y==0)
		{
			y=(int)(Math.random()*3);
		}
		else
		{
			y=(int)(Math.random()*3)*-1;
		}
	}
	synchronized public void run()
	{
		while(true)
		{
			try
			{		
				if( Frame.Character.getX() - Frame.O_Size +alpa <= O_S.getX() && O_S.getX() <= Frame.Character.getX() + Frame.Character.getWidth() -alpa)
				{
					if(Frame.Character.getY() - Frame.O_Size +alpa<= O_S.getY() && O_S.getY() <= Frame.Character.getY() + Frame.Character.getHeight() -alpa )
					{
						O_S.setVisible(false);
						O_S.setLocation(Frame.Size+20, (int)(Math.random()*Frame.Size));
						Main.Life=Main.Life-1;
						return;
					}
				}		
				if(O_S.getX()<-100)
				{
					O_S.setVisible(false);
					O_S.setLocation(Frame.Size+20, (int)(Math.random()*Frame.Size));
					return;
				}
				O_S.setLocation(O_S.getX()-2, O_S.getY()+y);
				Thread.sleep(Main.Speed * 3);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}
