package day11;
//���簢�� Ŭ���� : ���簢�� Ŭ������ ���
public class Square extends Rect {
	
	int side;
	
	public Square() {
	
		
		//lt�� �θ��� ������������� private�� �Ǿ� �־ 
		//���� �ޱ� ������ ���� ���� �Ұ�
		//lt�� ���� ���� => lt�� setter
		//lt = new Point(0, 0);
		//Point tmp = new Point(10, 10);
		//public���� �� setter�� �̿��Ͽ� lt�� �����ؾ���
		//setLt(tmp);
	}
	public Square(Point pt, int side) {
		//pt�� lt�� ����
		//setLt(pt); //lt�� �ۿ��� �˷��� pt�� ����
		Point tmp = new Point(pt);
		setLt(tmp);
		//side�� ������� side�� ����
		this.side = side;
	}
	public void resize(int side) {
		this.side = side;
	}
	@Override
	//Rect���� �������� print() �޼ҵ带 ������
	public void print() {
		System.out.println("---���簢��---");
		System.out.print("������ : ");
		//lt�� print ��� ȣ��
		//lt�� ���� ���� X => getter
		//lt.print();//���� ������ ��� ����
		getLt().print();
		System.out.println("�� ���� ���� : " + side);
		
	}
}
