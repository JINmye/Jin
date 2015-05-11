import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Move extends KeyAdapter 
{
	JLabel Ch=Frame.Character;
	
	Timer_Up Timer_Up = new Timer_Up();
	Timer_Down Timer_Down = new Timer_Down();
	Timer_RL Timer_RL = new Timer_RL();
	
	int M=5 , n=0;
	
	static boolean Up = false , Right = false ,Left = false;
	
	Move()
	{	
		Timer_RL.start(); // << 죽이고 싶다! 키보드가 눌리면 계속 작동
		Timer_Down.start();
	}
	public void keyPressed(KeyEvent e)
	{
		int keyCode = e.getKeyCode();
	
		
		switch(keyCode)
		{
			case KeyEvent.VK_UP:
				Timer_Down.Up2=-1;
				if(Ch.getY()>Frame.Size-(Frame.Character.getHeight()+Frame.Alpa+10) && Up==false)
				{
					Timer_Up = new Timer_Up();
					Timer_Up.start();
					Up=true;
					System.out.println("up시작");
					Timer_Down = new Timer_Down();
					Timer_Down.start();
				}
				break;
			case KeyEvent.VK_DOWN:
				//Ch.setLocation(Ch.getX(),Ch.getY()+M);
				Timer_Down.Down=1;
				break;
			case KeyEvent.VK_LEFT:
			{
				Left=true;
				Right=false;
				break;
			}
			case KeyEvent.VK_RIGHT:
			{
				Right=true;
				Left=false;
				break;	
			}
			default :
				break;
		}
	}
	
	public void keyReleased(KeyEvent e)
	{
		int keyCode = e.getKeyCode();	
		switch(keyCode)	
		{
			case KeyEvent.VK_UP:
				Timer_Down.Up2=0;
				break;				
			case KeyEvent.VK_DOWN:
			{
				Timer_Down.Down=0;
				break;
			}
			case KeyEvent.VK_LEFT:
			{
				Left=false;
				break;
			}
			case KeyEvent.VK_RIGHT:
			{
				Right=false;
				break;
			}		
			case KeyEvent.VK_1:
			{
				if(Quiz.Quiz_Start==true)
				{
					Quiz.Quiz_Start=false;
					Quiz_Time.n=0;
					if(Quiz_Create.Answer[Quiz.Quiz_Num]==1)
					{
						JOptionPane.showMessageDialog(Frame.P, "정 답!!!","@ _ @",JOptionPane.INFORMATION_MESSAGE);
						Main.Mp=Main.Mp+1;
					}
					else
					{
						JOptionPane.showMessageDialog(Frame.P, "오 답!!!\n 정답은 : "+Quiz_Create.Answer[Quiz.Quiz_Num],"ㅠ _ ㅠ",JOptionPane.ERROR_MESSAGE);						
						Main.Life=Main.Life-3;
					}
				}
				break;
			}
			case KeyEvent.VK_2:
			{
				if(Quiz.Quiz_Start==true)
				{
					Quiz.Quiz_Start=false;
					Quiz_Time.n=0;
					if(Quiz_Create.Answer[Quiz.Quiz_Num]==2)
					{
						JOptionPane.showMessageDialog(Frame.P, "정 답!!!","@ _ @",JOptionPane.INFORMATION_MESSAGE);
						Main.Mp=Main.Mp+1;
					}
					else
					{
						JOptionPane.showMessageDialog(Frame.P, "오 답!!!\n 정답은 : "+Quiz_Create.Answer[Quiz.Quiz_Num],"ㅠ _ ㅠ",JOptionPane.ERROR_MESSAGE);						
						Main.Life=Main.Life-3;
					}
				}
				break;
			}
			case KeyEvent.VK_3:
			{
				if(Quiz.Quiz_Start==true)
				{
					Quiz.Quiz_Start=false;
					Quiz_Time.n=0;
					if(Quiz_Create.Answer[Quiz.Quiz_Num]==3)
					{
						JOptionPane.showMessageDialog(Frame.P, "정 답!!!","@ _ @",JOptionPane.INFORMATION_MESSAGE);
						Main.Mp=Main.Mp+1;
					}
					else
					{
						JOptionPane.showMessageDialog(Frame.P, "오 답!!!\n 정답은 : "+Quiz_Create.Answer[Quiz.Quiz_Num],"ㅠ _ ㅠ",JOptionPane.ERROR_MESSAGE);						
						Main.Life=Main.Life-3;
					}
				}
				break;
			}
			case KeyEvent.VK_4:
			{
				if(Quiz.Quiz_Start==true)
				{
					Quiz.Quiz_Start=false;
					Quiz_Time.n=0;
					if(Quiz_Create.Answer[Quiz.Quiz_Num]==4)
					{
						JOptionPane.showMessageDialog(Frame.P, "정 답!!!","@ _ @",JOptionPane.INFORMATION_MESSAGE);
						Main.Mp=Main.Mp+1;
					}
					else
					{
						JOptionPane.showMessageDialog(Frame.P, "오 답!!!\n 정답은 : "+Quiz_Create.Answer[Quiz.Quiz_Num],"ㅠ _ ㅠ",JOptionPane.ERROR_MESSAGE);						
						Main.Life=Main.Life-3;
					}
				}
				break;
			}
			case KeyEvent.VK_5:
			{
				if(Quiz.Quiz_Start==true)
				{
					Quiz.Quiz_Start=false;
					Quiz_Time.n=0;
					if(Quiz_Create.Answer[Quiz.Quiz_Num]==5)
					{
						JOptionPane.showMessageDialog(Frame.P, "정 답!!!","@ _ @",JOptionPane.INFORMATION_MESSAGE);
						Main.Mp=Main.Mp+1;
					}
					else
					{
						JOptionPane.showMessageDialog(Frame.P, "오 답!!!\n 정답은 : "+Quiz_Create.Answer[Quiz.Quiz_Num],"ㅠ _ ㅠ",JOptionPane.ERROR_MESSAGE);						
						Main.Life=Main.Life-3;
					}
				}
				break;
			}
			case KeyEvent.VK_SPACE:
			{
				n++;
				if(n==20)
				{
					n=n%20;
				}
				System.out.println(n);
				if(Frame.Star[n].getX()>Frame.Size+10)
				{
					Frame.Star[n].setLocation(Frame.Character.getX()+Frame.Character.getWidth(), Frame.Character.getY()+Frame.Character.getHeight()/3);
					Frame.Star[n].setVisible(true);
					Move_Star t3 = new Move_Star(Frame.Star[n]);
					t3.start();
				}
			}
			default :
				break;
		}
		
	}
}
