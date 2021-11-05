package day8;

import java.util.Arrays;

public class MethodRandomArrayEx1 {

	public static void main(String[] args) {
		/* 1에서 45사이의 랜덤한 수를 6개 생성하여 배열에 저장하고, 출력하는코드를 작성하세요.
		 * 메소드를 생성하고 호출할 것, 중복가능*/
		
		random1(1, 45);
		
		int arr2[] = new int[6];
		random2(arr2, 1, 45);
		System.out.println(Arrays.toString(arr2));
		
		int arr3[] = random3(1, 45, 6);
		System.out.println(Arrays.toString(arr3));
	}

	public static void random1(int min, int max) {
		int arr1 [] = new int[6];
		for(int i = 0; i < 6; i++) {
			int random = (int)(Math.random()*(max - min + 1) + min);
			arr1[i] = random;
		}
		System.out.println(Arrays.toString(arr1));
	}
	/* 기능 : 배열이 주어지면 주어진 배열에 min에서 max사이의 랜덤한 수를 생성하여 저장하는 메소드
	 * 매개변수 : int array, int min, int max
	 * 리턴타입 : void
	 * 메소드명 : random2
	 * */
	public static void random2(int arr[], int min, int max) {
		for(int i = 0; i < 6; i++) {
			int random = (int)(Math.random()*(max - min + 1) + min);
			arr[i] = random;
		}
		
	}
	/* 기능 : 배열이 크기가 주어지면 주어진 배열의 크기만큼 min에서 max사이의 랜덤한 수를 생성하여 저장한 후
	 * 		 만들어진 배열을 알려주는 메소드 메소드
	 * 매개변수 : int min, int max, int size
	 * 리턴타입 :	int []
	 * 메소드명 :	random3
	 */
	public static int[] random3(int min, int max, int size) {
		int arr[] = new int[size];
		for(int i = 0; i < size; i++) {
			int random = (int)(Math.random()*(max - min + 1) + min);
			arr[i] = random;
		}
		return arr;
	}
}
