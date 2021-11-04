package day6;

public class ArraySortEx1 {

	public static void main(String[] args) {
		//�떎�쓬怨� 媛숈� 諛곗뿴�씠 �엳�쓣 �븣 �젙�젹�븯�뒗 肄붾뱶瑜� �옉�꽦�븯�꽭�슂.
		int num [] = {1, 10, 9, 3, 6, 2, 3, 4};
		/* 踰꾨툝�젙�젹 : �쁿�뿉 �엳�뒗 媛믨낵 鍮꾧탳�븯�뿬 �젙�젹�븯�뒗 諛⑸쾿*/
		for(int i= 0; i < num.length - 1; i++) {
			for(int j = 0; j < num.length - 1; j++) {
				if(num[j] > num[j + 1]) { // 부등호만 바꿔주면 오름차순 내림차순 결정 가능
					//�몢 媛믪쓣 諛붽퓞
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
		}
		for(int tmp : num) {
			System.out.print(tmp + " ");
		}
	}

}
 