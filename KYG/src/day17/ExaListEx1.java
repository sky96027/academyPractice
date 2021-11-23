package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import day16.ExbStudent;

public class ExaListEx1 {
	public static void main(String[] args) {
		/* �л� ������ �����ϴ� ���α׷��� ����� ������.
		 * �޴�
		 * 1. �л����� �߰�
		 * 2. ��ü �л����� ���
		 * 3. �л� ���� ���� // �߰�
		 * 4. �л� ���� ����
		 * 5. ���α׷� ����*/
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		ArrayList<ExbStudent> stdList = new ArrayList<ExbStudent>();
		//�޴� ����
		do { 
			menu = printMenu(scan);
		switch(menu) {
		case 1 : Input(scan, stdList);	break;
		case 2 : print(stdList);		break;
		case 3 : Delete(stdList, scan);
		case 4 : Modify(stdList, scan);
		case 5 : break;
		default : System.out.println("�ٽ� �Է� �Ͻʽÿ� (1 ~ 5)");
		}		
		}while(menu != 5); //�޴� �� 3������ ����
		System.out.println("���α׷��� �����մϴ�.");
		scan.close();
	}
	//����Ʈ �Է�
	public static ArrayList<ExbStudent> Input(Scanner scan, ArrayList<ExbStudent> stdList) {
		char next = 'y';
		do {
			if (next != 'y' && next != 'n') {
				System.out.print("�ٽ� �Է��Ͻʽÿ� (y/n) : ");
				next = scan.next().charAt(0);
				if (next == 'n' || next == 'N') {
					break;
				}
			}
			while(next == 'y' || next == 'Y') {
			System.out.print("�г� : ");
			int grade = scan.nextInt();
			System.out.print("�й� : ");
			int classNum = scan.nextInt();
			System.out.print("��ȣ : ");
			int Num = scan.nextInt();
			System.out.print("�̸� : ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("������ �Է��ϼ���.");
			System.out.print("���� : ");
			int kor = scan.nextInt();
			System.out.print("���� : ");
			int eng = scan.nextInt();
			System.out.print("���� : ");
			int math = scan.nextInt();
			ExbStudent std = new ExbStudent(grade, classNum, Num, name, kor, eng, math);
			stdList.add(std);
			System.out.print("�л� ������ �� �Է��ϰڽ��ϱ�? (y/n) : ");
			next = scan.next().charAt(0);
			}
		}while (next != 'n' && next != 'N');
			return stdList;
	}
	//����Ʈ ���
	public static void print(ArrayList<ExbStudent> stdList) {
		Iterator<ExbStudent> it = stdList.iterator();
		while(it.hasNext()) {
			ExbStudent tmp = it.next();
			System.out.println(tmp);
		}
	}
	//�޴� ���
	public static int printMenu(Scanner scan) {
		System.out.println("[�޴�]");
		System.out.println("1. �л����� �߰�");
		System.out.println("2. ��ü �л����� ���");
		System.out.println("3. �л����� ����");
		System.out.println("4. �л����� ����");
		System.out.println("5. ���α׷� ����");
		System.out.print("�޴��� �����ϼ��� (1 ~ 5) : ");
		int menu = scan.nextInt();
		return menu;


	}
	//����Ʈ ����
	public static boolean Delete(ArrayList<ExbStudent> stdList, Scanner scan) {
		System.out.println("1. Ư�� ����");
		System.out.println("2. ����Ʈ ��ü ����");
		System.out.println("3. ����");
		System.out.print("��ȣ�� �����ϼ��� (1 ~ 3) : ");
		int dm = 0;
		do {
			dm = scan.nextInt();
			switch(dm) {
			case 1 : 
				System.out.println("������ �л� ������ �Է��Ͻʽÿ�.");
				System.out.print("�г� : ");
				int grade = scan.nextInt();
				System.out.print("�й� : ");
				int classNum = scan.nextInt();
				System.out.print("��ȣ : ");
				int Num = scan.nextInt();

				//������ �л� ������ ������� �ִ��� Ȯ���ϴ� �۾��� ���� ExbStudent Ŭ������ equals�� �������̵�
				//����Ʈ�� Ư�� ��ü�� �ִ��� Ȯ���� �� ����ϴ� �޼ҵ� : contains, indexOf
				ExbStudent std = new ExbStudent(grade, classNum, Num, "", 0, 0, 0);
				int index = stdList.indexOf(std);

				//������ �ش� ������ �ִ� �л� ������ ����
				//index >= 0 : indexOf�� ������ ����� ������, ������ -1�� ǥ��
				/*if(index >= 0) { 
					stdList.remove(index);
					System.out.println("�л� ������ �����߽��ϴ�.");
				}else {
					System.out.println("��ġ�ϴ� �л� ������ �����ϴ�.");
				}*/
				if(stdList.remove(std)) {
					System.out.println("�л� ������ �����߽��ϴ�.");
				}
				else {
					System.out.println("��ġ�ϴ� �л� ������ �����ϴ�.");
				}
				return stdList.remove(std);
			case 2 : 
				stdList.removeAll(stdList);
				System.out.println("�л����� ���θ� �����߽��ϴ�.");
				return stdList.removeAll(stdList);
			case 3 :
				return false;
			default : return false;
			}
		}while (dm != 3);


	}
	//����Ʈ ����
	public static void Modify(ArrayList<ExbStudent> stdList, Scanner scan) {
		System.out.println("������ �л� ������ �Է��Ͻʽÿ�.");
		System.out.print("�г� : ");
		int grade = scan.nextInt();
		System.out.print("�й� : ");
		int classNum = scan.nextInt();
		System.out.print("��ȣ : ");
		int Num = scan.nextInt();
		ExbStudent std = new ExbStudent(grade, classNum, Num, "", 0, 0, 0);
		int index = stdList.indexOf(std);

		System.out.println("������ ������ �Է��Ͻʽÿ�.");
		System.out.print("�г� : ");
		grade = scan.nextInt();
		System.out.print("�й� : ");
		classNum = scan.nextInt();
		System.out.print("��ȣ : ");
		Num = scan.nextInt();
		System.out.print("�̸� : ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("������ �Է��ϼ���.");
		System.out.print("���� : ");
		int kor = scan.nextInt();
		System.out.print("���� : ");
		int eng = scan.nextInt();
		System.out.print("���� : ");
		int math = scan.nextInt();
		ExbStudent newstd = new ExbStudent(grade, classNum, Num, name, kor, eng, math);
		stdList.set(index, newstd);
	}
} 