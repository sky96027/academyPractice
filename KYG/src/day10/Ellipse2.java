package day10;

public class Ellipse2
{
	private int left, top, right, bottom;
	
	
	public Ellipse2(int left, int top, int right, int bottom) {
		super();
		this.left = left;
		this.top = top;
		this.right = right;
		this.bottom = bottom;
	}
	// 타원형 정보 출력 기능
	public void print() {
		System.out.println("---타원형---");
		System.out.println("좌상점 : " + left + "," + top);
		System.out.println("우하점 : " + right + "." + bottom);
		System.out.println("세로 : " + (bottom - top));
		System.out.println("가로 : " + (right - left));
		System.out.println("-----------");
	}
	//시작점 이동 기능
	public void move(int x, int y) {
		int width = right - left;
		int height = bottom - top;
		left = x;			top = y;
		right = x + width;	bottom = y + height;
	}
	//타원형 크기 변경 기능
	public void resize(int width, int height) {
		right = left + width; bottom = top + height;
	}
}
