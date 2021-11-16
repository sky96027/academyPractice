package day15;

import java.util.Arrays;
import java.util.Scanner;

public class ExcExceptionEx1 {

	public static void main(String[] args) {
		/* ���� 5��¥�� �迭�� ������ 5�� �Է¹޾� ������ �� ���ϴ� ������ ������ �����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ����
		 * ������ �Է��ϼ��� : 1 2 3 4 5
		 * ������ ������ ������ �Է��ϼ��� : 0
		 * */
		Scanner scan = new Scanner(System.in);
		int [] arr;
		arr = input(scan ,5);
		modify(scan ,arr);
	
		

	}
	public static int [] input(Scanner scan, int size) {
		int arr [] = new int [size];
		if( scan == null) {
			throw new NullPointerException("��ĳ�ʰ� ��������� �ʾҽ��ϴ�.");	
		}
		System.out.print("������ " + size + "�� �Է��ϼ��� : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	
	public static void modify(Scanner scan, int []arr) {
		int m = 0, a;
		do{
			try {
			System.out.println("������ ������ ������ ������ �Է��ϼ��� : ");
			m = scan.nextInt();
			a = scan.nextInt();
			arr [m] = a;
			System.out.println(Arrays.toString(arr));
			}catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("�߸��� ������ �����߽��ϴ�.");
			}
		}while(m >= 0);
		System.out.println("���α׷��� �����մϴ�.");
	}
}
