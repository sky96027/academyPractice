package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExbListEx2 {
	public static void main(String[] args) {
		/* 학생 성적을 관리하는 프로그램을 만들어 보세요.
		 * 메뉴
		 * 1. 학생정보 추가
		 * 2. 전체 학생정보 출력
		 * 3. 프로그램 종료*/
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		ArrayList<ExbStudent> stdList = new ArrayList<ExbStudent>();
		//메뉴 시작
		do { 
			menu = printMenu(scan);
		switch(menu) {
		case 1 : Input(scan, stdList);	break;
		case 2 : print(stdList);		break;
		case 3 : break;
		default : System.out.println("다시 입력 하십시오 (1 ~ 3)");
		}		
		}while(menu != 3); //메뉴 끝 3누르면 종료
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
	//리스트 입력
	public static ArrayList<ExbStudent> Input(Scanner scan, ArrayList<ExbStudent> stdList) {
		char next = 'y';
		do {
			if (next != 'y' && next != 'n') {
				System.out.print("다시 입력하십시오 (y/n) : ");
				next = scan.next().charAt(0);
				if (next == 'n' || next == 'N') {
					break;
				}
			}
			while(next == 'y' || next == 'Y') {
			System.out.print("학년 : ");
			int grade = scan.nextInt();
			System.out.print("학반 : ");
			int classNum = scan.nextInt();
			System.out.print("번호 : ");
			int Num = scan.nextInt();
			System.out.print("이름 : ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("성적을 입력하세요.");
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			System.out.print("수학 : ");
			int math = scan.nextInt();
			ExbStudent std = new ExbStudent(grade, classNum, Num, name, kor, eng, math);
			stdList.add(std);
			System.out.print("학생 정보를 더 입력하겠습니까? (y/n) : ");
			next = scan.next().charAt(0);
			}
		}while (next != 'n' && next != 'N');
			return stdList;
	}
	//리스트 출력
	public static void print(ArrayList<ExbStudent> stdList) {
		Iterator<ExbStudent> it = stdList.iterator();
		while(it.hasNext()) {
			ExbStudent tmp = it.next();
			System.out.println(tmp);
		}
	}
	//메뉴 출력
	public static int printMenu(Scanner scan) {
		System.out.println("[메뉴]");
		System.out.println("1. 학생정보 추가");
		System.out.println("2. 전체 학생정보 출력");
		System.out.println("3. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 (1 ~ 3) : ");
		int menu = scan.nextInt();
		return menu;
		
		
	}

}