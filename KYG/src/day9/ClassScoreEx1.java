package day9;

import java.util.Scanner;

public class ClassScoreEx1 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 성적을 관리하기 위한 클래스를 만들고,
		 * 학생 5명의 성적을 관리하기 위한 배열을 만드세요.*/
		//5명의 학생 정보를 저장할 수 있는 배열을 생성
		Score std[] = new Score [5];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < std.length; i++) {
			//new를 통해 학생 정보를 생성하고, 생성자로 초기화
			System.out.print("이름: ");
			String name = scan.next();
			System.out.print("국어");
			int kor = scan.nextInt();
			System.out.print("영어");
			int eng = scan.nextInt();
			System.out.print("수학");
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
	//기본 생성자
	public Score() {}
	public Score(int kor, int eng, int math, String name) {
		super();
		Name = name;
		Kor = kor;
		Eng = eng;
		Math = math;
	}
	//학생 정보를 출력하는 메소드
	public void printInfo() {
		System.out.println("이름 : " + Name);
		System.out.println("국어 : " + Kor);
		System.out.println("이름 : " + Eng);
		System.out.println("이름 : " + Math);
		
	}
	
}
	