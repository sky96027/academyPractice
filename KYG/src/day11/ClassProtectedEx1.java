package day11;

public class ClassProtectedEx1 {
	public static void main(String[] args) {
		C c = new C();
		c.a = 1; //�������
		c.b = 2; //���� + ���� ��Ű�� + �ڽ�Ŭ����
		c.c = 3; //���� + ���� ��Ű��
		//c.d = 4; //�ش� Ŭ������ ������ ����.
		
	}
}

class P {
	public int a;
	protected int b;
	int c;
	private int d;
	
}
class C extends P {
	public C() {
		a = 1; //��� ����
		b = 2; //���� ��Ű���̸鼭 �ڽ� Ŭ�������� ����
		c = 3;
		//d = 4; //pŬ���� ���� �ƴϱ� ������ �Ұ���
	}
}
