package day9;

public class ClassEx3 {

	public static void main(String[] args) {
		// ����б� �л� ������ �����ϱ� ���� Ŭ������ �����ϰ�, �׽�Ʈ�غ�����.
		//�׸�����б��� �ٴϴ� 1�г� 1�� 1�� ȫ�浿 �л� ��ü�� �����ϰ�
		//�л� ������ ����غ�����.
		highschool std1 = new highschool("�׸�����б�", 1, 1, 1, "ȫ�浿");
		std1.print();
	
		
	}

}
/* Ŭ���� : ����б� �л� ������ �����ϱ� ���� Ŭ����
 * */
class highschool {
	int Grade;
	int Class;
	int Num;
	String Schoolname;
	String Name;
	public highschool() {
		this("�׸�����б�", 1, 1, 1, "���α�");
		System.out.println("this()");
		Schoolname = "����б�";
		Grade = 1;
		Class = 1;
		Num = 1;
		Name = "";
	}
	highschool(String schoolname, int grade, int class1, int num, String name) {
		Grade = grade;
		Class = class1;
		Num = num;
		Schoolname = schoolname;
		Name = name;
	}
	
	public void print() {
		System.out.println("�б��� : " + Schoolname);
		System.out.println("�г� : " + Grade);
		System.out.println("�� : " + Class);
		System.out.println("��ȣ : " + Num);
		System.out.println("�̸� : " + Name);
	}
}
