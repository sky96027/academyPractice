package day12;

public class ExaShape {
	//도형 클래스 : 그림판에서 그려지는 모든 도형을 대표할 수 있는 클래스
	//day 10, Rect1, Rect2, Ellipse 클래스 참고
	//그림판 도형 공통점 : 대각선으로 생성

	protected int left; 	//왼쪽위 점의 x좌표
	protected int top;  	//왼쪽위 점의 y좌표
	protected int right;	//오른쪽아래 점의 x좌표
	protected int bottom; //오른쪽아래 점의 y좌표
	
	public ExaShape() {}

	
	public ExaShape(int x1, int y1, int x2, int y2) {
		left   = x1 < x2 ? x1 : x2;
		right  = x1 > x2 ? x1 : x2;
		top    = y1 < y2 ? y1 : y2;
		bottom = y1 > y2 ? y1 : y2;
		/*
		if (x1 < x2) {
			left = x1;
			right = x2;
		}
		else {
			left = x2;
			right = x1;
		}
		if (y1 < y2) {
			top = y1;
			bottom = y2;
		}
		else {
			top = y2;
			bottom = y1;
		}
		*/
	}
	//도형의 너비를 계산하는 기능
	public int getWidth() {
		return right - left;
	}
	public int getHeight() {
		return bottom - top;
	}
	public void move(int left, int top) {
		this.right = left + getWidth();
		this.bottom = top + getHeight();
		this.left = left;
		this.top = top;
	}
	/* 방향 : 1이면 우하방향, 2면 좌하 방향, 3이면 좌상방향, 4이면 우상방향*/
	public void resize(int width, int height, int direction) {
		if(width <= 0 || height <= 0) {
			System.out.println("잘못된 너비 또는 높이입니다.");
			return;
		}
		switch(direction) {

		case 1 : right  = left + width;
		 		 bottom = top + height;
		 		 break;
		case 2 : left   = right - width;
				 bottom = top + height;
				 break;
		case 3 : left  = right - width;
		 		 top = bottom - height;
		 		 break;
		case 4 : right  = left + width;
		 		 top = bottom - height;
		 		 break;
		default : System.out.println("잘못된 방향입니다.");
		 
		}
	}
	public void print() {
		System.out.println("-------도형-------");
		System.out.println("좌상점 : " + left + "," + top);
		System.out.println("우하점 : " + right + "," + bottom);
	}


	public void testS() {
		System.out.println("도형");
		
	}
}














