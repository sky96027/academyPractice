package day9;

public class ClassAccessEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		//a.num1 = 10;	//���������ڰ� private, ClassAccessEx1 Ŭ�������� ����� �� ����
		a.setNum1(10);
		a.num2 = 20;	//AŬ������ ClassAccessEx1 Ŭ������ ���� ��Ű���� �ֱ� ������ ��� ����
		a.num3 = 30;	//�ƹ� Ŭ������ ����� �� �ִ�.
	}

}

class A {
	private int num1;
	int num2; 			//default : �⺻, ���������ڸ� ������ ���
	public int num3;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
}