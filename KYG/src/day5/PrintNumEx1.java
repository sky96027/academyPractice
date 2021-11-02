package day5;

public class PrintNumEx1 {

	public static void main(String[] args) {
		/* 다음과 같이 출력하도록 코드를 작성하세요.
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		int i;
		for(i = 1; i <=9; i++) {
			System.out.print(i + " ");
			if(i % 3 ==0) {
				System.out.println();
			}
		}
		int j, c; //c = count
		j = 0;
		c = 1;
		while(j <=8) {
			j++;
			if(c <= 3) {
				System.out.print(j + " ");
				c++;
			}
			else {
				System.out.println();
				c = 1;
				j--;
			}
		}
		System.out.println();
		for(i = 1; i <= 3; i++) {
			for(j = 3 * i - 2; j <= 3 *i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}


