package day17;

import java.util.*;

public class ExcSetBaseballEx1 {

	public static void main(String[] args) {
		/* 1 ~ 9사이의 중복되지 않은 랜덤한 수 3개를 저장하여 숫자 야구 게임을 만드려고 한다.
		 * 이 때 1 ~ 9 사이의 중복되지 않은 랜덤한 수 3개를 만들어 보세요.*/
		List<Integer> com = new ArrayList<Integer>();
		Set<Integer> tmp = new HashSet<Integer>();
		int min = 1, max = 9;
		while(tmp.size() < 3) {
			int r = (int)(Math.random() * (max - min + 1) + min);
			boolean isAdd = tmp.add(r);
			if(isAdd) {
				com.add(r);
			}
		}
		System.out.println(tmp);
		System.out.println(com);
	}

}
