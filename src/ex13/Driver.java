package ex13;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		interface의 전역 상수 불러올 수 있음
		System.out.println(speekable.zeroPoint);
		System.out.println(speekable.PI);
//		인터페이스를 구현한 메소드를 호출
		Specker reporter = new Specker();
		reporter.sayYes();
	}

}
