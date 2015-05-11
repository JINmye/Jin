import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Last_Quiz 
{
	Last_Quiz()
	{
		Frame.Boss.setVisible(true);
		Frame.Boss_Hp.setVisible(true);
	}
}

class JLabel2 extends JLabel
{
	ImageIcon icon = new ImageIcon("images/monster1.png");
	Image img = icon.getImage();
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawImage(img,0,0,getWidth(),getHeight(),this);
	}
}