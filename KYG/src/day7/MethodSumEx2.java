package day7;

import java.util.Scanner;

public class MethodSumEx2 {

	public static void main(String[] args) {
		/* 1���� 10���� ���� ����ϴ� �ڵ带 �޼ҵ带 �̿��Ͽ� �ۼ��غ�����.*/
		int begin, end;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		begin = scan.nextInt();
		System.out.print("�� ������ �Է��ϼ��� : ");
		end = scan.nextInt();
		sum1(begin, end); //���� �ڵ�
		
		sum2(); //����� ���� (������� �ſ� ���� �ڵ�)
		
		sum3(10); //2���ٴ� ������ ���������� �ٲ��� ����
		
		sum4(1,10); //���������� �ٲ� �� ���� ������ ������� ����
		
		begin = 10;
		end = 1;
		System.out.println(begin + "���� " + end + "������ �� : " + sum5(begin, end));
		
		
	}
	/* ��� : 1���� 10������ ���� �ֿܼ� ����ϴ� �޼ҵ�
	 * �Ű����� : num1 num2
	 * ����Ÿ�� : void
	 * �޼ҵ�� : sum1*/
	public static void sum1(int num1, int num2) {
		int sum = 0;
		for(int i = num1; i <= num2; i++) {
			sum = sum + i;
		}
		
		int result = sum;
		System.out.println(num1 + "�� " + num2 + "������ �� : " + result);
	}
	/* ��� : 1���� 10������ ���� �ֿܼ� ����ϴ� �޼ҵ� (1�� 10�� ����)
	 * �Ű����� : ����
	 * ����Ÿ�� : void
	 * �޼ҵ�� : sum2*/
	public static void sum2() {
		int begin = 1, end = 10;
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		System.out.println(begin + "���� " + end + "������ �� : " + sum);
	}
	/* ��� : 1���� end���� ���� �ֿܼ� ����ϴ� �޼ҵ�
	 * �Ű����� : int end
	 * ����Ÿ�� : void
	 * �޼ҵ�� : sum3*/
	public static void sum3(int end) {
		int begin = 1;
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		System.out.println(begin + "���� " + end + "������ �� : " + sum);
	}
	/* ��� : 1���� end���� ���� �ֿܼ� ����ϴ� �޼ҵ�
	 * �Ű����� : int begin, int end
	 * ����Ÿ�� : void
	 * �޼ҵ�� : sum4*/
	public static void sum4(int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		System.out.println(begin + "���� " + end + "������ �� : " + sum);
	}
	public static int sum5(int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}

