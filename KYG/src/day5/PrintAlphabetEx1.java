package day5;

public class PrintAlphabetEx1 {

	public static void main(String[] args) {
		/*z부터 a까지 출력되도록 코드를 작성하세요.
		 * */
		char ch;
		for(ch = 'z'; ch >= 'a'; ch--) {
			System.out.print(ch + " ");
		}
		System.out.println();
		int i = 0;
		while(i < 26) {
			System.out.print((char)('z' - i) + " ");
			i++;
		}
	}

}
