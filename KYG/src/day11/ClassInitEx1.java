package day11;

public class ClassInitEx1 {

	public static void main(String[] args) {
		Test11 t = new Test11();
		System.out.println(t.num);
		System.out.println(Test11.cnt);
	}

}

class Test11{
	/* ������� num�� �ʱ�ȭ ����
	 * 1. num�� int�� �⺻���� 0���� �ʱ�ȭ
	 * 2. num�� 10���� �ʱ�ȭ(����� �ʱ�ȭ)
	 * 3. num�� 20���� �ʱ�ȭ(�ʱ�ȭ ��Ͽ��� �ʱ�ȭ)
	 * 4. num�� 30���� �ʱ�ȭ(�����ڿ��� �ʱ�ȭ)*/

	public int num = 10;
	{
		num = 20;
	}
	public Test11() {
		num = 30;
	}
	/* Ŭ���� ������� cnt�� �ʱ�ȭ ����
	 * 1. cnt�� int�� �⺻���� 0���� �ʱ�ȭ
	 * 2. cnt�� 11���� �ʱ�ȭ(����� �ʱ�ȭ)
	 * 3. cnt�� 21���� �ʱ�ȭ(�ʱ�ȭ ��Ͽ��� �ʱ�ȭ)
	 * 4. cnt�� 30���� �ʱ�ȭ(�����ڿ��� �ʱ�ȭ)*/
	public static int cnt = 11;
	static {
		cnt = 21;
	}
}
