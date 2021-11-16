package day15;

import java.util.*;

public class ExeListEx4 {

	public static void main(String[] args) {
		/* ������ ������ 5�� �Է¹޾� ����ϴ� �ڵ带 �ۼ��ϼ���.
		 * ��, ����Ʈ �̿�
		 * ���2. ������ ������ ToDo�� �����ϴ� ���*/
		ArrayList<ExeToDo> todoList = new ArrayList<ExeToDo>();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("�ð� : ");
			String time = scan.nextLine();
			System.out.print("���� : ");
			String todo = scan.nextLine();
			//ExeToDo todoObj = new ExeToDo(time, todo);
			//todoList.add(todoObj);
			todoList.add(new ExeToDo(time, todo));
		}
		System.out.println(todoList);
		
		scan.close();
		
	}



}

class ExeToDo {
	String time;
	String todo;
	
	public ExeToDo(String time, String todo) {
		this.time = time; 	this.todo = todo;
	}

	@Override
	public String toString() {
		return "\n���� [�ð� : " + time + ", ���� : " + todo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExeToDo other = (ExeToDo) obj;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (todo == null) {
			if (other.todo != null)
				return false;
		} else if (!todo.equals(other.todo))
			return false;
		return true;
	}
	
	
}



















