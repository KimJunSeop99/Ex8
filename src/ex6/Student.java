package ex6;

public class Student extends Person {
	public void set() {
		age = 30; // 부모 Person 의 age는 default값이므로 *세팅가능
		name = "홍길동"; // Person 의 public(모두공개)이므로 *세팅가능
		height = 175; // Person(부모)의 자식만 세팅가능 *현재 자식임
//		weight =99; Person(부모)의 private으로 막혀있으므로 *세팅불가능
		setWeight(99); // 메소드를 통해 저장
	}
}
