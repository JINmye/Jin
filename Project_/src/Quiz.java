public class Quiz 
{
	static boolean Quiz_Start = false;
	static int Quiz_Num ;
	Quiz()
	{
		Quiz_Num = (int)(Math.random()*Quiz_Create.n)+1;
		Frame.Quiz.setText(Quiz_Create.Q[Quiz_Num]);
		Quiz_Start=true;
		
		Quiz_Time Quiz_Time = new Quiz_Time();
		Quiz_Time.start();

		Frame.Quiz.setVisible(true);
		Frame.Time.setVisible(true);
		
	}
}
