package day4;

public class ForSumEx1 {

	public static void main(String[] args) {
		/* 1부터 10까지 합을 구하는 코드를 for문을 이용하여 작성하세요.
		 */
		int i, sum;
		for(i = 1, sum = 0; i < 11 ; i++) {
			sum = sum + i;
					
		}
		System.out.print("1부터 10까지 합 : " + sum);
	}

}
