package ex10;

public class InstanceOfTest {

//	매개변수에 부모 클래스가 들어오는 메소드를 만드는 것 : 다형성의 목표 *유지보수가 쉽다
//	부모클래스의 메소드와 자식클래스의 메소드가 같으면 : 자식클래스의 메소드를 선택 (오버라이딩)
//	*오버라이딩의 경우가 아니면 형변환을 해주어야 함.
	public static void testAllPhone(Phone p) {
		
		if(p instanceof IPhone) {
//			IPhone iphone = (IPhone)p;    아래 ((IPhone)p).sms(); 와 같음
//			iphone.sms();
			((IPhone)p).sms();
		} else if (p instanceof Galaxy) {
			((Galaxy)p).dmb();
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone p1 = new IPhone();
		Galaxy p2 = new Galaxy();
		
		testAllPhone(p2);
		testAllPhone(p1);
	}
}
