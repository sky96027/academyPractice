package day13;

public class ExgStringCompareToEx2 {

	public static void main(String[] args) {
		 /* ���ڿ� 4���� �Ѱ����� ������ �� �ְ� �迭�� ���弼��*/
		 String [] list = new String [4];
		 /* �迭�� b d a c ������ �����ϼ���.*/
		 list[0] = "b";
		 list[1] = "d";
		 list[2] = "a";
		 list[3] = "c";
		 /* �ݺ����� compareTo�� �̿��Ͽ� ���������� �����غ�����.*/
		for(int i = 0; i < list.length; i++) {
			for(int j = 0; j < list.length - 1; j++) {
				if(list[j].compareTo(list[j + 1]) > 0) {
					String tmp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = tmp;
				}
			}
		}
		for(String tmp : list) {
			System.out.println(tmp + " ");
		}
	}

}
