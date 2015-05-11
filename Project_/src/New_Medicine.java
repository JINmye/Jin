import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class New_Medicine extends Thread 
{
	JLabel M_S;
	int n;
	public void run()
	{
		while(true)
		{
			try
			{
				n = (int)(Math.random()*5)+1;
				M_S=Frame.M_S[n];
				if(M_S.getX()>Frame.Size+10)
				{
					M_S.setLocation(Frame.Size+10, 350+(int)(Math.random()*450));
					M_S.setVisible(true);
					Move_Medicine_Speed t = new Move_Medicine_Speed(M_S);
					t.start();
				}
							
				
				Thread.sleep(n*1000);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}
