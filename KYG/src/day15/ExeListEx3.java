package day15;

import java.util.*;

public class ExeListEx3 {

	public static void main(String[] args) {
		/* ������ ������ 5�� �Է¹޾� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, ����Ʈ �̿�
		 * ���1. ������ ������ String���� �����ϴ¹��*/

		ArrayList<String> todoList1 = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("������ ���� : ");
			String tmp = scan.nextLine();
			todoList1.add(tmp);
		}
		System.out.println(todoList1);
		scan.close();
	}



}