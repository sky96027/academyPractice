package day14;

public class ExcParseEx1 {

	public static void main(String[] args) {
		/* 정수를 문자열로 만드는 예제*/
		int num =10;
		String str = "" + num;
		System.out.println("정수 num : " + num);
		System.out.println("문자열 str : " + str);
		//래퍼 클래스인 Integer에서 제공하는 parseInt라는 메소드 이용
		str = "1234";
		num = Integer.parseInt(str);
		System.out.println("정수 num : " + num);
		System.out.println("문자열 str : " + str);
		
		//문자열을 정수로 바꿀 때 바꿀 수 없는 문자열이 있을때
		//NumberFormatException 발생
		num = Integer.parseInt("123.45");
		num = Integer.parseInt("예외 발생");

	}

}
