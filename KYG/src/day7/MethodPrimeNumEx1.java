package day7;

import java.util.Scanner;

public class MethodPrimeNumEx1 {

	public static void main(String[] args) {
		/* �־��� ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� �޼ҵ带 ����� ȣ���Ͽ� Ȯ���ϼ���.*/
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		num = scan.nextInt();
		isprime1(num);
		scan. close();
		
		//2
		if(isprime2(num)) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		}
		else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�");
		}
	}
	/* ��� : �Ҽ� �Ǻ�
	 * �Ű����� : int
	 * ����Ÿ�� : void
	 * �޼ҵ�� : primenum1*/
	public static void isprime1(int num) {
		int i, count;
		for(i = 1, count = 0 ; i <= num ; i++ ) {
			if(num % i == 0 ) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		}
		else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�");
		}			
	}
	/* ��� : �Ҽ� �Ǻ�
	 * �Ű����� : int
	 * ����Ÿ�� : boolean
	 * �޼ҵ�� : isprime*/
	public static boolean isprime2(int num) {
		int i, count;
		if (num <= 0) {
			return false;
		}
		for(i = 1, count = 0 ; i <= num ; i++ ) {
			if(num % i == 0 ) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		/*else {
			return false;
		}*/
		//�⺻���� false�� ������ ������ elseó�� �ص� �ǰ� ���ص���
		return false;
	}
}
