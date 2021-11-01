package day4;

public class ForGCDEx2 {

	public static void main(String[] args) {
	/* 두 정수의 공약수들을 구하는 코드를 for문을 이용하여 작성하세요.
	 *  */

	int i;
	int num1 = 12;
	int num2 = 8 ;
	for(i = 1; i <= num1 ; i++ ) {
		if(num1 % i ==0 && num2 % i == 0) 
			System.out.print(i + " ");}
		}
	}

