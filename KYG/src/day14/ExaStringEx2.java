package day14;

public class ExaStringEx2 {

	public static void main(String[] args) {
		/* 5명의 이름을 저장하고, 저장된 이름중 홍길동이 있는지 확인하세요.
		 * indexOf  : 이용 가능하나 추가 작업 필요
		 * contains : 이용 가능하나 추가 작업 필요
		 * startswith, endswith : 이용 가능하나 추가 작업 필요
		 * euqals : 이용가능 */
		String str = "정민규, 홍길동, 홍길동이, 김홍길동, 홍길동홍길동";
		String [] name = str.split(", ");
		int count = 0;
		String search = "홍길동";
		for(String tmp : name) {
			if(tmp.equals(search)) {
				count++;	
			}
		}
		if(count != 0) {
			System.out.println("홍길동이 " + count + "명 있습니다.");

		}
		else {
			System.out.println("홍길동이 없습니다.");
		}
		//startsWith, endsWith
		count = 0;
		for(String tmp : name) {
			if(tmp.startsWith(search) && tmp.length() == search.length()) {
				count++;	
			}
		}
		if(count != 0) {
			System.out.println("홍길동이 " + count + "명 있습니다.");

		}
		else {
			System.out.println("홍길동이 없습니다.");
		}	
			
		

	}

}
