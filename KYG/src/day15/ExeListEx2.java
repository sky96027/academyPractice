package day15;

import java.util.ArrayList;

public class ExeListEx2 {

	public static void main(String[] args) {
		/* �ϳ��� ���� �̵��� ��ǥ�� �����Ϸ� �Ѵ� */
		ExePoint pt = new ExePoint(0,0);
		ArrayList<ExePoint> moveRoute = new ArrayList<ExePoint>();
		//���� �ʱ� ��ġ�� ����Ʈ�� ����
		moveRoute.add(new ExePoint(pt));
		pt.move(5, 5);
		//���� 5,5�� �̵��� �� ��ġ�� ����Ʈ�� ����
		moveRoute.add(new ExePoint(pt));
		pt.move(10, 10);
		moveRoute.add(new ExePoint(pt));
		System.out.println(moveRoute);
		System.out.println(pt + "��ǥ�� list�� �ֽ��ϱ�? : " + moveRoute.contains(pt));
		System.out.println(pt + "��ǥ�� list�� �ֽ��ϱ�? : " + moveRoute.indexOf(pt));
	}
}

class ExePoint{
	int x, y;
	
	public ExePoint(int x, int y) {
		this.x = x;		this.y = y;
	}
	public ExePoint(ExePoint p) {
		x = p.x;	y = p.y;
	}
	public void move(int x, int y) {
		this.x = x;		this.y = y;
	}
	@Override
	public String toString() {
		return "("+ x + "," + y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExePoint other = (ExePoint) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
}