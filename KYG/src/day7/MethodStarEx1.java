package day7;

public class MethodStarEx1 {

	public static void main(String[] args) {
		/* ������ ����ϴ� �޼ҵ带 �����, ȣ���Ͽ� �׽�Ʈ�غ�����.
		 * *****
		 * *******
		 * -----*/
		printChar('*', 5);
		printChar('*', 7);
		printChar('-', 5);
		
	}
	/* ��� : ���ڰ� �־����� �־��� ���ڸ� �־��� Ƚ����ŭ ���ٿ� ����ϴ� �޼ҵ�
	 * �Ű����� : ����, Ƚ�� => char ch, int count
	 * ����Ÿ�� : void
	 * �޼ҵ�� : printChar */
	public static void printChar(char ch, int count) {
		for(int i = 1; i <= count; i++) {
			System.out.print(ch);
		}
		System.out.println();
		
	}

}
