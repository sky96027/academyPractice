package day17;

import java.util.*;

public class ExdMapIteratorEx1 {

	public static void main(String[] args) {
		/* Map���� �ݺ����� ����ϴ� ����*/
		Map<String, String> map = new HashMap<String, String>();
		map.put("abc123", "123123");
		map.put("qweqwe", "qweqwe");
		map.put("zzz", "zzzzzz");
		
		//keyset() : �ʿ��� key������ �ϳ��� set���� ������ִ� �޼ҵ�
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
