package day10;

import java.lang.Math;

public class ClassStaticEx1 {

	public static void main(String[] args) {
		//에러 발생 : 객체를 생성하지 않고, 클래스를 통해 객체 변수를 호출했기 때문에
		//이 때 클래스 변수 num2는 생성이 되고, 객체변수 num1은 생성이 안됨
		Test1 t;
		//System.out.println("객체 변수 num1 : " + Test1.num1);
		System.out.println("클래스 변수 num1 : " + Test1.num2);
		Test1 t1 = new Test1();//num1 = 1. num2 = 2
		Test1 t2 = new Test1();//num1 = 1. num2 = 2
		t1.num1 = 20;
		t1.num2 = 40;
		System.out.println("t1 객체 변수 num1 : " + t1.num1);
		System.out.println("t1 클래스 변수 num1 : " + t1.num2);
		System.out.println("t2 객체 변수 num1 : " + t2.num1);
		System.out.println("t2 클래스 변수 num1 : " + t2.num2);
		System.out.println(Math.E);
		System.out.println(Math.PI);
		
	}

}

class Test1 {
	public int num1 = 1;			//객체 변수	
	public static int num2 = 2;		//클래스 변수
	public void print1() {			//객체 메소드
		System.out.println("num1 : " + num1); //객체메소드에 객체변수를 사용할 수 있다
		System.out.println("num2 : " + num2); //객체메소드에 클래스변수를 사용할 수 있다
		method1(); //객체메소드에 객체메소드를 사용할 수 있다
		method2(); //객체메소드에 클래스메소드를 사용할 수 있다
		System.out.println("객체 메소드");
	}
	public static void print2() {			//클래스 메소드
		//System.out.println("num1 : " + num1); //클래스메소드에 객체변수를 사용할 수 있다
		System.out.println("num2 : " + num2); //클래스메소드에 클래스변수를 사용할 수 있다
		//method1(); //클래스메소드에 객체메소드를 사용할 수 없다
		method2(); //클래스메소드에 클래스메소드를 사용할 수 있다
		System.out.println("클래스 메소드");
	}
	public void method1() {}		//객체 메소드
	public static void method2() {} //클래스 메소드
}
//객체 메소드는 모든 변수와 메소드를 호출할 수 있다.
//클래스 메소드는 클래스 변수와 클래스 메소드만 호출할 수 있다.
//Math 클래스는 대부분 클래스 메소드.
















