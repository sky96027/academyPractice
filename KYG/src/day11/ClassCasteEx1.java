package day11;

public class ClassCasteEx1 {

	public static void main(String[] args) {
		/* �Ϲ������� = �� �������� ���ʰ� �������� ���� Ÿ���̾�� �Ѵ�.
		 * ���� Ÿ�� : ���� �ڷ��� �Ǵ� ���� Ŭ����*/
		int num = 2;
		P2 p1 = new P2();
		P2 p2 = p1;
		/* ��Ȳ�� ���󼭴� =�� �������� Ÿ���� ���� �ʾƵ� �ڵ����� ��ȯ�Ǿ� ����� �� �ִ�*/
		//num2 �� double, num�� int�� ���� �ٸ� �ڷ���������
		//int�� double�� �ڵ�����ȯ�� �����ؼ� double�� ��ȯ�Ͽ� ����.
		double num2 = num;
		//num�� num2�� �ٸ� �ڷ����̰�, num2�� �ڷ����� double�� int�� �ڵ�����ȯ �Ұ����Ͽ� ����� ����ȯ�� ���� int�� �Ͻ������� ��ȯ
		num = (int)num2;
		//Ŭ������ ��ġ�ϴ� ��ü�� �����Ͽ� ����
		C2 c = new C2();
		P2 p = new P2();
		//�ڽ�Ŭ������ ��ü�� �θ�Ŭ������ ��ü�� �ڵ� ����ȯ �� �� �ִ�
		P2 parent = new C2();
		parent.print();
		//C2�� �̿��Ͽ� ��ü�� ��������� P2���� hello �޼ҵ尡 ���⶧���� ȣ�� �Ұ���
		//parent.hello();
		C2 child1 = new C2();
		P2 parent2 = child1;
		parent2.print();
		
		//�θ�Ŭ������ ��ü�� �ڽ�Ŭ������ ��ü�� Ŭ������ ��ȯ�� ���Ǻη� ��������� ����
		//�ȵǴ� ��� : �θ�Ŭ������ ��ü�� ���� ����ȯ�ϴ� ���
		/* C2 child3 = (C2)new P2();
		P2 parent3 = new P2();
		C2 child4 = (C2)parent3;
		child3.print(); */
		//���Ǻη� ������ ��� : �ڽ� Ŭ������ ��ü�� ���� �θ� Ŭ������ ����ȯ�� �θ� ��ü�� ��� ��������� ����
		P2 parent5 = new C2();
		//�θ� ��ü��ŭ �ڽ� ��ü��ŭ ������� �־ ��������� ����ȯ�� ���� 
		C2 child5 = (C2)parent5;
		child5.hello();
		
	}

}

class P2 {
	void print() {
		System.out.println("�θ�");
	}
}
class C2 extends P2 {
	void hello() {
		System.out.println("�ȳ��ϼ���.");
	}
}
