package homework5;
import java.util.*;
public class SumOfNumbers {

	public static void sum(){
		Scanner sc = new Scanner(System.in);
		String str = null;
		int num = 0;
		int result = 0;
		while(true){
			
			System.out.print("������ ���� �Է��ϼ���(Q:����) :");
			str = sc.next();
			
			if(str.equals("Q")||str.equals("q"))
				break;
			num = Integer.parseInt(str);
			
			for(int i = 1; i<=num; i++)
				result += i;
			
			System.out.println("�� ����"+result+"�Դϴ�.");
			result = 0;
		}
	}
}
