package day11;


public class ClassSuperEx1 {

	public static void main(String[] args) {
		Child1 c1 = new Child1(1,2,3);
		c1.print();

	}

}
class Parent1 {
	private int x, y;
	void print() {
		System.out.println("Ŭ���� �Դϴ�.");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
	public Parent1(int x, int y) {
		this.x = x; this.y = y;
		
	}
	
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

}

class Child1 extends Parent1 {
	private int z;
	
	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;
	}


	public Child1(int x, int y, int z) {
		//�θ𿡰� �������� x,y�� �Ű����� x,y������ �����Ϸ� �ϴµ�
		//setter�� �̿��� �� ������ �θ� Ŭ������ �ִ� �����ڸ� �̿��ϴ°� ����
		super(x,y);
		this.z = z;
		
	}
	/* Ŭ���� �ȿ� ��� ����, �޼ҵ�, �����ڰ� �ϳ��� ������
	 * �ڵ����� �⺻ �����ڰ� �����ǰ�,
	 * �⺻ ������ �ȿ� �θ� Ŭ������ �⺻ �����ڰ� ȣ��ȴ�.
	 * �� ��, �θ� Ŭ������ �⺻ �����ڰ� ���� ��� ȣ���� �� ����� ������ �߻�*/
	//public Child1() {}
	
	@Override
	public void print() {
		//�θ� �ִ� print�� �̿��Ͽ� x,y�� ����ϰ� �޺κ��� ���� ���
		super.print();
		System.out.println("z : " + z);
	}
}





















