package day4;

public class ForAlphabetEx2 {

	public static void main(String[] args) {
		/* 'a'부터 'z'까지 출력하는 코드를 for문을 이용하여 작성하세요.
		 * 방법1
		 * 반복횟수 : i는 0부터 26보다 작을때까지 1씩 증가
		 * 규칙성 : 문자 'a'+i를 출력
		 * 방법2
		 * 반복횟수 : ch는 'a'부터 'z'까지 1씩 증가
		 * 규칙성 : ch를 출력
		 * */
		
	    char i = 'a';
		for(i = 'a'; i <= 'z' ; i++ ) {
			System.out.print(i + " ");
		}
		System.out.println();
        int j = 0;
        for(j = 0; j < 26; j++ ) {
    	    System.out.print((char)('a' +j) + " ");
     } 
        
        char ch = 'a';
        for(ch = (int)97; ch < (int)122; ch++);
           System.out.println(ch);
	}

}
