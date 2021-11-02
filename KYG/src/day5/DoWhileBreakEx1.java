package day5;

import java.util.Scanner;

public class DoWhileBreakEx1 {

	public static void main(String[] args) {
		/* 0을 입력할 때까지 정수를 계속 입력받는 코드를 작성하세요.
		 *  */
		int num = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("정수를 입력하세요 : ");
			num = scan.nextInt();
		}while(num != 0);
		
		scan.close();

	}

}
