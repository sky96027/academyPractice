package day13;

public class ExfTestEx1 {

	public static void main(String[] args) {
		/* Ÿ��, �簢���� ���� ������ �� �ִ� �迭�� �����.
		 * Ÿ��1��, �簢��2���� ����� ������ ��, �׸��� �ڵ带 �ۼ��ϼ���.*/
		ExfShape [] list = new ExfShape [3];
		list[0] = new ExfEllipse(0, 0, 10, 10);
		list[1] = new ExfRect(0, 0, 10, 10);
		list[2] = new ExfRect(10, 10, 20, 20);
		
		for(ExfShape tmp : list) {
			tmp.draw();
		}
		
	}

}
