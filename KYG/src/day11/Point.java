package day11;

//2���� ��ǥ ����� �� �ϳ��� ��Ÿ���� Ŭ����
public class Point {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	//���������
	public Point(Point pt) {
		this.x = pt.x;
		this.y = pt.y;
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//��ǥ �̵� ���
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//��ǥ�� ����ϴ� ���
	public void print() {
		System.out.println("(" + x + " , " + y + ")");
	}

	
	
	
}
