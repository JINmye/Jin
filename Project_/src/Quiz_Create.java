import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Quiz_Create 
{
	public static String Q[] ;
	public static int n=0, Answer[] ;
	Quiz_Create ()
	{
		try {
			int c,i;
			FileInputStream fin = new FileInputStream("Quiz/test.txt");
			InputStreamReader in = new InputStreamReader(fin,"MS949");
			
			n=(in.read()-(int)'0') *10;
			n=n+(in.read()-(int)'0'); // ���� ����
	
			Q = new String[n+2];
			Answer = new int[n+2];
			
			for(i=1;i<=n;i++)
			{
				Q[i]="";
			} // Q �ʱ�ȭ
			i=1;
			while((c=in.read())!=-1)
			{
				
				if(c==(int)'#')
				{
					
					c=in.read();
					Answer[i]=c-'0';
					i++;
				}
				else if(c=='@')
					{
						System.out.println("break!");
						break;
					}
				else
				{
					Q[i]= Q[i]+(char)c;
				}
			}
/*			for(i=1;i<=n;i++)
			{
				System.out.println(Q[i] + "\n ���� "+i +"�� ��\n");
			}
*/			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
