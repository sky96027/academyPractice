package day18;

import java.util.*;

public class ExfBoardEX1 {

	public static void main(String[] args) { 
		/* 게시글을 관리하는 프로그램을 만드세요.
		 * 배열x 리스트o
		 * 기능
		 * 1. 게시글 등록
		 * 2. 게시글 확인
		 * 3. 게시글 수정
		 * 4. 게시글 삭제
		 * 5. 프로그램 종료
		 * */
		//게시글 리스트 생성
		Scanner scan = new Scanner(System.in);
		ArrayList<ExfBoard> list = new ArrayList<ExfBoard>();
		String [] strMenu = {
				"1. 게시글 등록",
				"2. 게시글 확인",
				"3. 게시글 수정",
				"4. 게시글 삭제",
				"5. 프로그램 종료"
		};
		//프로그램 시작
		while(true) {
			//메뉴 출력
			printMenu(strMenu);
		try {
				//메뉴 입력
				int ch = scan.nextInt();
				bar();
				
				//메뉴에 따른 기능 실행
				if(ch == 1) 	 {register(list, scan);}
				else if(ch == 2) {display(list);}
				else if(ch == 3) {modify(list, scan);}
				else if(ch == 4) {delete(list, scan);}
				else if(ch == 5) {
					System.out.println("프로그램을 종료합니다");
					bar();
					break;
				}else {
					System.out.println("잘못된 메뉴입니다.");
					bar();
					scan.nextLine();
				}
			}catch(InputMismatchException e) {System.out.println("잘못된 메뉴입니다.");
			}catch(Exception e)				 {e.printStackTrace();}
		//프로그램 종료
		}
	}
public static void printMenu(String [] strMenu) {
	System.out.println("===========메뉴===========");
	for(String tmp : strMenu) {
		System.out.println(tmp);
	}
	System.out.println("=========================");
	System.out.println("메뉴 선택 : ");
	}
public static void bar() {
	System.out.println("=========================");
}
public static void register(List<ExfBoard> list, Scanner scan) {
	System.out.println("===게시글 등록===");
	scan.nextLine();
	System.out.println("제목 : ");
	String title = scan.nextLine();
	System.out.println("내용 : ");
	String contents = scan.nextLine();
	System.out.println("작성자 : ");
	String writer = scan.nextLine();
	//입력한 정보를 이용하여 게시글 하나 생성
	ExfBoard board = new ExfBoard(title, contents, writer);
	//생성된 게시글을 리스트에 추가
	list.add(board);
	System.out.println("게시글이 등록되었습니다.");
	bar();
}
public static void display(List<ExfBoard> list) {
	for( ExfBoard tmp : list ) {
		bar();
		System.out.println(tmp);
		bar();
	}
}
public static void modify(List<ExfBoard> list, Scanner scan) {
	System.out.println("게시글을 수정합니다.");
	System.out.println("번호 : ");
	int num = scan.nextInt();
	scan.nextLine();
	System.out.println("제목 : ");
	String title = scan.nextLine();
	System.out.println("내용 : ");
	String contents = scan.nextLine();
	//리스트에서 수정할 게시글 정보를 가져옴
	ExfBoard tmp = new ExfBoard();
	tmp.setNum(num);
	tmp.setTitle(title);
	tmp.setContents(contents);
	int index = list.indexOf(tmp);
	//게시글을 수정 후 안내문구 출력
	if(index >= 0) {
		list.get(index).modify(title, contents);
		System.out.println("게시글 수정이 완료되었습니다.");
		bar();
	}else {
		System.out.println("없는 게시글 입니다.");
		bar();
	}
}
public static void delete(List<ExfBoard> list, Scanner scan) {
	//게시글 번호를 입력
	System.out.println("게시글을 삭제합니다.");
	System.out.println("번호 : ");
	int num = scan.nextInt();
	//리스트에 해당 게시글이 있는지 확인
	ExfBoard tmp = new ExfBoard();
	tmp.setNum(num);
	int index = list.indexOf(num);
	//리스트에 게시글이 있으면 삭제
	if(index >= 0) {
		list.remove(index);
		System.out.println("게시글이 삭제되었습니다.");
		bar();
	}else {
		System.out.println("없는 게시글 입니다.");
		bar();
	}
}
}
