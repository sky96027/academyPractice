package day17;
import java.util.*;
public class ExeBaseBallEx1 {
	public static void main(String[] args) {
		/* �÷��� �����ӿ�ũ�� �̿��Ͽ� ���� �߱� ������ �����غ�����. */
		//��ǻ�Ͱ� �������� ���� ���� 3�� ����
		//������ ���ڸ� ������ ����Ʈ ���� �� ����
		List<Integer> com = new ArrayList<Integer>();
		List<Integer> use = new ArrayList<Integer>();
		int min = 1, max = 9;
		int count = 3;
		int strike = 0, ball = 0;
		Scanner scan = new Scanner(System.in);
		
		try {
			createRandomList(com, min, max, count);
		}catch(Exception e) {
			System.out.println("============================");
			System.out.println("���� �߻�!! : "+e.getMessage());
			System.out.println("============================");
			System.out.println("���� ������ �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}

		System.out.println(com);
		//�ݺ� : �� ���⶧���� �ݺ� => 3 ��Ʈ����ũ�� �ɶ�����
		while(strike != count) {
			//����ڰ� ���� 3���� �Է�
			int i = 0;
			Set<Integer> useSet = new HashSet<Integer>();
			while(i < count) {
				int tmp = scan.nextInt();
				useSet.add(tmp);
				use.add(tmp);
				i++;
			}
			if(useSet.size() != count) {
				System.out.println("�ߺ��� ���ڸ� �Է��߽��ϴ�.");
			System.out.print("�Է�(�� : 1 2 3) : ");
			int inputResult = inputList(use, min, max, count, scan);
			switch(inputResult) {
			case -1:
				System.out.println("�ߺ��� ���� �Է��߽��ϴ�.");
				break;
			case 1:
				System.out.println("�߸��� ������ ������ �Է��߽��ϴ�.");
				break;
			}
			//��Ʈ����ũ ���� Ȯ��

			//���� ���� Ȯ��

			strike = getStrike(com, use);
			//���� ���� Ȯ�� : ���� ������ ���� - ��Ʈ���� ����
			ball = getBall(com, use);
			//�Ǻ�
			printResult(strike, ball);
		}
		//���α׷� ������ �˸�
		System.out.println("���α׷� ����");
	}
}

	/* ��� : ���� ����Ʈ�� �־����� �ش� ���� ����Ʈ�� min~max ������ ���� �ߺ�����
	 *       �ʰ� count���� �����ϴ� �޼ҵ�
	 * �Ű����� : �־��� ���� ����Ʈ, ���� ����, ������ ���� => 
	 * 			List<Integer> list, int min, int max, int count
	 * ����Ÿ�� : ���� => void
	 * �޼ҵ�� : createRandomList
	 * */
	public static void createRandomList(List<Integer> list, int min, int max, int count) {
		if(list == null) {
			//return ;//����Ʈ �� �� ����
			//����Ʈ�� �� ���� �߻���
			throw new NullPointerException("����Ʈ�� null�Դϴ�.");
		}
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		if(count > max - min + 1) {
			throw new RuntimeException("������ ����Ʈ�� ũ�⺸�� �۾Ƽ� ���� �� �����ϴ�.");
		}
		//�ߺ����� ���� ���ڸ� �����ϱ� ���� �ӽ� set�� ���� �� ����
		Set<Integer> comSet = new HashSet<Integer>();
		//comSet�� 3�� ����ɶ����� �ݺ�
		while(comSet.size() < count) {
			//������ �� ����
			int r = (int)(Math.random() * (max - min + 1) + min);
			//comSet ������ �������� ����
			boolean isSave = comSet.add(r);
			//������ �������� ������ �ƴٸ� com����Ʈ�� �������� ����
			if(isSave) {
				list.add(r);
			}
			/*if(comSet.add(r)) {
				com.add(r);
			}*/
		}
	}
	/* ��� : ���� ����Ʈ�� �־����� �ش� ���� ����Ʈ�� min~max ������ ���� ��ĳ�ʸ� ����
	 *       count�� �Է¹޾� ����� �Է��ߴ����� �˷��ִ� �޼ҵ�
	 *       0 : ����� �Է�, 1 : ���� �߸�, -1 : �ߺ�
	 * �Ű����� : ����Ʈ, ����, ����, ��ĳ�� =>
	 *          List<Integer> list, int min, int max, int count,
	 *          Scanner scan
	 * ����Ÿ�� : 0 �Ǵ� 1 �Ǵ� -1 => ���� => int
	 * �޼ҵ�� : inputList
	 * */
	public static int inputList(List<Integer> list, int min, int max, int count,Scanner scan) {
		if(list == null) {
			throw new NullPointerException("����Ʈ�� null�Դϴ�.");
		}
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		if(count > max - min + 1) {
			throw new RuntimeException("������ ����Ʈ�� ũ�⺸�� �۾Ƽ� ���� �� �����ϴ�.");
		}
		if(scan == null) {
			throw new NullPointerException("scan�� null�Դϴ�.");
		}
		list.clear();
		int i = 0;
		Set<Integer> useSet = new HashSet<Integer>();
		boolean isOutOfBounds = false;
		while(i < count) {
			int tmp = scan.nextInt();
			useSet.add(tmp);
			list.add(tmp);
			//isOutOfBounds = tmp >= min && tmp <= max ? isOutOfBounds : true;
			if(tmp < min || tmp > max) {
				isOutOfBounds = true;
			}
			i++;
		}
		if(useSet.size() != count) {
			return -1;
		}
		//return isOutOfBounds ? 1 : 0;
		if(isOutOfBounds) {
			return 1;
		}else {
			return 0;
		}
	}
	/* ��� : �� ���� ����Ʈ�� �־����� ���� ������ �ִ� ���ڰ� � ������ �˷��ִ� �޼ҵ�
	 * �Ű����� : �� ���� ����Ʈ => List<Integer> list1, List<Integer> list2
	 * ����Ÿ�� : ���� ������ �ִ� ���� �� ���� ������ ���� => ���� => int
	 * �޼ҵ�� : getStrike  
	 * */
	public static int getStrike(List<Integer> list1, List<Integer> list2) {
		int strike = 0;
		for(int i = 0; i<list1.size(); i++) {
			if(list1.get(i).equals(list2.get(i))) {
				strike++;
			}
		}
		return strike;
	}
	/* ��� : �� ���� ����Ʈ�� �־����� �ٸ� ������ �ִ� ���ڰ� � ������ �˷��ִ� �޼ҵ�
	 * �Ű����� : �� ���� ����Ʈ => List<Integer> list1, List<Integer> list2
	 * ����Ÿ�� : �ٸ� ������ �ִ� ���� �� ���� ������ ���� => ���� => int
	 * �޼ҵ�� : getBall  
	 * */
	public static int getBall(List<Integer> list1, List<Integer> list2) {
		int ball = 0;
		for(int i = 0; i<list1.size(); i++) {
			if(list1.contains(list2.get(i))) {
				ball++;
			}
		}
		ball = ball - getStrike(list1, list2);
		return ball;
	}
	public static void printResult(int strike, int ball) {
		if(strike != 0) {
			System.out.print(strike + "S");
		}
		if(ball != 0) {
			System.out.print(ball + "B");
		}
		if(strike == 0 && ball == 0) {
			System.out.print("3O");
		}
		System.out.println();
	}
}
