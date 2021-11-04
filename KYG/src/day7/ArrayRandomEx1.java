package day7;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomEx1 {

	public static void main(String[] args) {
		/* 1 ~ 9사이의 랜덤한 수를 3개 생성하여 배열에 저장하고 출력하는 코드를 작성하세요.*/
		int arr[] = new int[3];
		int min = 1, max = 9;
		Random r = new Random();
		for(int i = 0; i < 3; i++) {
			int random = r.nextInt(max - min + 1) + min;
			arr[i] = random;
		}
		System.out.println(Arrays.toString(arr));

	}

}
