package ex5;

public class Salesman extends Employee {

	public int record;
	
	public Salesman() {
//		1) 부모의 생성자를 출력 : Employee() 실행
//		2) Salesman() 실행 : 출력
		super();
		System.out.println("Salesman() 실행");
	}
	
	
	public Salesman(int no, String name, int record) {
//		3) 부모의 생성자를 호출 Employee(int , String) 실행 출력
//		4) Salesman(int, String, int) 실행 : 출력
		super(no,name);
		this.record = record;
		System.out.println();
	}
}
