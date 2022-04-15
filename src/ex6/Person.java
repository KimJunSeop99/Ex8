package ex6;

public class Person {
	private int weight; // 다른 클래스에서 접근 불가
	int age; // default 같은 패키지에 있는 클래스에게만 공개
	protected int height; // 상속 받는 클래스(자식)에게만 공개
	public String name; // 다른 패키지를 포함, 모두 공개
	
	
	// setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	// getter
	public int getWeight() {
		return weight;
	}
}
