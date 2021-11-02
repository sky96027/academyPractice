package day5;

public class StarEx3 {

	public static void main(String[] args) {
		/*       *
		 *      **
		 *     *** 
		 *    ****
		 *   *****
		 *   위와 같이 출력되도록 코드를 작성하세요. 
		 * */
		int i, j;
		for(i = 5; i >= 1; i--) {
			for(j = 1; j <=5 ; j++) {
				if(i > j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		//강사님 답안
		/*       *  i = 1 공백 = 4 * = 1
		 *      **  i = 2 공백 = 3 * = 1
		 *     ***  i = 3 공백 = 2 * = 1
		 *    ****  i = 4 공백 = 1 * = 1
		 *   *****  i = 5 공백 = 0 * = 1
		 * 			공백= 5 - i * = i
		 */
		int num = 5;
		for(i = 1; i <= num; i++) {
			for(j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for(j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
