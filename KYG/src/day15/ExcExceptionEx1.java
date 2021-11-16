package day15;

import java.util.Arrays;
import java.util.Scanner;

public class ExcExceptionEx1 {

	public static void main(String[] args) {
		/* 정수 5개짜리 배열에 정수를 5개 입력받아 저장한 후 원하는 번지에 정수를 수정하는 코드를 작성하세요.
		 * 예시
		 * 정수를 입력하세요 : 1 2 3 4 5
		 * 수정할 번지와 정수를 입력하세요 : 0
		 * */
		Scanner scan = new Scanner(System.in);
		int [] arr;
		arr = input(scan ,5);
		modify(scan ,arr);
	
		

	}
	public static int [] input(Scanner scan, int size) {
		int arr [] = new int [size];
		if( scan == null) {
			throw new NullPointerException("스캐너가 만들어지지 않았습니다.");	
		}
		System.out.print("정수를 " + size + "개 입력하세요 : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	
	public static void modify(Scanner scan, int []arr) {
		int m = 0, a;
		do{
			try {
			System.out.println("수정할 번지와 수정할 정수를 입력하세요 : ");
			m = scan.nextInt();
			a = scan.nextInt();
			arr [m] = a;
			System.out.println(Arrays.toString(arr));
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("잘못된 번지에 접근했습니다.");
			}
		}while(m >= 0);
		System.out.println("프로그램을 종료합니다.");
	}
}
