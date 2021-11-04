package day7;

public class MethodGCDEx1 {

	public static void main(String[] args) {
		/* �ִ� ������� ���ϴ� �޼ҵ带 �����ϰ�, ȣ���Ͽ� �ִ� ������� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * �ּ� ������� ���ϴ� �޼ҵ带 �����ϰ�, ȣ���Ͽ� �ּ� ������� ����ϴ� �ڵ带 �ۼ��ϼ���.*/
		int num1 =12, num2 = 8;
		int result = gcd(num1, num2);
		System.out.println(num1 + "�� " + num2 + "�� " + "�ִ� ����� : " + result);
		result = lcm1(num1, num2);
		System.out.println(num1 + "�� " + num2 + "�� " + "�ּ� ����� : " + result);
		result = lcm2(num1, num2);
		System.out.println(num1 + "�� " + num2 + "�� " + "�ּ� ����� : " + result);
	}
	/* ��� : �� ������ �־����� �� �� ������ �ִ� ������� ����Ͽ� �˷��ִ� �޼ҵ�
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : �� ������ �ִ� ����� =? int
	 * �޼ҵ�� : gcd
	 * */	
	public static int gcd(int num1, int num2) {
		int i, gcd = 0;
		for(i = 1; i <= num1 ; i++ ) {
			if(num1 % i ==0 && num2 % i == 0) 
				gcd = i;
				
			}
		return gcd;
		
		
	}
	/* ��� : �� ������ �־����� �� �� ������ �ִ� ������� ����Ͽ� �˷��ִ� �޼ҵ�
	 * �Ű����� : �� ���� => int num1, int num2
	 * ����Ÿ�� : �� ������ �ּ� ����� => int
	 * �޼ҵ�� : lcm1
	 * */
	public static int lcm1(int num1, int num2) {
		int lcm = 0;
		for(int i = 1; i > 0; i++ ) {
			if(i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
	
		}
		return lcm;
	}
	public static int lcm2(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
}