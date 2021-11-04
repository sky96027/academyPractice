package day7;

import java.util.Scanner;

public class MethodSumEx2 {

	public static void main(String[] args) {
		/* 1부터 10까지 합을 출력하는 코드를 메소드를 이용하여 작성해보세요.*/
		int begin, end;
		Scanner scan = new Scanner(System.in);
		System.out.print("시작 정수를 입력하세요 : ");
		begin = scan.nextInt();
		System.out.print("끝 정수를 입력하세요 : ");
		end = scan.nextInt();
		sum1(begin, end); //내가 코딩
		
		sum2(); //강사님 예시 (재사용률이 매우 낮은 코드)
		
		sum3(10); //2보다는 낫지만 시작지점을 바꾸지 못함
		
		sum4(1,10); //시작지점도 바꿀 수 있음 하지만 재사용률이 낮음
		
		begin = 10;
		end = 1;
		System.out.println(begin + "부터 " + end + "까지의 합 : " + sum5(begin, end));
		
		
	}
	/* 기능 : 1부터 10까지의 합을 콘솔에 출력하는 메소드
	 * 매개변수 : num1 num2
	 * 리턴타입 : void
	 * 메소드명 : sum1*/
	public static void sum1(int num1, int num2) {
		int sum = 0;
		for(int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		
		int result = sum;
		System.out.println(num1 + "과 " + num2 + "까지의 합 : " + result);
	}
	/* 기능 : 1부터 10까지의 합을 콘솔에 출력하는 메소드 (1과 10은 고정)
	 * 매개변수 : 없음
	 * 리턴타입 : void
	 * 메소드명 : sum2*/
	public static void sum2() {
		int begin = 1, end = 10;
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		System.out.println(begin + "부터 " + end + "까지의 합 : " + sum);
	}
	/* 기능 : 1부터 end까지 합을 콘솔에 출력하는 메소드
	 * 매개변수 : int end
	 * 리턴타입 : void
	 * 메소드명 : sum3*/
	public static void sum3(int end) {
		int begin = 1;
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		System.out.println(begin + "부터 " + end + "까지의 합 : " + sum);
	}
	/* 기능 : 1부터 end까지 합을 콘솔에 출력하는 메소드
	 * 매개변수 : int begin, int end
	 * 리턴타입 : void
	 * 메소드명 : sum4*/
	public static void sum4(int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		System.out.println(begin + "부터 " + end + "까지의 합 : " + sum);
	}
	public static int sum5(int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}

