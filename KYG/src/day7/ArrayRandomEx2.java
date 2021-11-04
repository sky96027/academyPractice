package day7;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomEx2 {

	public static void main(String[] args) {
		/* 1 ~ 9 사이의 랜덤한 수 3개를 배열에 저장하여 출력하는 코드를 작성하세요.
		 * 단 세 수가 중복되지 않게 작성하세요.*/
		int arr[] = new int[3];
		int min = 1, max = 3;
		int count = 0; //중복되지 않은 숫자가 저장된 갯수
		do {
			int random = (int)(Math.random()*(max - min + 1)) + min;
			int i;
			/* count가 0이면 반복문이 한번도 실행 안됨
			 * count가 1일때 중복된 수가 있으면 반복문 종료 후 i는 0
			 * count가 3일대 중복된 수가 있으면 반복문 종료 후 i는 0 or 1*/
			for(i = 0; i < count; i++) { //배열에 중복된 값이 있는지 확인하는 반복문
				if(arr[i] == random) {
					break; //중복된 수가 있으면 반복문을 중단
				}
			}
			if (i == count) {
				arr[i] = random;
				count++;
			}
		}while(count != 3);
		System.out.println(Arrays.toString(arr));
		
	}

}
