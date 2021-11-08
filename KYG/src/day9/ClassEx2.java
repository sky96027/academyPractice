package day9;

public class ClassEx2 {

	public static void main(String[] args) {
		Point2D pt = new Point2D();
		pt.print();
		Point2D pt2 = new Point2D(3,4);
		pt2.print();
		pt2.move(10, 20);
		pt2.print();

	}

}
//��ǥ��鿡�� �� �ϳ��� ��Ÿ���� ���� Ŭ���� Point2D�� ��������.
/* Ŭ������ : Point2D
 * ������� : x, y ��ǥ
 * ����޼ҵ� 
 *  - ���� ��ǥ ������ ����ϴ� �޼ҵ�
 *  - ������ ��ǥ(������ �˷��� ��ǥ)�� �̵��ϴ� �޼ҵ�
 * ������
 *  - �⺻������ : x, y��ǥ�� 0���� �ʱ�ȭ
 *  - ������ �����ε� : �ۿ��� �˷��� ��ǥ�� x, y��ǥ�� �ʱ�ȭ
 * */
class Point2D {
	int x, y;
	
	Point2D() {
		x = 0; y = 0;
	}
	Point2D(int x1, int y1) {
		x = x1; y = y1;
	}
	//�Ű����� �ʿ���� => ���� �˷��� ��ǥ�� �ƴ�, �� x, y ��ǥ�� ����ؾ� �ϱ� ����
	void print() {
		System.out.println(x + "," + y);
	}
	/* ��� : ������ ��ǥ�� ������� x, y�� �̵���Ű�� �޼ҵ�
	 * �Ű����� : int
	 * ����Ÿ�� : void
	 * �޼ҵ�� : move
	 * */
	void move(int x1, int y1) {
		x = x1; y = y1;
	}
}
