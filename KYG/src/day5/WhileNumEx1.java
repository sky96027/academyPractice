package day5;

public class WhileNumEx1 {

	public static void main(String[] args) {
		/* 1부터 5까지 출력하는 코드를 while문으로 작성하세요.
		 * 
		 */
		int i;
		i = 1;
		for(i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		i = 1;
		System.out.println();
		while(i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		
		}
	}


