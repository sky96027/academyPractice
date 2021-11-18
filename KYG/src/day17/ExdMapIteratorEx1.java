package day17;

import java.util.*;

public class ExdMapIteratorEx1 {

	public static void main(String[] args) {
		/* Map에서 반복문을 사용하는 예제*/
		Map<String, String> map = new HashMap<String, String>();
		map.put("abc123", "123123");
		map.put("qweqwe", "qweqwe");
		map.put("zzz", "zzzzzz");
		
		//keyset() : 맵에서 key값들을 하나의 set으로 만들어주는 메소드
		Set<String> set = map.keySet();
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println("Id : " + key + ", PW : " + value);
		}

	}

}
