package academy;

public class Student extends AcademyPerson {

	private String course; // 수강 과정
	
	public Student() {
		
	}

	public Student(int num, String name, String course) {
//		num, name은 부모쪽에서 초기화
//		course는 현재 자식클래스에서 초기화
		super(num, name);
		this.course = course;
	}

	@Override
	public void display() {
		System.out.println("학생번호 : " + getNum());
		System.out.println("학생이름 : " + getName());
		System.out.println("수강과정 : " + course);
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	
	
	
	
	
	

}
