package day13;

public class ExgStringContainsEx1 {

	public static void main(String[] args) {
		/* boolean contains(CharSequence s) : ���ڿ��� s �� ���Եƴ��� �˷��ִ� �޼ҵ� */
		String str1 = "Hello world";
		System.out.println(str1.contains("wo"));
		System.out.println(str1.contains("He"));
		System.out.println(str1.contains("Hi"));
	}

}
