package day9;

public class ClassEx3 {

	public static void main(String[] args) {
		// 고등학교 학생 정보를 관리하기 위한 클래스를 생성하고, 테스트해보세요.
		//그린고등학교에 다니는 1학년 1반 1번 홍길동 학생 객체를 생성하고
		//학생 정보를 출력해보세요.
		highschool std1 = new highschool("그린고등학교", 1, 1, 1, "홍길동");
		std1.print();
	
		
	}

}
/* 클래스 : 고등학교 학생 정보를 관리하기 위한 클래스
 * */
class highschool {
	int Grade;
	int Class;
	int Num;
	String Schoolname;
	String Name;
	public highschool() {
		this("그린고등학교", 1, 1, 1, "정민규");
		System.out.println("this()");
		Schoolname = "고등학교";
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
		System.out.println("학교명 : " + Schoolname);
		System.out.println("학년 : " + Grade);
		System.out.println("반 : " + Class);
		System.out.println("번호 : " + Num);
		System.out.println("이름 : " + Name);
	}
}
