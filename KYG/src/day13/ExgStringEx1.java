package day13;

public class ExgStringEx1 {

	public static void main(String[] args) {
		String str1 = "Hi";
		String str2 = new String("Hi");
		String str3 = "Hi";
		/* str1�� str3�� A ������ �ִ� Hi��� ���ڿ��� ����
		 * str2�� B������ �ִ� Hi��� ���ڿ��� ���*/
		System.out.println("str1�� str2�� �ּҰ� ����?" + (str1 == str2));
		System.out.println("str1�� str3�� �ּҰ� ����?" + (str1 == str3));
		System.out.println("str2�� str3�� �ּҰ� ����?" + (str2 == str3));
		
		System.out.println("-----------------------------------");
		
		System.out.println("str1�� str2�� ���ڿ��� ����?" + str1.equals(str2));
		System.out.println("str1�� str2�� ���ڿ��� ����?" + str1.equals(str3));
		System.out.println("str1�� str2�� ���ڿ��� ����?" + str2.equals(str3));
	}

}
