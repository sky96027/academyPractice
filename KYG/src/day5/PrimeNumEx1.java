package day5;

public class PrimeNumEx1 {

	public static void main(String[] args) {
		/* 2부터 100이하의 모든 소수를 출력하는 예제
		 * 소수 판별 예제 참고
		 */
		int i, j, count;
		for(i = 2; i <=100; i++) {
			for(count = 0, j = 1; j <= i; j++)
				if(i % j ==0) {
					count++;
				}
			if(count == 2) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		i = 2;
		while(i <= 100) {
			count = 0;
			j = 1;
			while(j <= i) {
				if(i % j == 0) {
					count++;
				}
				j++;
			}
			if(count == 2) {
				System.out.print(i + " ");
			}
			i++;
		}
			
	}

}
