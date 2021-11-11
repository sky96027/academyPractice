package day12;

public class ExbEqualsEx2 {

	public static void main(String[] args) {
		// 문자열 비교해보기
		// 문자열을 초기화할 때
		String str1 = "Hello";
		String str2 = new String( "Hello" );
 		String str3 = "Hello";
		if(str1 == str2) {
			System.out.println(" == : 두 문자열이 같다");
		}
		else {
			System.out.println(" == : 두 문자열이 다르다");
		}
		if(str1 == str3) {
			System.out.println(" == : 두 문자열이 같다");
		}
		else {
			System.out.println(" == : 두 문자열이 다르다");
		}
		
		System.out.println();
		
		//equals와 비교
		if(str1.equals(str2)) {
			System.out.println(" == : 두 문자열이 같다");
		}
		else {
			System.out.println(" == : 두 문자열이 다르다");
		}
		if(str1.equals(str3)) {
			System.out.println(" == : 두 문자열이 같다");
		}
		else {
			System.out.println(" == : 두 문자열이 다르다");
		}
	}

}






















