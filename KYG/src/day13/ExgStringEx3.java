package day13;

public class ExgStringEx3 {

	public static void main(String[] args) {
		/* int compareTo(String str)
		 *  -equals()�� ���
		 *  -equals()�� �� ���ڿ��� ������ �ٸ����� �˷���
		 *  -compareTo�� �� ���ڿ��� ���������� ��� �Ǵ��� �˷���
		 *  -������ 0, �ٸ��� ����, ���
		 * */
		String str1 = "a";
		String str2 = new String("a");
		String str3 = "b";
		System.out.println(str1 + "�� " + str2 + "���� ���������� " + str1.compareTo(str2));
		System.out.println(str1 + "�� " + str3 + "���� ���������� " + str1.compareTo(str3));
		System.out.println(str3 + "�� " + str1 + "���� ���������� " + str1.compareTo(str1));
		if(str1.compareTo(str2) == 0) {
			System.out.println(str1 + "��" + str2 + "�� ����");
		}
		else {
			System.out.println(str1 + "��" + str2 + "�� �ٸ���");
		}
	}

}
