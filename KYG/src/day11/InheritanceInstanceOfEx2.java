package day11;

public class InheritanceInstanceOfEx2 {

	public static void main(String[] args) {
		P3 p1 = new P3();
		System.out.println(p1 instanceof C3);
		P3 p2 = new C3();
		System.out.println(p2 instanceof C3);
		C3 child = null;
		P3 parent = new P3();
		//parent�� C3�� ����ȯ�� �����ϸ� child�� �����ϰ� �ʹ�.
		//����ȯ�� �Ұ����ϸ� �ƹ��͵� ����
		if (parent instanceof C3) {
			child = (C3)parent;
		}
		//����ȯ�� �����ؼ� parent�� �����ϸ� �̻��� ���� ������ �ƴϸ� null�� ����
		System.out.println(child);
	}

}
class P3 {
	
}
class C3 extends P3 {
	
}
