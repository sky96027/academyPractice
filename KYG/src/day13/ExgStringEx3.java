package day13;

public class ExgStringEx3 {

	public static void main(String[] args) {
		/* int compareTo(String str)
		 *  -equals()와 비슷
		 *  -equals()는 두 문자열이 같은지 다른지만 알려줌
		 *  -compareTo는 두 문자열이 사전순으로 어떻게 되는지 알려줌
		 *  -같으면 0, 다르면 음수, 양수
		 * */
		String str1 = "a";
		String str2 = new String("a");
		String str3 = "b";
		System.out.println(str1 + "은 " + str2 + "보다 사전순으로 " + str1.compareTo(str2));
		System.out.println(str1 + "은 " + str3 + "보다 사전순으로 " + str1.compareTo(str3));
		System.out.println(str3 + "은 " + str1 + "보다 사전순으로 " + str1.compareTo(str1));
		if(str1.compareTo(str2) == 0) {
			System.out.println(str1 + "과" + str2 + "는 같다");
		}
		else {
			System.out.println(str1 + "과" + str2 + "는 다르다");
		}
	}

}
