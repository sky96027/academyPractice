package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExaArithmeticExceptionEx1 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요.
		 * 단, 메소드를 이용하고 예외처리를 하세요*/
		Scanner scan = new Scanner(System.in);
 		int num1 = 0, num2 = 0;
 		char op = 0;
 		System.out.println("두 정수와 산술 연산자 입력 : ");
 		try {
 		num1 = scan.nextInt();
		op = scan.next().charAt(0);
		num2 = scan.nextInt();
		Am(num1, op, num2);
 		}catch(ArithmeticException e) {
 			System.out.println("0으로 나눌 수 없습니다.");
 		}catch(InputMismatchException e) {
 			System.out.println("입력 실수");
 		}catch(Exception e) {
 			System.out.println("예외");
 		}finally {
 			System.out.println("마지막 코드");
 		}
 		System.out.println("마지막 코드2");
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
			default : throw new Exception("잘못된 연산자 입니다.");
		}	
		}catch(Exception e) {
			System.out.println("예외");
		}
		System.out.println("" + num1 + op + num2 + "=" + res);
	}
}
