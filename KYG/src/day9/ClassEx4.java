package day9;

public class ClassEx4 {

	public static void main(String[] args) {
		/* 학생 1명의 정보를 관리하는 예제 : 클래스 사용 x*/
		String sName = "그린고등학교", Name = "홍길동";
		int Grade = 1, Class = 1, Num = 1;
		

			System.out.println(sName + " " + Grade + "학년" + " " + Class + "반" + " " + Num + "번" + " " + "이름 : " + Name);
		
		/* 학생 1명의 정보를 관리하는 예제 : 클래스 사용 highschool */
		highschool std = new highschool("그린고등학교", 1, 1, 1, "홍길동");
		std.print();
	}

}
