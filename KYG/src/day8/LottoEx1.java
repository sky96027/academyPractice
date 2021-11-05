package day8;

import java.util.Arrays;
import java.util.Scanner;

public class LottoEx1 {

	public static void main(String[] args) {
		//1 ~ 45사이의 중복되지 않은 7개의 로또 번호와 1개의 보너스 번호를 생성 
		//당첨번호 출력
		
		
		int lotto [] = NoOverlapRandom(1, 45, 6);
		int bonus = bonus(lotto);
		System.out.print(Arrays.toString(lotto) + " ");
		System.out.println("보너스 번호 : " + bonus);
		
		//사용자가 1 ~ 45사이의 숫자 6개를 중복되지 않게 콘솔에서 입력
		
		
		int [] user = new int [lotto.length];
		Scanner scan = new Scanner(System.in);
		System.out.print("사용자 : ");
		for(int i = 0; i < lotto.length; i++) {
			user[i] = scan.nextInt();	
		}
		System.out.print("보너스 번호 : ");
		int userbonus = scan.nextInt();
		System.out.println(Arrays.toString(user) + "보너스 번호 : " + userbonus);
		
		
		//등수를 출력
		/* 1등 : 당첨번호 6개 전부 일치
		 * 2등 : 당첨번호 5개와 보너스 번호 일치
		 * 3등 : 당첨번호 5개 일치
		 * 4등 : 당첨번호 4개 일치
		 * 5등 : 당첨번호 3개 일치
		 * 꽝 : 나머지*/
		
		
		rank(user, lotto, userbonus, bonus);
		

	}
	/* 기능 : 배열 arr와 정수 num가 주어지면 배열에서 0번지부터 n중에 num가 있는지 알려주는 메소드
	 * 매개변수 : int arr[], int num, int n
	 * 리턴타입 : boolean
	 * 메소드명 : cheak2*/
	public static boolean check2(int num, int arr[], int n) {
		//배열의 길이보다 검사하는 갯수가 많으면 검사 갯수를 배열의 길이로,
		//아니면 원래 검사 개수로 변경 (코드가 안정적으로 돌아감)
		n = arr.length < n ? arr.length : n;
		for(int i = 0; i < n; i++) {
			if(arr[i] == num) {
				return true;
			}
		}
		return false;
	}
	/* 기능 : 중복이 없는 1 ~ 45 사이의 랜덤한 수를 생성하여 배열에 저장
	 * 매개변수 : int min, int max, int size
	 * 리턴타입 : void
	 * 메소드명 : NoOverlapRandom*/
	public static int[] NoOverlapRandom(int min, int max, int size) {
		int arr[] = new int[size];
		for(int count = 0; count < size; ) {
			int random = (int)(Math.random()*(max - min + 1) + min);
			//중복체크
			if(!check2(random, arr, count)) {
				arr[count++] = random;
			}
		}
		return arr;
	}
	/* 기능 : 보너스번호 생성
	 * 매개변수 : 중복 확인을 위해 int lotto[]
	 * 리턴타입 : int
	 * 메소드명 : bonus
	 * */
	public static int bonus(int lotto[]) {
		int bonus = 0;
		while(true) {
			bonus = (int)(Math.random()*(45 - 1 + 1) + 1);
			for(int i = 0; i < lotto.length; i++) {
				if(bonus == lotto[i]) {
					continue;		
				}
			}
			return bonus;
		}
	}
	/* 기능 : 등수 확인
	 * 매개변수 : user[], lotto[2], int userbonus, int bonus
	 * 리턴타입 : void
	 * 메소드명 : check*/
	public static void rank(int user[], int lotto[], int userbonus, int bonus) {
		int count = 0;
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(user[i] == lotto[j]) {
				count++;	
				}
			}
		}
		if(count == 6) {
			System.out.println("1등");	
		}
		if(userbonus == bonus) {
			if(count == 5) {
				System.out.println("2등");
			}	
		}
		if(count == 5) {
			if(bonus != userbonus) {
				System.out.println("3등");
			}	
		}
		if(count == 4) {
			System.out.println("4등");
		}
		if(count == 3) {
			System.out.println("5등");
		}
		if(count < 3) {
			System.out.println("꽝");
		}
	
	}
}
