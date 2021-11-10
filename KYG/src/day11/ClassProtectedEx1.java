package day11;

public class ClassProtectedEx1 {
	public static void main(String[] args) {
		C c = new C();
		c.a = 1; //모두접근
		c.b = 2; //본인 + 같은 패키지 + 자식클래스
		c.c = 3; //본인 + 같은 패키지
		//c.d = 4; //해당 클래스만 접근이 가능.
		
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
		a = 1; //모두 접근
		b = 2; //같은 패키지이면서 자식 클래스여서 가능
		c = 3;
		//d = 4; //p클래스 안이 아니기 때문에 불가능
	}
}
