package day6;

public class ArrayForEx1 {

	public static void main(String[] args) {
		/**/
		int arr[] = new int[5];
		int i, sum;
		for(i = 0; i < 5; i++) {
			arr[i] = 2 * i + 2;
		}
		sum = 0;
		for(int tmp : arr) {
			System.out.println(tmp);
			sum += tmp;
		}
		System.out.println("2부터 10까지의 합 : " + sum);
	}

}
