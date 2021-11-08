package day9;

public class MethodParameterEx1 {
	//매개변수가 가변인자인 경우
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(sum(1));
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 2, 3));
		System.out.println(sum(1, 2, 3, 4));
		//sum은 매개변수가 없어도 0개 배열을 만들어서 실행함 : 에러 발생하지 않음
		//sum1는 매개변수가 없어서 에러가 발생함
		//System.out.println(sum1());
		//sum1으로 하면 배열을 만들어야해서 번거로움
		System.out.println(sum1(new int [] {1}));
		System.out.println(sum1(new int [] {1, 2}));
		System.out.println(sum1(new int [] {1, 2, 3}));
		System.out.println(sum1(new int [] {1, 2, 3, 4}));
		printinfo(1, 1, 1, "홍길동", "홍길동", "활빈당", "영웅");
		printinfo(1, 1, 2, "임꺽정", "임꺽정", "도둑", "의적");

	}
	/* 기능 : 정수가 주어지면 정수의 합을 알려주는 메소드
	 * 매개변수 : int ... nums
	 * 리턴타입 : int
	 * 메소드명 : sum */
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
	/* 기능 : 학년, 반, 번호, 이름, 별명들이 주어지면 학생 정보를 콘솔에 출력하는 메소드
	 * 매개변수 : 학년, 반, 번호, 이름, 별명(0 ~ 여러개)
	 *        => int grade, int classnum, int num, string name,
	 *           string ... nicknames
	 * 리턴타입 : void
	 * 메소드명 : printinfo */
	public static void printinfo(int grade, int classnum, int num, String name, String ... nicknames) {
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classnum);
		System.out.println("번호 : " + num);
		System.out.println("학년 : " + name);
		System.out.print("별명 : ");
		for(int i = 0; i < nicknames.length; i++) {
			System.out.print(nicknames[i] + " ");
		}
		System.out.println();
	}
	//일반 매개변수와 가변 매개변수를 섞어 쓸 때 가변 매개변수를 미자믹에 써야함
	//public static void printinfo2(int grade, int classnum, int num, String ... nicknames String name) {}
	//가변 매개변수는 여러개 쓸 수 없음
	//public static void printinfo3(int ... grade, String ... nicknames) {}
}
