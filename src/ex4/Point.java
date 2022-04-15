package ex4;

public class Point {
	public int x, y;
	
//	기본생성자 / 생성자는 클래스이름과 동일하다.
	public Point() {
		this.x = 0;
		this.y = 0;
	}
//	매개변수 2개인 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
//	좌표 출력 메소드
	public void showPoint() {
		System.out.println("(" + x + "," + y +")");
	}
	
	
	
	
	
	
	
	
	
}
