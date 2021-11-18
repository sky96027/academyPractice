package day17;

import java.util.*;
import java.util.Map.Entry;

public class ExdMapIteratorEx2 {

	public static void main(String[] args) {
		/* Map���� �ݺ����� ����ϴ� ����
		 * EntryŬ������ �̿��Ͽ� �ݺ����� Ȱ���ϴ� ���
		 * EntryŬ������ ���׸� Ŭ������ �ΰ��� ���� �ʿ�
		 * Entry<A,B>*/
		Map<String, String> map = new HashMap<String, String>();
		map.put("abc123", "123123");
		map.put("qweqwe", "qweqwe");
		map.put("zzz", "zzzzzz");
		/* entryset() : key�� value�� ��������� ���� EntryŬ������ �ְ�,
		 * �� key�� value���� Entry Ŭ������ ��ü�� �ٲ� �� Set�� ��Ƽ� �˷��ִ� �޼ҵ�*/
		Set<Map.Entry<String, String>> set = map.entrySet();
		
		Iterator<Map.Entry<String, String>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, String> e = it.next();
			String key = e.getKey();
			String value = e.getValue();
			System.out.println("Id : " + key + ", PW : " + value);
		}

	}

}
