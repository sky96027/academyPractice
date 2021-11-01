package day4;

public class ForLCMEx1 {

	public static void main(String[] args) {
		/* 두 정수의 최소 공배수를 구하는 코드를 for문을 이용하여 작성하세요.
		 * a의 배수 : 어떤 정수를 a로 나눴을대 나머지가 0인 수들
		 * 4의 배수 : 4, 8, 12 ,16 ,20, ...
		 * 공배수 : 두 정수의 배수 중 공통으로 있는 배수들
		 * 4와 6의 최소 공배수 : 12
		 */
		int i, num1, num2;
		for(i = 1, num1 = 4, num2 = 6; i > 0; i++ ) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(num1 + "과 " + num2 + "의 최소 공배수 : " + i);
				break;
			}			
		}
		/* 방법2 : num1부터 시작해서 num1 * num2까지 num1씩 증가
		 * 반복횟수 : num1부터 시작해서 num * num2까지 num1씩 증가
		 * 규칙성 : i가 num2의 배수이면 i를 출력하고 반복문을 종료
		 *훨씬 효율적인 코드 */
		for(i = num1; i <= num1 * num2; i += num1)
			if(i % num2 ==0) {
				System.out.println(num1 + "과 " + num2 + "의 최소 공배수 : " + i);
				break;
			}
	}

}
