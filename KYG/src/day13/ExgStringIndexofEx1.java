package day13;

public class ExgStringIndexofEx1 {

	public static void main(String[] args) {
		/* int indexOf(int ch) : ���ڰ� ������� �ִ��� �˷��ִ� �޼ҵ��
		 * ������ -1�� �˷���
		 * int indesOf(String str) : str �� ������� �ִ��� �˷��ִ� �޼ҵ��
		 * ������ -1�� �˷���*/
		String str = "Hello world";
		System.out.println(str.indexOf('w'));
		System.out.println(str.indexOf("wo"));
		/* str�� l�� � �ִ��� Ȯ���ϴ� ����*/
		int index = -1;
		int count = 0;
		int ch = 'e';
		do {
			index = str.indexOf('l', index);
			if(index >= 0) {
				count++;
				index++;
			}
			count = index >= 0 ? count + 1 : count;
		}while(index != -1);
		System.out.println("(char)ch�� ���� : " + count);
	}

}
