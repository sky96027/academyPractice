package day18;

import java.util.Scanner;

public class updown {
	
	public static void main(String[] args) {
		//1~100 ������ ���� ����
		int Q, A, min = 1, max = 100;
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random() * (max - min + 1)) + min;
		Q = random;
		//do while������ �Ǻ� Ŭ����, �� �Է¹޴� �κ� ����
		do {
			//�������� ���� �Է¹���
			System.out.print("���� �Է��ϼ��� : ");
			A = scan.nextInt();
			//�Ǻ� �޼ҵ�
			int d = discrimination(Q, A);
			//����ġ
			switch(d) {
			case 1 : System.out.println("up"); break;
			case 2 : System.out.println("down"); break;
			case 3 : System.out.println("�����Դϴ�."); break;
			}
			//true�� �� �ݺ� false�� �� break
		}while(A != Q);
		
	}
	//up���� down���� �Ǻ� �޼ҵ�
	static int discrimination(int Q, int A) {
		//up
		if(Q > A) {
			return 1;
		}
		//down
		if(Q < A) {
			return 2;
		}
		else {
		return 3;
		}
	}
}
	
