package day7;

import java.util.Arrays;

public class MethodArrayEx1 {

	public static void main(String[] args) {
		// �Ű������� ���������� ��� => �Ű������� �迭�� ���
		int [] arr = {3, 2, 1};
		printArray(arr);
		sortArray(arr);
		printArray(arr);
		initArray(arr);
		printArray(arr);
		
	}
	/* ��� : ������ �迭�� �־����� �ش� �迭�� ��� ���� ���ٷ� �ֿܼ� ����ϴ� �޼ҵ�
	 * �Ű����� : ������ �迭 => int [] arr
	 * ����Ÿ�� : void
	 * �޼ҵ�� : printArray*/
	public static void printArray(int []arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//arr[0] = 10; // �� �ڵ带 Ȱ��ȭ�ϸ� ���� �迭�� ���� �����
	}
	/* ��� : ������ �迭�� �־����� �־��� �迭�� ��� ���� 0���� �ʱ�ȭ �ϴ� �޼ҵ�
	 * �Ű����� : int [] arr
	 * ����Ÿ�� : void
	 * �޼ҵ�� : initArray*/
	public static void initArray(int []arr) {
		for(int i = 0; i  < arr.length; i++) {
			arr[i] = 0;
		}
	}
	/* ��� : ������ �迭�� �־����� �־��� �迭�� �����ϴ� �޼ҵ�
	 * �Ű����� : int [] arr
	 * ����Ÿ�� : void
	 * �޼ҵ�� : sortArray*/
	public static void sortArray(int [] arr) {
		for(int i= 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j + 1]) { // �ε�ȣ�� �ٲ��ָ� �������� �������� ���� ����
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}
}
