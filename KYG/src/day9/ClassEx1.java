package day9;

import java.util.Scanner;

public class ClassEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car(4, "����", "����");
		car1.brand = "���";
		System.out.println("�귣�� : " + car1.brand);
		car1.turnOn();
		//��ü ��� ������ ���� ������������
		Car car2 = new Car(6, "���", "suv");
		System.out.println("�귣�� : " + car2.brand);
		Car car3 = car1;
		System.out.println("�귣�� : " + car3.brand);
		car3.type = "����";
		System.out.println("���� : " + car1.type);
		System.out.println(car1.count + "�ν�");
		//�⺻ �����ڸ� �������� ���� Scanner Ŭ����
		//Scanner scan = new Scanner();
	}

}

class Car {
	//�ڵ����� ���� �� ���õ� ������ => ��� ����
	String brand; 	// ���, ���� ��
	String type; 	// ������, suv, ���� ��
	int count; 		// �ִ� ž�� �ο�
	int power;  	// �õ�
	int speed; 		// �ӷ�
	//�ڵ����� ���õ� ��ɵ� => ��� �޼ҵ�
	//�õ��� �Ѵ� ���
	void turnOn() {
		System.out.println("�׽��ϴ�.");
	}
	//�õ��� ���� ���
	void turnOff() {
		System.out.println("�����ϴ�.");
	}
	//Car(){} //�����ڰ� �ϳ��� ������ �� �ڵ尡 ������ ��
	/*Car(){
		count = 1;
		brand = "";
		type = "����";
		
	}*/
	Car(int count1, String brand1, String type1) {
		count = count1;
		brand = brand1;
		type = type1;
	}
}