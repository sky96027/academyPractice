package day14;

public class ExdExceptionEx1 {

	public static void main(String[] args) {
		/* 예외1 : ArithmeticException*/
		int num1 = 1, num2 = 0;
		//int res = num1 / num2;
		//System.out.println(num1 + " / " + num2 + " = " + res );
		//1.0 / 0은 예외 발생하지 않음
		double res2 =(double) num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + res2);
		
		/* 예외2 : ArrayIndexOutOfBoundsException*/
		int [] arr = new int[3];
		//arr [3] = 0;
		
		/* 예외3 : NullPointerException*/
		String str = null;
		// System.out.println(str.contains("Hello"));

	}

}
