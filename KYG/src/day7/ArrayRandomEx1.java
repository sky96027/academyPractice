package day7;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomEx1 {

	public static void main(String[] args) {
		/* 1 ~ 9������ ������ ���� 3�� �����Ͽ� �迭�� �����ϰ� ����ϴ� �ڵ带 �ۼ��ϼ���.*/
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
