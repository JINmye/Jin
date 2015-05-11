import javax.swing.JLabel;


public class New_Quiz_Icon extends Thread
{
	JLabel Q_I;
	int n;
	public void run()
	{
		while(true)
		{
			try
			{
				n = (int)(Math.random()*5)+1;
				Q_I=Frame.Q_I[n];
				if(Q_I.getX()>Frame.Size+10)
				{
					Q_I.setLocation(Frame.Size+10, 100+(int)(Math.random()*600));
					Q_I.setVisible(true);
					Move_Quiz_Icon t3 = new Move_Quiz_Icon(Q_I);
					t3.start();
				}
				
				if(Main.Mp==Main.MaxMp)
				{
					return;
				}
				Thread.sleep(n*2000);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}
