package day13;

public class ExcTestEx1 {

	public static void main(String[] args) {
		/* �߻� Ŭ������ �߻� Ŭ������ �̿��Ͽ� ��ü�� ���� �� ���� */
		//ExcP p = new ExcP();
		//�߻� Ŭ������ �ڽ� Ŭ���� ��ü�� �̿��ϸ� �߻� Ŭ���� ��ü�� ���� �� �ִ�
		ExcP p = new ExcC();
		p.test();
	}

}
abstract class ExcP {
	public abstract void test();
	
}
class ExcC extends ExcP {
	@Override
	public void test() {
		System.out.println("�߻� �޼ҵ�");
	}
}