package homework5;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		
		while(flag != 6){
			System.out.println("1. 1���� �Է��� �� ���ϱ�.");
			System.out.println("2. �ִ밪/�ּҰ����ϱ�");
			System.out.println("3. �Է¹��������� �հ�� ��ձ��ϱ�");
			System.out.println("4. ���ϴ� ������ ����ϱ� ");
			System.out.println("5. ¦����/Ȧ���� ����ϱ�");
			System.out.println("6. �����ϱ�.");
			
			System.out.print("���ϴ� �޴� : ");
			flag = sc.nextInt();
			
			switch(flag){
				case 1:
					SumOfNumbers.sum();
					break;
				case 2:
					MaxandMin.max_min();
					break;
				case 3:
					SumandAvg.sum_avg();
					break;
				case 4:
					GuGuDan.gugudan();
					break;
				case 5:
					break;
				case 6:
					break;
				default:
					System.out.println("�ٽ� �Է� �� �ּ���.");
					break;
			}
			
		}
	}

}
