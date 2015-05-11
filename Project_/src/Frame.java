import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame extends JFrame
{
	public static ImageIcon [] image = 
	{
			new ImageIcon("images/55.png"),
			new ImageIcon("images/22.png"),
			new ImageIcon("images/1.jpg"),
			new ImageIcon("images/2.jpg"),
			new ImageIcon("images/1.gif"),
			new ImageIcon("images/d.png"),
			new ImageIcon("images/monster1.gif"),
			new ImageIcon("images/2.gif"),  //7
			new ImageIcon("images/48.gif"),
			new ImageIcon("images/14.gif")
	};

	public static JLabel Time = new JLabel();
	
	public static JLabel Character = new JLabel();
	public static int Size=768 , Back_Size=960 , M_Size=28 ,O_Size=28, Q_Size=28, S_Size=28;
	public static int Alpa=50;
	
	public static JLabel Back_1 = new JLabel();
	public static JLabel Back_2 = new JLabel();
	
	public static JLabel M_S[] = new JLabel[6]; // Medicine_Speed
	
	public static JLabel Q_I[] = new JLabel[6];	//Quiz_Icon
	
	public static JLabel O_S[] = new JLabel[16]; // Ob Struction
	
	public static JLabel Star[] = new JLabel[20];
	
	public static JPanel P = new JPanel();
	
	public static JTextArea Quiz = new JTextArea();
	
	public static MyLabel Hp = new MyLabel(100);
	public static MyLabel2 Mp = new MyLabel2(100);
	
	public static MyLabel Boss_Hp = new MyLabel(200);
	public static JLabel2 Boss = new JLabel2();
	
	Frame()
	{			
		setContentPane(P);
		setTitle("Project 1 ¡Ù");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(Size,Size);
		setVisible(true);
		setLayout(null);
		
		Time.setSize(30,30);
		Time.setLocation(500,0);
		add(Time);
		Time.setVisible(false);
		
		Quiz.setSize(550,300);
		Quiz.setLocation(10, 10);
		Quiz.setText("dd");
		Quiz.setOpaque(true);
		Quiz.setBackground(Color.WHITE);
		Quiz.setEnabled(false);
		Quiz.setFont(new Font("Gothic",Font.ITALIC,15));
		add(Quiz);
		Quiz.setVisible(false);
		
		
		Boss.setSize(213,180);
		Boss.setLocation(550,550);
		add(Boss);
		Boss.setIcon(image[9]);
		Boss.setVisible(false);
		
		
		Hp.setBackground(Color.LIGHT_GRAY);
		Hp.setOpaque(true);
		Hp.setLocation(620,620);
		Hp.setSize(100,10);
		Hp.setVisible(true);
		add(Hp);
		
		Mp.setBackground(Color.LIGHT_GRAY);
		Mp.setOpaque(true);
		Mp.setLocation(620,620);
		Mp.setSize(100,10);
		Mp.setVisible(true);
		add(Mp);
		
		Boss_Hp.setBackground(Color.LIGHT_GRAY);
		Boss_Hp.setOpaque(true);
		Boss_Hp.setLocation(620,620);
		Boss_Hp.setSize(200,10);
		Boss_Hp.setVisible(false);
		add(Boss_Hp);
		
		
		for(int i=1;i<6;i++) 
		{
			Q_I[i]= new JLabel();
			Q_I[i].setSize(Q_Size,Q_Size);

			Q_I[i].setLocation(Size+20, 300+(int)(Math.random()*350));
			
			Q_I[i].setIcon(image[5]);
			add(Q_I[i]);
			Q_I[i].setVisible(false);
		}
		
		for(int i=1;i<6;i++) // 0¹ø ¾È ¾¸
		{
			M_S[i]= new JLabel();
			M_S[i].setSize(M_Size,M_Size);

			M_S[i].setLocation(Size+20, 300+(int)(Math.random()*350));
			
			M_S[i].setIcon(image[1]);
			add(M_S[i]);
			M_S[i].setVisible(false);
		}
		for(int i=1;i<16;i++)
		{
			O_S[i]= new JLabel();
			O_S[i].setSize(O_Size,O_Size);

			O_S[i].setLocation(Size+20, (int)(Math.random()*Frame.Size));
			
			O_S[i].setIcon(image[4]); 
			add(O_S[i]);
			O_S[i].setVisible(false);
		}
		for(int i=0;i<20;i++)
		{
			Star[i]= new JLabel();
			Star[i].setSize(S_Size,S_Size);

			Star[i].setLocation(Size+20, 0);
			
			Star[i].setIcon(image[7]); 
			add(Star[i]);
			Star[i].setVisible(false);
		}
		
		
		
		Character.setSize(90,90);
		Character.setLocation(100, 100);
		Character.setIcon(image[8]);
		add(Character);
		
		
		
		Back_1.setIcon(image[2]);
		Back_2.setIcon(image[3]);
		Back_1.setSize(Back_Size,Size);
		Back_2.setSize(Back_Size,Size);
		Back_1.setLocation(0, 0);
		Back_2.setLocation(Size, 0);
		P.add(Back_1);
		P.add(Back_2);
		
		
		
	 	//P.setBackground(Color.RED);
		
		Move_Background MB = new Move_Background();
		MB.start();
		
		this.setLocation(100,100);
	}
}
