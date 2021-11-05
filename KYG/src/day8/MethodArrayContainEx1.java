package day8;

import java.util.Arrays;

public class MethodArrayContainEx1 {

	public static void main(String[] args) {
		/* 배열이 다음과 같이 주어지고, 정수가 주어졌을 때 정수가 배열에 있는 값인지 아닌지 확인하는 메소드를 정의하고
		 * 호출하여 확인하세요.
		 * 배열에 1 ~ 45 사이의 랜덤한 수를 생성하여 6개짜리 배열에 저장하는 코드를 작성하세요.
		 * 단, 중복 불가, 메소드 이용 */
		int [] lotto = {5, 18, 23, 35, 40, 1};
		int num =35;
		if(check1(num, lotto)) {
			System.out.println(num + "는 배열에 있다.");
		}
		else {
			System.out.println(num + "는 배열에 없다.");
		}
		if(check2(num, lotto,4)) {
			System.out.println(num + "는 배열에 있다.");
		}
		else {
			System.out.println(num + "는 배열에 없다.");
		}
		int lotto2 [] = NoOverlapRandom(1, 45, 6);
		System.out.println(Arrays.toString(lotto2));

	}
	/* 기능 : 중복확인
	 * 매개변수 : int num, int arr[]
	 * 리턴타입 : boolean
	 * 메소드명 : cheak1
	 * */
	public static boolean check1(int num, int arr[]) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
		
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
	
}
