package day13;

public class ExgStringLengthEx1 {

	public static void main(String[] args) {
		/* int length() : ���ڿ� ���̸� �˷��ִ� �޼ҵ�*/
		String str = "Hello world";
		System.out.println(str + "�� ���ڿ� ���� : " + str.length());
		
		/* String toString() : ���ڿ� ��ü�� ��ȯ*/
		System.out.println(str.toString());
		System.out.println(str);
		
		/* ���ڿ��� � �ִ��� Ȯ���ϴ� ����*/
		String str1 = "aaabsasseqq";
		String search = "ab";
		int index = 0;
		int count = 0;
		do {
			index = str1.indexOf(search, index);
			if(index >= 0) {
				count ++;
				index = index + search.length();
			}
		}while(index != -1);
		System.out.println(str1 + "�� " + search + "�� ���� : "  + count);
	}

}
