package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import day16.ExbStudent;

public class ExaListEx1 {
	public static void main(String[] args) {
		/* 학생 성적을 관리하는 프로그램을 만들어 보세요.
		 * 메뉴
		 * 1. 학생정보 추가
		 * 2. 전체 학생정보 출력
		 * 3. 학생 정보 삭제 // 추가
		 * 4. 학생 정보 수정
		 * 5. 프로그램 종료*/
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		ArrayList<ExbStudent> stdList = new ArrayList<ExbStudent>();
		//메뉴 시작
		do { 
			menu = printMenu(scan);
		switch(menu) {
		case 1 : Input(scan, stdList);	break;
		case 2 : print(stdList);		break;
		case 3 : Delete(stdList, scan);
		case 4 : Modify(stdList, scan);
		case 5 : break;
		default : System.out.println("다시 입력 하십시오 (1 ~ 5)");
		}		
		}while(menu != 5); //메뉴 끝 3누르면 종료
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
		System.out.println("3. 학생정보 삭제");
		System.out.println("4. 학생정보 수정");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 (1 ~ 5) : ");
		int menu = scan.nextInt();
		return menu;


	}
	//리스트 삭제
	public static boolean Delete(ArrayList<ExbStudent> stdList, Scanner scan) {
		System.out.println("1. 특정 삭제");
		System.out.println("2. 리스트 전체 삭제");
		System.out.println("3. 종료");
		System.out.print("번호를 선택하세요 (1 ~ 3) : ");
		int dm = 0;
		do {
			dm = scan.nextInt();
			switch(dm) {
			case 1 : 
				System.out.println("삭제할 학생 정보를 입력하십시오.");
				System.out.print("학년 : ");
				int grade = scan.nextInt();
				System.out.print("학반 : ");
				int classNum = scan.nextInt();
				System.out.print("번호 : ");
				int Num = scan.nextInt();

				//삭제할 학생 정보가 몇번지에 있는지 확인하는 작업을 위해 ExbStudent 클래스의 equals를 오버라이딩
				//리스트에 특정 객체가 있는지 확인할 때 사용하는 메소드 : contains, indexOf
				ExbStudent std = new ExbStudent(grade, classNum, Num, "", 0, 0, 0);
				int index = stdList.indexOf(std);

				//있으면 해당 번지에 있는 학생 정보를 삭제
				//index >= 0 : indexOf는 있으면 양수로 번지를, 없으면 -1를 표기
				/*if(index >= 0) { 
					stdList.remove(index);
					System.out.println("학생 정보를 삭제했습니다.");
				}else {
					System.out.println("일치하는 학생 정보가 없습니다.");
				}*/
				if(stdList.remove(std)) {
					System.out.println("학생 정보를 삭제했습니다.");
				}
				else {
					System.out.println("일치하는 학생 정보가 없습니다.");
				}
				return stdList.remove(std);
			case 2 : 
				stdList.removeAll(stdList);
				System.out.println("학생정보 전부를 삭제했습니다.");
				return stdList.removeAll(stdList);
			case 3 :
				return false;
			default : return false;
			}
		}while (dm != 3);


	}
	//리스트 수정
	public static void Modify(ArrayList<ExbStudent> stdList, Scanner scan) {
		System.out.println("수정할 학생 정보를 입력하십시오.");
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("학반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int Num = scan.nextInt();
		ExbStudent std = new ExbStudent(grade, classNum, Num, "", 0, 0, 0);
		int index = stdList.indexOf(std);

		System.out.println("수정할 정보를 입력하십시오.");
		System.out.print("학년 : ");
		grade = scan.nextInt();
		System.out.print("학반 : ");
		classNum = scan.nextInt();
		System.out.print("번호 : ");
		Num = scan.nextInt();
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
		ExbStudent newstd = new ExbStudent(grade, classNum, Num, name, kor, eng, math);
		stdList.set(index, newstd);
	}
} 