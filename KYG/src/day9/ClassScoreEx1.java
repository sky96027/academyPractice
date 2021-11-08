package day9;

import java.util.Scanner;

public class ClassScoreEx1 {

	public static void main(String[] args) {
		/* ����, ����, ���� ������ �����ϱ� ���� Ŭ������ �����,
		 * �л� 5���� ������ �����ϱ� ���� �迭�� ���弼��.*/
		//5���� �л� ������ ������ �� �ִ� �迭�� ����
		Score std[] = new Score [5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < std.length; i++) {
			//new�� ���� �л� ������ �����ϰ�, �����ڷ� �ʱ�ȭ
			System.out.print("�̸�: ");
			String name = scan.next();
			System.out.print("����");
			int kor = scan.nextInt();
			System.out.print("����");
			int eng = scan.nextInt();
			System.out.print("����");
			int math = scan.nextInt();
			std[i] = new Score(kor, eng, math, name);
		}
		for(Score tmp : std) {
			tmp.printInfo();
		}
		scan.close();
		
	}
	
}
class Score {
	String Name;
	int Kor, Eng, Math;
	
	//get, set
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getKor() {
		return Kor;
	}
	public void setKor(int kor) {
		Kor = kor;
	}
	public int getEng() {
		return Eng;
	}
	public void setEng(int eng) {
		Eng = eng;
	}
	public int getMath() {
		return Math;
	}
	public void setMath(int math) {
		Math = math;
	}
	//�⺻ ������
	public Score() {}
	public Score(int kor, int eng, int math, String name) {
		super();
		Name = name;
		Kor = kor;
		Eng = eng;
		Math = math;
	}
	//�л� ������ ����ϴ� �޼ҵ�
	public void printInfo() {
		System.out.println("�̸� : " + Name);
		System.out.println("���� : " + Kor);
		System.out.println("�̸� : " + Eng);
		System.out.println("�̸� : " + Math);
		
	}
	
}
	