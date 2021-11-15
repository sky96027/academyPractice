package day14;

public class ExaStringEx1 {

	public static void main(String[] args) {
		/* 5명의 이름을 배열에 저장하고, 성이 홍씨인 사람을 검색하는 코드를 작성하세요.*/
		String str = "정민규, 홍유찬, 이기문, 김기원, 허정호";
		String [] name = str.split(", ");
		for(String tmp : name) {
			if(tmp.startsWith("홍")) {
				System.out.println(tmp+ "은 홍씨입니다.");
			}
			else {
				System.out.println(tmp + "은 홍씨가 아닙니다.");
			}
		}
	}

}
