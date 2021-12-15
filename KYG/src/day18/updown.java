package day18;

import java.util.Scanner;

public class updown {
	
	public static void main(String[] args) {
		//1~100 무작위 숫자 정함
		int Q, A, min = 1, max = 100;
		Scanner scan = new Scanner(System.in);
		int random = (int)(Math.random() * (max - min + 1)) + min;
		Q = random;
		//do while문으로 판별 클래스, 값 입력받는 부분 감쌈
		do {
			//유저에게 값을 입력받음
			System.out.print("답을 입력하세요 : ");
			A = scan.nextInt();
			//판별 메소드
			int d = discrimination(Q, A);
			//스위치
			switch(d) {
			case 1 : System.out.println("up"); break;
			case 2 : System.out.println("down"); break;
			case 3 : System.out.println("정답입니다."); break;
			}
			//true일 시 반복 false일 시 break
		}while(A != Q);
		
	}
	//up인지 down인지 판별 메소드
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
	
