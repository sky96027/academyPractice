package day9;

public class MethodArithmeticEx1 {

	public static void main(String[] args) {
		/* �� ������ ��� �����ڰ� �־����� �� ���� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, �޼ҵ带 �̿��ϰ�, �����ڴ� ������ ��� �����ڸ� �Է��Ѵٰ� ����.
		 * +, -, *, /, % */
		int num1 = 1, num2 = 2;
		char op = '/';
		System.out.println("" + num1 + op + num2 + " = " + Am(num1, op, num2));
	}
	/* ��� : �� ������ ��� �����ڰ� �־����� �� ��� ���� ����� �˷��ִ� �޼ҵ�
	 * �Ű����� : �� ������ ��� ������ =>int num1, char op, int num2
	 * ����Ÿ�� : double
	 * �޼ҵ�� : Am */
	public static double Am(int num1, char op, int num2) {
		switch(op) {
		case '+' : return num1 + num2;
		case '-' : return num1 - num2;
		case '*' : return num1 * num2;
		case '/' : return num1 / (double)num2;
		case '%' : return num1 % num2;
		default : return 0;
		}
	}
	
}
