package day15;

import java.util.ArrayList;
import java.util.List;

public class ExeListEx1 {

	public static void main(String[] args) {
		/*������ �����ϴ� List�� �����ϴ� ����*/
		List<Integer> list1 = new ArrayList<Integer>();
		int [] arr1 = new int[5];
		arr1[0] = 1;
		list1.add(1);
		arr1[1] = 2;
		list1.add(2);
		System.out.println(arr1[0]);
		//get(index)�� index ������ �ִ� ��ü�� �������� ���
		//get()�� list���� �ְ�, set�� ����
		System.out.println(list1.get(0));
		System.out.println("�迭�� ũ�� : " + arr1.length);
		//size()�� ����� ������ �˷��ִ� ���
		System.out.println("����Ʈ�� ����� ���� : " + list1.size());
		System.out.println(list1);
		//remove(Object obj) : obj�� ��ġ�ϴ� ��ü�� ������ �� ������ ��ü�� �˷���
		//remove(int index) : index ������ �ִ� ��ü�� ������ �� ������ ��ü�� �˷���
		//remove(1)�� �ϸ� 1������ �ִ� ��ü�� ����
		list1.remove((Integer)1);
		System.out.println(list1);
		list1.add(5);
		list1.add(4);
		list1.add(10);
		System.out.println(list1);
		//contains : ����Ʈ�� ��ü�� ��ġ�ϴ� ��ü�� �ִ��� ������ �˷��ִ� ���
		System.out.println(list1.contains(1));
		System.out.println(list1.contains(5));
		//indexOf : ����Ʈ�� ��ü�� ��ġ�ϴ� ��ü�� ������ ������, ������ -1�� �˷��ִ� ���
		System.out.println(list1.indexOf(1));
		System.out.println(list1.indexOf(5));
	}

}
