package day15;

public class ExdGenericEx1 {

	public static void main(String[] args) {
		ExdData<Integer> data1 = new ExdData<Integer>(10);
		ExdData<Double> data2 = new ExdData<Double>(1.23);
		ExdData<Double> data3 = new ExdData<Double>(3.14);
		data1.print();
		data2.print();
		if(data3 == data2) {
			System.out.println("�� �����ϰ� ���� ��ü");
		}
		else {
			System.out.println("�� �����ϰ� �ٸ� ��ü");
		}
		//ExdData<String> data4;
		
	}

}
