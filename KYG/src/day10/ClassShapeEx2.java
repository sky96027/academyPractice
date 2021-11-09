package day10;

public class ClassShapeEx2 {
	//타원을 나타내는 클래스를 생성하고, 타원 클래스의 객체를 만들고, 테스트 하세요.
	//사각형 클래스를 참고
	//클래스명 : Ellipse
	public static void main(String[] args) {
		Ellipse1 E1 = new Ellipse1(0, 0, 10, 20);
		E1.print();
		E1.move(5, 5);
		E1.print();
		E1.resize(10, 10);
		E1.print();
		Ellipse2 E2 = new Ellipse2(0, 0, 10, 10);
		E2.print();
		E2.move(10, 10);
		E2.print();
		E2.resize(5, 5);
		E2.print();
	}

}
