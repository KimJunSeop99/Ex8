package ex4;

public class ColorPoint extends Point {
	public String color; 	// 색상 정보 인스턴스변수
	
//	ColorPoint 생성자 : 매개변수 3개
//	생성자의 목적 : 인스턴스변수 초기화
	public ColorPoint(int x, int y, String color) {
//		부모의 생성자를 호출
		super(x,y);
//		자식의 인스턴스 변수 초기화
		this.color = color;
	}
//	색상 정보와 좌표 정보를 출력하는 메소드
	public void showColorPoint() {
//		자식 인스턴스변수 color 출력
		System.out.print(color);
//		부모 메소드 출력
		showPoint();
	}
	
	
	
}
