package day9;

public class ClassEx4 {

	public static void main(String[] args) {
		/* �л� 1���� ������ �����ϴ� ���� : Ŭ���� ��� x*/
		String sName = "�׸�����б�", Name = "ȫ�浿";
		int Grade = 1, Class = 1, Num = 1;
		

			System.out.println(sName + " " + Grade + "�г�" + " " + Class + "��" + " " + Num + "��" + " " + "�̸� : " + Name);
		
		/* �л� 1���� ������ �����ϴ� ���� : Ŭ���� ��� highschool */
		highschool std = new highschool("�׸�����б�", 1, 1, 1, "ȫ�浿");
		std.print();
	}

}
