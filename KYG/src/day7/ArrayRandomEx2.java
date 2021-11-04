package day7;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandomEx2 {

	public static void main(String[] args) {
		/* 1 ~ 9 ������ ������ �� 3���� �迭�� �����Ͽ� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * �� �� ���� �ߺ����� �ʰ� �ۼ��ϼ���.*/
		int arr[] = new int[3];
		int min = 1, max = 3;
		int count = 0; //�ߺ����� ���� ���ڰ� ����� ����
		do {
			int random = (int)(Math.random()*(max - min + 1)) + min;
			int i;
			/* count�� 0�̸� �ݺ����� �ѹ��� ���� �ȵ�
			 * count�� 1�϶� �ߺ��� ���� ������ �ݺ��� ���� �� i�� 0
			 * count�� 3�ϴ� �ߺ��� ���� ������ �ݺ��� ���� �� i�� 0 or 1*/
			for(i = 0; i < count; i++) { //�迭�� �ߺ��� ���� �ִ��� Ȯ���ϴ� �ݺ���
				if(arr[i] == random) {
					break; //�ߺ��� ���� ������ �ݺ����� �ߴ�
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
