package day7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBaseballEx3 {

	public static void main(String[] args) {
		int [] com = new int [3];
		int i;
		
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 9;
		int count = 0; //중복되지 않은 숫자가 저장된 갯수
		do {
			int random = (int)(Math.random()*(max - min + 1)) + min;
			/* count가 0이면 반복문이 한번도 실행 안됨
			 * count가 1일때 중복된 수가 있으면 반복문 종료 후 i는 0
			 * count가 3일대 중복된 수가 있으면 반복문 종료 후 i는 0 or 1*/
			for(i = 0; i < count; i++) { //배열에 중복된 값이 있는지 확인하는 반복문
				if(com[i] == random) {
					break; //중복된 수가 있으면 반복문을 중단
				}
			}
			if (i == count) {
				com[i] = random;
				count++;
			}
		}while(count != 3);
		
		int [] user = new int [3];
		int sc = 0; //strike count
		int bc = 0; //ball count

		do {
			sc = 0;
			bc = 0;
			System.out.print("사용자 : ");
			for(i = 0; i < user.length; i++) {
				user[i] = scan.nextInt();
			}
		
			for(i = 0; i < com.length; i++) {
				if(com[i] == user[i]) {
					sc++;
				}
			}
	
			for(i = 0; i < com.length; i++) {
				for(int j = 0; j < user.length; j++) {
					if(i == j) {
						continue;
					}
					if(com[i] == user[j]) {
						bc++;
					}
				}
			}

			if(sc > 0 && bc == 0) {
				System.out.println(sc + "S");
			}
			if(sc == 0 && bc > 0) {
				System.out.println(bc + "B");
			}
			if(sc > 0 && bc > 0) {
				System.out.println(sc + "S" + bc + "B");
			}
			if(sc == 0 && bc == 0) {
				System.out.println("3O");
			}
			
			
		}	while(sc !=3);

			System.out.println("프로그램을 종료합니다.");
		scan.close();
	}

}
