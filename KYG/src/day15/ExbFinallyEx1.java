package day15;

public class ExbFinallyEx1 {

	public static void main(String[] args) {
		

	}
	public static void exceptionTest() {
		int num1 = 1, num2 = 0;
		try {
			int res = num1 / num2;
			System.out.println(res);
		}catch(Exception e) {
			System.out.println("����ó��");
			return;
		}finally {
			System.out.println("���̳θ�");
		}
		System.out.println("�޼ҵ� ������");
	}

}
