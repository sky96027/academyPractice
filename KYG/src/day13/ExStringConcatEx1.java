package day13;

public class ExStringConcatEx1 {
	
	public static void main(String[] args) {
		/* String concat(String str) : str을 문자열 뒤에 이어 붙여주는 메소드*/
		String str1 = "hello";
		str1 = str1 + "world";
		System.out.println(str1);
		
		String str2 = " hello";
		str2 = str2.concat("world");
		System.out.println(str2);
	}

}
