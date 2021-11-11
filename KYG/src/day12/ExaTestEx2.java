package day12;

public class ExaTestEx2 {

	public static void main(String[] args) {
		/* 사각형과 타원을 여러개 저장할 수 있는 배열을 만들어 보세요.
		 * 사각형과 타원을 합쳐서 최대 10개까지 저장하는 배열 */
		int size = 10;
		ExaShape shape [] = new ExaShape[size];
		ExaEllipse e1 = new ExaEllipse(0, 0, 10, 10);
		ExaRect r1 = new ExaRect(0, 0, 10, 10);
		shape [0] = e1;
		shape [1] = r1;
		shape [2] = new ExaRect(10, 20, 20, 30);
		shape [3] = new ExaShape(30, 10, 20, 10);
		//저장된 도형들을 그려보세요.
		//반복문을 이용하여 배열에 저장된 도형들을 콘솔에 출력해보세요(print()이용)
		for(int i = 0; i < shape.length; i++) {
			/*도형이 있으면 print()기능을 이용하여 출력하고,
			도형이 없으면 아무것도 안함
			도형이 없다가 null인 이유
			 -배열은 생성이 되면 타입에 맞는 초기값으로 초기화를 한다
			 -참조변수는 null로 초기화
			 -도형이 없다는 건 생성이 되어 저장된게 아니기 때문에 초기값
			 */
			if(shape [i] != null) {
				shape [i].print();
			}
		}
		/* 저장된 도형이 타원이면 testE()를 호출하고, 사각형이면 testR()을 호출하세요
		 * 반복문을 이용*/
		for(ExaShape tmp : shape) {
			if(tmp != null) {
				if(tmp instanceof ExaEllipse) {
					((ExaEllipse) tmp).testE();
				}
				if(tmp instanceof ExaRect) {
					((ExaRect) tmp).testR();
				}
			}
		}
		Print(shape);
	}
	/* 기능 : 매개변수가 사각형이면 사각형, 원이면 원, 도형이면 도형이라 출력하는 메소드
	 * 매개변수 : array
	 * 리턴타입 : void
	 * 메소드명 : Check*/
	
	public static void Print(ExaShape arr[]) {
		for(ExaShape tmp : arr) {
			if(tmp != null) {
				if(tmp instanceof ExaEllipse) {
					((ExaEllipse) tmp).testE();
				}
				else if(tmp instanceof ExaRect) {
					((ExaRect) tmp).testR();
				}
				else if(tmp instanceof ExaShape) {
					((ExaShape) tmp).testS();
				}
				else {
					System.out.println("도형이 아님");
				}
			}
		}
	}
}
















