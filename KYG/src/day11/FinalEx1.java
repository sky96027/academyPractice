package day11;

public class FinalEx1 {
	public final static double PI = 3.14; 

	public static void main(String[] args) {
		System.out.println(PI);
		//PI = 3.141592;//����� �����Ϸ� �߱� ������ ���� �߻�
	}
}

final class Test11_1{}
//Test11_1�� final Ŭ�����̱� ������ ��ӹ����� ��� ���� �߻�
//class Test11_2 extends Test11_1{}

class Test11_3{
	public final void print() {}
}
class Test11_4 extends Test11_3{
	//final �޼ҵ带 �������̵� �Ϸ� �߱� ������ ���� �߻�
	//public void print() {}
}
