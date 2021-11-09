package day10;

public class Ellipse1
{
	private int x, y; 			//중심점
	private int width, height;	//가로, 세로
	
	Ellipse1() {}

	public Ellipse1(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	// 타원형 정보 출력 기능
	public void print() {
		System.out.println("---타원형---");
		System.out.println("중심점 : " + x + "," + y);
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("-----------");
	}
	//시작점 이동 기능
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//타원형 크기 변경 기능
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}
}
