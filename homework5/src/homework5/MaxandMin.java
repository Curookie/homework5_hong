package homework5;
import java.util.*;
public class MaxandMin {
	public static void max_min(){
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		int num = 0;
		int max = 0;
		int min = 0;
		int flag = 0;
		
		while(true){
			System.out.print("0~100������ ���ڸ� �Է����ּ���(Q:����) :");
			str = sc.next();
			
			if(str.equals("Q")|| str.equals("q")){
				break;
			}
			
			num = Integer.parseInt(str);
			
			if(num < 0 || num > 100){
				System.out.println("���� �ʹ� �۰ų� Ů�ϴ�.");
				continue;
			}
			
			if(flag == 0){
				max = num;
				min = num;
				flag = 1;
			}
			
			if(num > max)
				max = num;
			
			if(num < min)
				min = num;
		}
		
		System.out.println("���� ū ���� "+max+"�̰�, ���� ���� ����"+min+"�Դϴ�.");
		
	}
}
