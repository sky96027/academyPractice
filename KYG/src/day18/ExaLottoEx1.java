package day18;

import java.util.*;

import day17.ExeBaseBallEx1;

public class ExaLottoEx1 {

	public static void main(String[] args) {
		/* �ζ� ���α׷��� day 17 ��Ű���� �߱� ������ Ȱ���Ͽ� ���弼��.*/
		List<Integer> lotto = new ArrayList<Integer>();
		List<Integer> user  = new ArrayList<Integer>();
		int bonus = 0;
		int min = 1, max = 45;
		int count = 6;
		int total = 0;
		char ch = 'y';
		Scanner scan = new Scanner(System.in);
		//�ζ� ��÷ ��ȣ�� �������� ����
		ExeBaseBallEx1.createRandomList(lotto, min, max, count);
		//�ζ� ���ʽ� ��ȣ�� �������� ����
		while(true) {
			bonus = (int)(Math.random() * (max - min + 1) + min);
			if(!lotto.contains(bonus)) {
				break;
			}
		}
		System.out.print(lotto);
		System.out.println(" : " + bonus);
		//�ݺ�
		while(ch == 'y'|| ch == 'Y') {
			//����ڰ� �ζ� ��ȣ �Է�
			System.out.println("�Է� : ");
			int inputResult = ExeBaseBallEx1.inputList(user, min, max, count, scan);
			switch(inputResult) {
			case -1:
				System.out.println("�ߺ��� ���� �Է��߽��ϴ�.");
				break;
			case 1:
				System.out.println("�߸��� ������ ������ �Է��߽��ϴ�.");
				break;
			}
			//��÷ ���� Ȯ��
			total = ExeBaseBallEx1.getBall(lotto, user) + ExeBaseBallEx1.getStrike(lotto, user);
			//��÷ ��� Ȯ��
			switch(total) {
			case 6 : System.out.println("1�� ��÷"); break;
			case 5 : 
				if(user.contains(bonus)) {
					System.out.println("2�� ��÷");
				}
				else {
					System.out.println("3�� ��÷");
				}
				break;
			case 4 : System.out.println("4�� ��÷"); break;
			case 3 : System.out.println("5�� ��÷"); break;
			default : System.out.println("��");
			
			}
			System.out.println("1�� �� ? (y/n) : ");
			ch = scan.next().charAt(0);
		}
	}

}
