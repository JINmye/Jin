import javax.swing.JLabel;

public class New_Obstruction extends Thread
{
	JLabel O_S;
	int n;
	public void run()
	{
		while(true)
		{
			try
			{
				n = (int)(Math.random()*15)+1;
				O_S=Frame.O_S[n];
				if(O_S.getX()>Frame.Size+10)
				{
					O_S.setLocation(Frame.Size+10, 350+(int)(Math.random()*450));
					O_S.setVisible(true);
					Move_Obstruction t2 = new Move_Obstruction(O_S);
					t2.start();
				}
										
				Thread.sleep(n*50);
			}
			catch(InterruptedException e)
			{
				return ;
			}
		}
	}
}

	
