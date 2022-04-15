package academy;

public class AcademyPerson {
	private int num; // 번호
	private String name; // 이름
	
//	기본 생성자
	public AcademyPerson() {
	}
	
//	생성자 (매개변수 2개)
	public AcademyPerson(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
//	학원 직원의 정보를 출력하는 메소드
	public void display() {
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
