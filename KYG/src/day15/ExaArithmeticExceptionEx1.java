package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExaArithmeticExceptionEx1 {

	public static void main(String[] args) {
		/* �� ������ ��� �����ڸ� �Է¹޾� ��� ���� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, �޼ҵ带 �̿��ϰ� ����ó���� �ϼ���*/
		Scanner scan = new Scanner(System.in);
 		int num1 = 0, num2 = 0;
 		char op = 0;
 		System.out.println("�� ������ ��� ������ �Է� : ");
 		try {
 		num1 = scan.nextInt();
		op = scan.next().charAt(0);
		num2 = scan.nextInt();
		Am(num1, op, num2);
 		}catch(ArithmeticException e) {
 			System.out.println("0���� ���� �� �����ϴ�.");
 		}catch(InputMismatchException e) {
 			System.out.println("�Է� �Ǽ�");
 		}catch(Exception e) {
 			System.out.println("����");
 		}finally {
 			System.out.println("������ �ڵ�");
 		}
 		System.out.println("������ �ڵ�2");
		scan.close();
	}
	public static void Am(int num1, char op, int num2)throws Exception {
		double res = 0;
		
		try {
		switch(op) {
			case '+' : res = num1 + num2;			break;
			case '-' : res = num1 - num2;			break;
			case '*' : res = num1 * num2;			break;
			case '/' : res = num1 / (double)num2;	break;
			case '%' : res = num1 % num2;			break;
			default : throw new Exception("�߸��� ������ �Դϴ�.");
		}	
		}catch(Exception e) {
			System.out.println("����");
		}
		System.out.println("" + num1 + op + num2 + "=" + res);
	}
}
