package day7;

public class MethodSumEx1 {

	public static void main(String[] args) {
		int num = sum(1, 2);
		System.out.println(num);
		System.out.println(sum(1, 2));
		int a = 1, b = 2;
		System.out.println(sum(a,b));
		
		sum2(4, 5);
	}
		/* ��� : �� ������ ���� �˷��ִ� �޼ҵ�
		 * �Ű����� : �� ���� => int num1, int num2
		 * ����Ÿ�� : �� ������ �� => ���� => int
		 * �޼ҵ�� : sum*/
		public static int sum(int num1, int num2) {
			int result = num1 + num2;
			return result;
		}
		/* ��� : �� ������ ���� �ֿܼ� ����ϴ� �޼ҵ�
		 * �Ű����� : �� ����
		 * ����Ÿ�� : ���� => void
		 * �޼ҵ�� : sum2*/
		public static void sum2(int num1, int num2) {
			int result = num1 + num2;
			System.out.println(result);
		}
}
