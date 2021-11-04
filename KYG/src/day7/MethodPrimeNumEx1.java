package day7;

import java.util.Scanner;

public class MethodPrimeNumEx1 {

	public static void main(String[] args) {
		/* 주어진 정수가 소수인지 아닌지 판별하는 메소드를 만들고 호출하여 확인하세요.*/
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		num = scan.nextInt();
		isprime1(num);
		scan. close();
		
		//2
		if(isprime2(num)) {
			System.out.println(num + "은 소수입니다.");
		}
		else {
			System.out.println(num + "은 소수가 아닙니다");
		}
	}
	/* 기능 : 소수 판별
	 * 매개변수 : int
	 * 리턴타입 : void
	 * 메소드명 : primenum1*/
	public static void isprime1(int num) {
		int i, count;
		for(i = 1, count = 0 ; i <= num ; i++ ) {
			if(num % i == 0 ) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num + "은 소수입니다.");
		}
		else {
			System.out.println(num + "은 소수가 아닙니다");
		}			
	}
	/* 기능 : 소수 판별
	 * 매개변수 : int
	 * 리턴타입 : boolean
	 * 메소드명 : isprime*/
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
		//기본값이 false로 끝나기 때문에 else처리 해도 되고 안해도됨
		return false;
	}
}
