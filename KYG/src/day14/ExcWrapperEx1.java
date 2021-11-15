package day14;

public class ExcWrapperEx1 {

	public static void main(String[] args) {
		int num = 10;
		Integer numi = num;
		//print에 정수를 넣었는데 동작하는 이유 : int형 num이 integer로 오토박싱 되어 실행 가능
		print(num); //print((integer)num);
		print(numi);
		num = 20;
		numi = num; // integer 객체 numi를 num에 오토 언박싱하여 저장
		System.out.println(numi);
		numi = null;
		num = numi; // 예외 발생, null을 정수로 변환할 수 없다.

	}
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}

}
