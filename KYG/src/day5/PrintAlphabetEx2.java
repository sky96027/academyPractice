package day5;

public class PrintAlphabetEx2 {

	public static void main(String[] args) {
		/* a
		 * ab
		 * abc
		 * abcd
		 * ...
		 * abcd...xyz�� ��µǵ��� �ڵ带 �ۼ��ϼ���.
		 * */
		char ch1 = 'a';
		char ch2 = 'a';
		while(ch1 <= 'z') {
			ch2 = 'a';
			while(ch2 <= ch1) {
				System.out.print(ch2);
				ch2++;
			}
			System.out.println();
			ch1++;
		}
		for(ch1 = 'a'; ch1 <= 'z'; ch1++) {
			for(ch2 = 'a'; ch2 <= ch1; ch2++) {
				System.out.print(ch2);
			}
			System.out.println();
		}

	}

}
