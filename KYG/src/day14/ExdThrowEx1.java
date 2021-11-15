package day14;

import java.io.FileNotFoundException;

public class ExdThrowEx1 {

	public static void main(String[] args) {
		//Exception은 RuntimeException의 자손 클래스가 아니기 떄문에 예외를 발생 시키면
		//반드시 예외 처리를 해야함
		//throw new Exception("예외 발생");
		//throw new RuntimeException("런타임 예외 발생");
        //throwException();
        try {
			//throwException2();
        	throwException3(-1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	
	public static void throwException() {
		throw new RuntimeException();
	}
	public static void throwException2() throws Exception {
		throw new Exception();
	}
	public static void throwException3(int num) throws FileNotFoundException, Exception {
		if(num == 0) {
			throw new Exception("num가 0");
		}
		if(num < 0) {
			throw new FileNotFoundException("num는 음수");
		}
		if(num > 0) {
			throw new ArithmeticException("num는 양수");
		}
		
		
	}
}















