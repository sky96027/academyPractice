package day9;

public class MethodParameterEx1 {
	//�Ű������� ���������� ���
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(sum(1));
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1, 2, 3, 4));
		//sum�� �Ű������� ��� 0�� �迭�� ���� ������ : ���� �߻����� ����
		//sum1�� �Ű������� ��� ������ �߻���
		//System.out.println(sum1());
		//sum1���� �ϸ� �迭�� �������ؼ� ���ŷο�
		System.out.println(sum1(new int [] {1}));
		System.out.println(sum1(new int [] {1, 2}));
		System.out.println(sum1(new int [] {1, 2, 3}));
		System.out.println(sum1(new int [] {1, 2, 3, 4}));
		printinfo(1, 1, 1, "ȫ�浿", "ȫ�浿", "Ȱ���", "����");
		printinfo(1, 1, 2, "�Ӳ���", "�Ӳ���", "����", "����");

	}
	/* ��� : ������ �־����� ������ ���� �˷��ִ� �޼ҵ�
	 * �Ű����� : int ... nums
	 * ����Ÿ�� : int
	 * �޼ҵ�� : sum */
	public static int sum(int ... nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	public static int sum1(int [] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	/* ��� : �г�, ��, ��ȣ, �̸�, ������� �־����� �л� ������ �ֿܼ� ����ϴ� �޼ҵ�
	 * �Ű����� : �г�, ��, ��ȣ, �̸�, ����(0 ~ ������)
	 *        => int grade, int classnum, int num, string name,
	 *           string ... nicknames
	 * ����Ÿ�� : void
	 * �޼ҵ�� : printinfo */
	public static void printinfo(int grade, int classnum, int num, String name, String ... nicknames) {
		System.out.println("�г� : " + grade);
		System.out.println("�� : " + classnum);
		System.out.println("��ȣ : " + num);
		System.out.println("�г� : " + name);
		System.out.print("���� : ");
		for(int i = 0; i < nicknames.length; i++) {
			System.out.print(nicknames[i] + " ");
		}
		System.out.println();
	}
	//�Ϲ� �Ű������� ���� �Ű������� ���� �� �� ���� �Ű������� ���ڹͿ� �����
	//public static void printinfo2(int grade, int classnum, int num, String ... nicknames String name) {}
	//���� �Ű������� ������ �� �� ����
	//public static void printinfo3(int ... grade, String ... nicknames) {}
}
