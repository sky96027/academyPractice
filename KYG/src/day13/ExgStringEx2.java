package day13;

import java.util.Scanner;

public class ExgStringEx2 {

	public static void main(String[] args) {
		/* char charAt(int index) : ���ڿ����� index��°�� �ִ� ���ڸ� �˷��ִ� �޼ҵ�
		 * */
		String str = "Hello";
		System.out.println(str + "���� 1��° ���� : " + str.charAt(0));
		Scanner scan = new Scanner(System.in);
		/* Scanner�� �� ���ڸ� �Է¹޴� ����� ����
		 * ���ڿ��� �Է¹޾� charAt�� �̿��Ͽ� �� ���ڸ� ����
		 */
		char ch1 = scan.next().charAt(0);
		char ch2 = scan.next().charAt(1);
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		scan.close();
	}

}
