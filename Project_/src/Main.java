import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class Main 
{
	public static int Speed=5 , Ch_Speed=5 , Life=10 , MaxLife=10,Boss_Life = 50, Boss_MaxLife=50;
	public static int Mp=0,MaxMp=3; //10
	
	public static void main(String[] args) 
	{
		new Quiz_Create();
		Frame F = new Frame();
		F.addKeyListener(new Move());
		New_Medicine NM = new New_Medicine();
		NM.start();
		
		New_Quiz_Icon QI = new New_Quiz_Icon();
		QI.start();
		
		New_Obstruction  NO = new New_Obstruction();
		NO.start();
		
		new HP();
		new MP();

	}

}
