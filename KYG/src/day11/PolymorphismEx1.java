package day11;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		Phone p = new Phone();
		SmartPhone sp = new SmartPhone();
		FolderPhone fp = new FolderPhone();
		calling(p);
		calling(sp);
		calling(fp);
		Human h1 = new Human(p);
		Human h2 = new Human(sp);
		Human h3 = new Human(fp);
		h1.p.get();
		h2.p.get();
		h3.p.get();
		
	}
	//�Ű������� ������ : �Ű������� ��ü���� ����� �θ�� �����Ͽ�
	//				 �پ��� Ŭ������ ��ü���� �� �� �ְ� �ϴ°�
	public static void calling(Phone p) {
		p.call();
	}
	

}

class Human {
	Phone p;
	public Human(Phone p) {
		this.p = p;
	}
	
}

class Phone {
	public String phoneNum;
	
	public void call() {
		System.out.println("��ȭ�� �Ŵ� ���Դϴ�.");
	}
	public void get() {
		System.out.println("��ȭ�� �޴� ���Դϴ�.");
	}
	
}

class SmartPhone extends Phone {
	public void touch() {
		System.out.println("������ ��ġ�߽��ϴ�.");
	}
}
class FolderPhone extends Phone {
	public void fold() {
		System.out.println("�ڵ����� �������ϴ�.");
	}
}















