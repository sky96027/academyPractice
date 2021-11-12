package day13;

public class ExgStringIndexofEx1 {

	public static void main(String[] args) {
		/* int indexOf(int ch) : 문자가 몇번지에 있는지 알려주는 메소드로
		 * 없으면 -1을 알려줌
		 * int indesOf(String str) : str 이 몇번지에 있는지 알려주는 메소드로
		 * 없으면 -1을 알려줌*/
		String str = "Hello world";
		System.out.println(str.indexOf('w'));
		System.out.println(str.indexOf("wo"));
		/* str에 l이 몇개 있는지 확인하는 예제*/
		int index = -1;
		int count = 0;
		int ch = 'e';
		do {
			index = str.indexOf('l', index);
			if(index >= 0) {
				count++;
				index++;
			}
			count = index >= 0 ? count + 1 : count;
		}while(index != -1);
		System.out.println("(char)ch의 갯수 : " + count);
	}

}
