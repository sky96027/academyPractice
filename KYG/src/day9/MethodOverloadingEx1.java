package day9;

public class MethodOverloadingEx1 {

	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1.2, 2.5));
		System.out.println(sum(1, 2.5));


	}
	public static int sum(int num1, int num2) {
		System.out.println("�޼ҵ�1");
		return num1 + num2;
	}
	//�Ű������� ������ �ٸ����
	public static int sum(int num1, int num2, int num3) {
		System.out.println("�޼ҵ�2");
		return num1 + num2 + num3;
	}
	//�Ű������� Ÿ���� �ٸ����
	public static double sum(double num1, double num2) {
		System.out.println("�޼ҵ�3");
		return num1 + num2;
	}
	//�ȵǴ� ��� : ����Ÿ�Ը� �ٸ����
	/*public static double sum(int num1, int num2) {
		return num1 + num2;
	}*/
}
