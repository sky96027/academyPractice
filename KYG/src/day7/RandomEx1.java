package day7;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		/* �������� ���ϴ� ������ ������ ����� ����
		 * Math.random() : 0�̻� 1�̸��� ������ �Ǽ��� ����
		 * 0 <= Math.random() < 1
		 * 0 <= Math.random() * (max - min + 1) < max - min + 1
		 * min <= Math.random() * (max - min + 1) + min < max + 1*/
		int min = 5, max = 10;
		for(int i = 0; i < 5; i++) {
			int random = (int)(Math.random()*(max - min + 1)) + min;
			System.out.print(random + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		/* Random Ŭ�������� �����ϴ� nextInt(����) : 0 �̻� ���� �̸��� ������ ������ ����
		 * 0 <= nextInt(max - min + 1) < max - min + 1
		 * min <= nextInt(max - min + 1) + min < max + 1*/
		Random r = new Random();
		for(int i = 0; i < 5; i++) {
			int random = r.nextInt(max - min + 1) + min;
			System.out.print(random + " ");
		}
	}

}
