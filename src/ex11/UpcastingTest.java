package ex11;

public class UpcastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p;
//		Student s = new Student("이재문");
		
//		p = s; // 업캐스팅(위로 형변환) 다형성 / 자식에서 부모로
		
		Person p = new Student("이재문");
		Student s;
		
		s = (Student) p; // 다운캐스팅(아래로 형변환) 다형성 / 부모에서 자식으로
		System.out.println(s.name);
		s.grade = "A";
		
	}
}
