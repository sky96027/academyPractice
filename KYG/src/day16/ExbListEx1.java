package day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExbListEx1 {
	public static void main(String[] args) {
		/* 그린 고등학생의 국어, 영어, 수학 성적을 관리하려 한다.
		 * 관리하기 위한 리스트를 만들어 보세요.
		 * */
		ArrayList<ExbStudent> stdList = new ArrayList<ExbStudent>();
		Scanner scan = new Scanner(System.in);
		
		/* 학생 정보를 입력받고, 계속할건지 물어봐서 y라고 대답하면 계속하고 아니면 종료*/
		char next = 'y';
		while(next == 'y' || next == 'Y') {
			Input(scan, stdList);
			System.out.print("학생 정보를 더 입력하겠습니까? : ");
			next = scan.next().charAt(0);
		}
		/* 입력받은 학생 정보를 출력 : iterator를 이용*/
		print(stdList);
		/* 학생 성적을 관리하는 프로그램을 만들어 보세요.
		 * 메뉴
		 * 1. 학생정보 추가
		 * 2. 전체 학생정보 출력
		 * 3. 프로그램 종료*/
		scan.close();
	}
	//위의 코드를 이용하여 학생 정보를 입력하는 메소드와 학생 정보들을 출력하는 메소드를 만들어보세요.
	/* 기능 : Scanner를 이용하여 학생 저보와 성적을 입력 받아 입력받은 학생 정보를 주어진 리스트에 넣어주는 메소드
	 * 매개변수 : Scanner scan, ArrayList<ExbStudent> stdList
	 * 리턴타입 : ArrayList
	 * 메소드명 : Input*/
	public static ArrayList<ExbStudent> Input(Scanner scan, ArrayList<ExbStudent> stdList) {
		char next = 'y';
		while(next == 'y' || next == 'Y') {
			System.out.print("학년 : ");
			int grade = scan.nextInt();
			System.out.print("학반 : ");
			int classNum = scan.nextInt();
			System.out.print("번호 : ");
			int Num = scan.nextInt();
			System.out.print("이름 : ");
			/* nextLine()을 이용하는 경우 앞에서 Scanner를 통해 입력받은 값 중 엔터가 사라지지
			 * 않은 상황이면 실제 사용하려는 nextLine()앞에 nextLine()을
			 * 한번 더 입력해야 한다.*/
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("성적을 입력하세요.");
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			System.out.print("수학 : ");
			int math = scan.nextInt();
			ExbStudent std
				=new ExbStudent(grade, classNum, Num, name, kor, eng, math);
			stdList.add(std);
			System.out.print("학생 정보를 더 입력하겠습니까? : ");
			next = scan.next().charAt(0);
		}
			return stdList;
	}
	/* 기능 : 학생 리스트가 주어지면 주어진 학생 정보들을 출력하는 메소드
	 * 매개변수 : ArrayList<ExbStudent> stdList
	 * 리턴타입 : void
	 * 메소드명 : print*/
	public static void print(ArrayList<ExbStudent> stdList) {
		Iterator<ExbStudent> it = stdList.iterator();
		while(it.hasNext()) {
			//리스트에서 하나씩 꺼내서 tmp에 저장
			ExbStudent tmp = it.next();
			System.out.println(tmp);
		}
	}
}

	