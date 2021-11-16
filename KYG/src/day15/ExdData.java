package day15;

public class ExdData<T> {
	T data;
	public void print()	 {
	
		System.out.println(data.getClass().getName() + " : " + data);
	}
	public ExdData(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
