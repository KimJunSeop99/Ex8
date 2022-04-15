package ex16;

public class DB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		컨트롤 + 쉬프트 + Y : 소문자바꾸기
//		컨트롤 + 쉬프트 + x : 소문자바꾸기
		DBChild d1 = new DBChild();
		
		d1.connect();
		d1.disconnect();
		d1.work();
	}
}
	