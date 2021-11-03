package day6;

public class ArraySumEx1 {

	public static void main(String[] args) {
		/* 1부터 10사이의 짝수들을 배열에 저장하고, 배열에 저장된 값의 합을 출력하는 코드를 작성하세요.
		 * 
		 */
		int arr[] = new int[5];
		int j = 0, i;
		for(i = 2; i <= 10; i++) {
			if(i % 2 == 0) {
				arr[j] = i;
				j++;
			}			
		}
		j = 0;
		for(i = 2; i <= 10; i = i + 2) {
			arr[j] = i;
			j++;
		}	
		int sum = 0;
		for(j = 0; j < 5; j++) {
		 sum = sum + arr[j];
		}
		System.out.println("2부터 10까지 합 : " + sum);
	}

}
