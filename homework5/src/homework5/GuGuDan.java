package homework5;
import java.util.*;

public class GuGuDan 
{
	
	public static void gugudan()
	{
		Scanner sc = new Scanner(System.in);
		String str = null;
		int num = 0;
		
		while(true)
		{
			System.out.print("����ϰ� ���� ��(Q:����) :");
			str = sc.next();
			if(str.equals("Q") || str.equals("q"))
				break;
			
			num = Integer.parseInt(str);
			
			if(num > 9 || num < 2)
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
			else
			{
				for(int i = 1; i<=9; i++)
				{
					System.out.printf("%d * %d = %d \t",num,i,num*i);
					
					if(i%2==0)
						System.out.println();
				}
			}
			System.out.println();
		}
	}
}
